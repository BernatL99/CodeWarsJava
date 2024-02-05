import java.util.*;
//Resultado final del trabajo https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      if(arr.isEmpty()){
        return 0;
      }
      int contador = 0;
      String cara = "[:;]([-~]?[)D])";
      for(int i = 0;i < arr.size(); i++){
        if(arr.get(i).matches(cara)){
          contador++;
        }  
     }
      return contador;    
  }
}
