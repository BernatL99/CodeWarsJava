public class StringUtils {
  
  public static boolean isHexNumber(String s) {
    if( s.matches( "(0[xX])?[0-9a-fA-F]+")  )
    {
      return true;
    }
    return false;
  }
}
