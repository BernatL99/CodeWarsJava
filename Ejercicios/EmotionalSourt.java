public class Solution {

    public static String[] sortEmotions(boolean order,String[] emotions) {
      String[] array = {"T_T", ":D" ":|", ":)", ":("};
      HashMap<String, Integer> mapa1 = new HashMap<String, Integer>();
      int j = 1;
      for(int i = 0; i<array.length; i++){
        mapa1.put(i, j);
        j++;
      }
      boolean ordenado = false;
      while(!ordenado){
        ordenado = true;
        for(int x = 0; x < emotions.length;x++){
          if(mapa1.get(emotions[x+1]) < mapa1.get(emotions[x])){
            String temp = emotions[x+1];
            emotions[x+1] = emotions[x];
            emotions[x] = temp;
            ordenado = false;
          }
        }
      }
      if(!order){
        String[] OrdenAscendente = new String[emotions.length];
        for(int n = emotions.length -1; n >= 0; n--){
          OrdenAscendente[emotions.length -1 -j] = emotions[j];
        }
        emotions = OrdenAscendente;
      }
        
        return emotions;
    }

}
