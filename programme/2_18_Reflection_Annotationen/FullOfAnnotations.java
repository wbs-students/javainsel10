import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// path = %PATH%;C:\Program Files\Java\jdk1.6.0\bin
@XmlRootElement
public class FullOfAnnotations
{
  @Resource String string;
  @XmlElement String blab;
}

@XmlRootElement @WebService interface FullOfAnnotations2
{
  @Deprecated void foo( int i );
}

enum NotFullOfAnnotations { }