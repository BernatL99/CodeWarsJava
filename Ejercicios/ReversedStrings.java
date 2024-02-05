public class Kata {
//Solucion de ejercicio https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
  public static String solution(String str) {
    StringBuilder reversed = new StringBuilder(str);
    return reversed.reverse().toString();
  }

}
