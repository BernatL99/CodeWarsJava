public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) {
        int posiciones[][] = new int[3][2];                                                                                                                        //Creamos una matriz con tamaño de x3 e y2
      int cats=0;
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[i].length(); j++) {
                char cat1 = yard[i].charAt(j);
                if (cat1 != '-') {                                                                                                                                 //Indicamos si es diferente a - cuente la cantidad de gatos.
                    posiciones[cats][0]= i;
                  posiciones[cats][1]= j;
                    cats++;                                                                                                                                        
                }
            }
        }
      
      if (cats <= 1){                                                            
        
    return true;                                                                                                                                                //Si solo tenemos un gato devolvemos que la distancia es segura
      } else {
        
        for (int c = 1; c<cats; c++){
         double distancia =0;
      distancia = Math.sqrt(Math.pow(posiciones[c][0]-posiciones[c-1][0],2) +Math.pow(posiciones[c][1]-posiciones[c-1][1],2) );                                //Comparamos las distancias de las posiciones del 0 a 1 y de 1 a 2
         if ( distancia < minDistance){
            return false;
          }
          if (c==2) {
           
        distancia = Math.sqrt(Math.pow(posiciones[c][0]-posiciones[0][0],2) +Math.pow(posiciones[c][1]-posiciones[0][1],2) );                                //Comparamos la distancia de 0 a 2
         }
          if ( distancia < minDistance){
            return false;
          }
            
        }
      }
      
      
      return true;
}
}
