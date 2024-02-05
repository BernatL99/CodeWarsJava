public class Kata {

  public static long divisibleCount(long x, long y, long k) {
    if(x % k != 0){
      x = k * (x/k + 1);
        }
    /*Esta versión ajusta x al próximo múltiplo de k que sea mayor o igual a x
     *solo cuando x no es ya un múltiplo de k.
     *Además, utilizamos Math.max(0,...) para asegurarse que la cuenta no sea negativa en casos
     *en los que no hay múltiplos en el rango.
    */
    return Math.max(0,(y/k) - (x/k) + (x%k == 0 ? 1 : 0));
  }  
}
