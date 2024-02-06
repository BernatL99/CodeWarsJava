//Solution of codewars exercise https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java


public class Kata {
  public static int[] sortArray(int[] array) {
    int count = 0;
    for(int i = 0; i < array.length; i++){
      if(array[i] % 2 == 1){
        count++;
        }
      }
      int[] arrImp = new int [count];
      int j = 0;
      for(int x = 0; x<array.length;x++){
        if(array[x] % 2 == 1){
          arrImp[j] = array[x];
          array[x] = -1;
          j++;
        }
      }
      for(int p = 0; p < arrImp.length; p++){
        for(int y = p+1; y < arrImp.length; y++){
          int switcher = 0;
          if(arrImp[p]>arrImp[y]){
            switcher = arrImp[p];
            arrImp[p] = arrImp[y];
            arrImp[y] = switcher;
          }
        }
      }
      int j2 = 0;
      for(int b = 0; b< array.length; b++){
        if(array[b] == -1){
          array[b] = arrImp[j2];
          j2++;
        }
      }
    return array;
  }
}
