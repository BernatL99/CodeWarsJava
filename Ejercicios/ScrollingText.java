public class Kata {
    public static String[] scrollingText(String text) {
      text = text.toUpperCase();                                              //Usamos toUpperCase() para convertir el String en mayusculas
      int longitud = text.length();                                           //Creamos la variable longitud para saber el tamaño del String recibido
      String[] rotacion = new String[longitud];                               //Definimos el tamaño del array
      
      for(int i = 0; i < longitud ; i++){
        rotacion[i]= text.substring(i) + text.substring(0, i);                //text.substring(i) Esta parte obtiene una subcadena de la cadena original comenzando desde (i)
      }                                                                       //cadena.substring(0,i) Esta parte obtiene una subcadena desde el principio  de la cadena hasta la posicion (i - 1) 
                                                                              //La convinacion de estas dos últimas combina las dos subcadenas obtenidas ateriormente y las asigna a la posicion (i) del array
      return rotacion;
    }
}
