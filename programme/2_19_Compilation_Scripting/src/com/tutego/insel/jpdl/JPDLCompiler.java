package com.tutego.insel.jpdl;

import java.net.URL;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class JPDLCompiler
{
  private String className;

  public String getClassName()
  {
    return className;
  }

  public String generateSourceForProcessDefinition( URL source ) throws Exception
  {
    Element rootElement = new SAXBuilder().build(source).getRootElement();
    className = "ProcessDefinition_" + rootElement.getAttributeValue( "name" ).replaceAll( "\\W", "" );
    StringBuilder result = new StringBuilder( "public class " ).append( className )
                             .append( " implements com.tutego.insel.jpdl.ProcessDefinition {\n" )
                             .append( " java.util.logging.Logger log = java.util.logging.Logger.getLogger( getClass().getName() );\n" )
                             .append( " org.jbpm.graph.exe.ExecutionContext executionContext;\n" );
    for ( Object node : rootElement.getChildren() )
    {
      String name = ((Element) node).getAttributeValue( "name" ).replaceAll( "\\W", "" );
      if ( "start-state".equals( ((Element) node).getName() ) )
        result.append( "@Override public void start(org.jbpm.graph.exe.ExecutionContext executionContext) throws Exception {\n" )
        .append( " this.executionContext = executionContext;\n _" )
        .append( name ).append( "();\n}\n" );

      result.append( "void _" ).append( name ).append( "() throws Exception\n{\n"  )
            .append( " log.info(\"Start\");\n" );
      for ( Object transition : ((Element) node).getChildren() )
      {
        String to = ((Element) transition).getAttributeValue( "to" ).replaceAll( "\\W", "" );
        if ( ((Element) transition).getChild( "action" ) != null )
        {
          String actionName = ((Element) transition).getChild( "action" ).getAttributeValue( "class" );
          result.append( " new " ).append( actionName ).append( "().execute(executionContext);\n" )
                .append( " _").append( to ).append( "();\n" );
        }
        else if ( ((Element) transition).getChild( "condition" ) != null )
        {
          String condtionExpr = ((Element) transition).getChild( "condition" ).getAttributeValue( "expression" );
          condtionExpr = condtionExpr.replaceAll( "\\p{Alpha}+",
                           "Double.parseDouble(executionContext.getVariable(\"$0\").toString())" );
          result.append( " if (" ).append( condtionExpr ).append( ")\n { _" )
                .append( to ).append( "(); return; }\n" );
        }
      }
      if ( "decision".equals( ((Element) node).getName() ) )
        result.append( " throw new IllegalStateException();\n" );
      result.append( "}\n" );
    }
    return result.append( "}" ).toString();
  }
}
