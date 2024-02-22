import java.util.HashMap;
import java.util.Map;
public class Solution {

  public static String[] sortEmotions(boolean order,String[] emotions) {
    HashMap<String, Integer> valorCaras = new HashMap<>();
    valorCaras.put("T_T", 1);
    valorCaras.put(":( ", 2);
    valorCaras.put(":| ", 3);
    valorCaras.put(":)", 4);
    valorCaras.put(":D", 5);
      
    if(!order){
      for(int i = 0; i<emotions.length-1; i++){
        for(int j = i+1; j<emotions.length-2; j++){
          if(valorCaras.get(emotions[j])>valorCaras.get(emotions[j+1])){
            String cambio = emotions[j+1];
            emotions[j+1] = emotions[j];
            emotions[j] = cambio;
          }
        }
      }
    }
    else{
      for(int i = 0; i<emotions.length-1; i++){
        for(int j = 0; j<emotions.length-2; j++){
          if(valorCaras.get(emotions[j])<valorCaras.get(emotions[j+1])){
            String cambio = emotions[j+1];
            emotions[j+1] = emotions[j];
            emotions[j] = cambio;
          }
        }  
      }
    }
    return emotions;
  }
}
