public class Kata{
  public static int dontGiveMeFive(int start, int end){
    //ans es el contador
    int ans = 0;
    for (int i = start; i <= end; i++) {
      if (!("" + i).contains("5")) ans++;                      // Usamos ! para definir que tiene que ser lo contrario
    }                                                          // Hacemos ("" + i) para convertir lo sacado de i en un string
    return ans;                                                // Añadimos .contains("5") para que encuemtre cualquier numero con un 5.
  }
}
