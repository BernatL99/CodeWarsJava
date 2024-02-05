public class Snail {

    public static int[] snail(int[][] array) {
      int m = array.length;
      int n = array[0].length;

      int[] resultado = new int[m * n];                                  //Creamos un nuevo array con la longitud de la matriz
      int index = 0;                                                     //Creamos la variable index que será la encargada de recorrer el array resultado

      int inicioFila = 0, finFila = m - 1;                               //Marcamos el principio y el final de la matriz
      int inicioColumna = 0, finColumna = n - 1;                         //Marcamos el principio y el finakl de las columnas

       while (inicioFila <= finFila && inicioColumna <= finColumna) {    //El bucle solo durará siempre que el inicio de fila sea menor o igual que el final y que el inicio de columna sea menor o igual que el final e la columna.
          // Recorrer hacia la derecha
          for (int i = inicioColumna; i <= finColumna; i++) {            //Empezamos a recorrer la columna, i es igual a inicio de columna que es 0 
                resultado[index++] = array[inicioFila][i];               //Añadimos el número en el array resutado, en la matriz indicamos que la posicion es array[inicioFila][i], i es el que nos recorre ma matriz hacia la derecha.
          }
          inicioFila++;                                                  //Sumamos uno a la fila para que al cambiar de dirección no vuelva a recoger el dato anterior

            // Recorrer hacia abajo
          for (int i = inicioFila; i <= finFila; i++) {                  //Hacemos lo mismo que en el for anterior, pero esta vez recoreremos la fila en vez de la columna.
                resultado[index++] = array[i][finColumna];
          }
          finColumna--;                                                  //Restamos 1 a columna paraposicionarnos de nuevo en una posicón aún no comprobada.

          // Recorrer hacia la izquierda
          if (inicioFila <= finFila) {                                  //Si inicioFila es menor o igual al finFila, entraremos en el siguientre bucle
              for (int i = finColumna; i >= inicioColumna; i--) {       //Es el como el primer for pero ahora restamos
                    resultado[index++] = array[finFila][i];
              }
              finFila--;                                               //Restamos uno a la fila para no recoger el dato ya añadido
          }

          // Recorrer hacia arriba
          if (inicioColumna <= finColumna) {                         //Si inicioColumna es menor o igual a finColumna entramos en el siguiente bucle
              for (int i = finFila; i >= inicioFila; i--) {
                    resultado[index++] = array[i][inicioColumna];    //Lo mismo que en el anterior bucle par ahora recorremos las filas al reves.
              }
              inicioColumna++;
          }
      }

        return resultado;
    }
}
