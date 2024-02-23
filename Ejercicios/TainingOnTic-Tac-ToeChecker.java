//Taining on Tic-Tac-Toe Checker of CodeWars https://www.codewars.com/kata/525caa5c1bf619d28c000335/train/java
//I use this video for help to finish this exercice https://www.youtube.com/watch?v=xvFZjo5PgG0
public class Solution {

    public static int isSolved(int[][] board) {
        int player1Count = 0;
        int player2Count = 0;
      //revisamos si gana el jugador 1
        for(int i = 0; i < board.length; i++){
          player1Count = 0;
          for(int j = 0; j < board[i].length; j++){
            //recorremos filas
            if(board[i][j] == 1){
              player1Count++;
              if(player1Count == 3){
                return 1;
              }
            }
          }
        }
      player1Count = 0;
      //recorremos las columnas
      for(int j = 0; j < board[0].length;j++){
        player1Count = 0;
        for(int i = 0 ; i < board.length; i++){
          if(board[i][j]==1){
            player1Count++;
            if(player1Count == 3){
              return 1;
            }
          }
        }
      }
      player1Count = 0;
      //recorremos en diagonal
      for(int i = 0, j = 0; (i < board.length) && (j < board[i].length); i++, j++){
          if(board[i][j]==1){
            player1Count++;
            if(player1Count == 3){
              return 1;
            }
          }
        }
      player1Count = 0;
      //recorremos diagonal invertido
      for(int i = board.length -1, j = 0; (i >= 0) && (j < board[i].length); i-- , j++){
          if(board[i][j]==1){
            player1Count++;
            if(player1Count == 3){
              return 1;
            }
          }
        }
      //revisamos si gana el jugador 2
        for(int i = 0; i < board.length; i++){
          player2Count = 0;
          for(int j = 0; j < board[i].length; j++){
            //recorremos filas
            if(board[i][j] == 2){
              player2Count++;
              if(player2Count == 3){
                return 2;
              }
            }
          }
        }
      player2Count = 0;
      //recorremos las columnas
      for(int j = 0; j < board[0].length;j++){
        player2Count = 0;
        for(int i = 0 ; i < board.length; i++){
          if(board[i][j]==2){
            player2Count++;
            if(player2Count == 3){
              return 2;
            }
          }
        }
      }
      player2Count = 0;
      //recorremos en diagonal
      for(int i = 0, j = 0; (i < board.length) && (j < board[i].length); i++, j++){
          if(board[i][j]==2){
            player2Count++;
            if(player2Count == 3){
              return 2;
            }
          }
        }
       player2Count = 0;
      //recorremos diagonal invertido
      for(int i = board.length -1, j = 0; (i >= 0) && (j < board[i].length); i-- , j++){
          if(board[i][j]==2){
            player2Count++;
            if(player2Count == 3){
              return 2;
            }
          }
        }
      //revisamos que a la partida le queden movimientos
      for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[i].length; j++){
            //recorremos filas
            if(board[i][j] == 0){
              return-1;
            }
          }
      } 
      return 0;
    }
}
