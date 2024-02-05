import java.util.Arrays;

public class Order {
  public static String order(String words) {
    
    String[] orden = words.split("\\s+");
    String orden1 = "";
    for(int i =1; i <= orden.length;i++){
      for(String w: orden){
        if(w.contains(""+i)){
          orden1+=w+" ";
        }
      }
    }

    
    
    return orden1.trim();
  }
}
