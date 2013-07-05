/* 01 */public class MissNumberFormatException
/* 02 */{
/* 03 */   public static int getVatRate()
/* 04 */   {
/* 05 */     return Integer.parseInt( "19%" );
/* 06 */   }
/* 07 */   public static void main( String[] args )
/* 08 */   {
/* 09 */     System.out.println( getVatRate() );
/* 10 */   }
/* 11 */}