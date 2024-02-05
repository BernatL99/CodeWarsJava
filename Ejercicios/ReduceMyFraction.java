public class Reduce{
  public static int[] myFraction(int[] A){
      int g = gcd(A[0], A[1]); 
      A[1]/=g; A[0]/=g; 
      return A;
    }
   public static int gcd (int a , int b ) {  
       return b==0?a:gcd(b,a%b);
   }
}
