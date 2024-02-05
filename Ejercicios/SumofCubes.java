// This exercise is the solution of https://www.codewars.com/kata/59a8570b570190d313000037/train/java
public class Solution{
  public static long sumCubes(long n)
  {
    long resultado = 0;
    for(long i = 1 ; i <= n; i++){
      resultado = resultado + ((long) Math.pow(i , 3));
    }
    return resultado;
  }
}
