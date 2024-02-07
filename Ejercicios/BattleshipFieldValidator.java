//Prueba de ejercicio de Codewars
//Aún no está terminado,
public class BattleField {
    
    public static boolean fieldValidator(int[][] field) {
      int acorazado = 0, crucero = 0, destructor = 0, submarino = 0;
      
      for(int i = 0; i < field.length; i++){
        for(int j = 0 ; j < field[i].length; j++){
          
          //Encontrar acorazado de manera orizontal
          if((field[i][j] == 1) && (j - field.length >= 4)){
            int count = 0;
            count = field[i][j] + field[i][j+1] + field[i][j+2]+ field[i][j+3];
            if(count == 4)acorazado++;
          }else if((field[i][j] == 1) && (i - field.length >= 4)){
            int count = 0;
            count = field[i][j] + field[i+1][j] + field[i+2][j]+ field[i+3][j];
            if(count == 4)acorazado++;
        }
      }
    }
  }  
  return false;
}
