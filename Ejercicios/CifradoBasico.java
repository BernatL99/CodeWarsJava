// Ejercicio completado de Codewars https://www.codewars.com/kata/5862fb364f7ab46270000078/train/java
public class BasicEncrypt {

    public String encrypt(String text, int rule) {
      if(rule > 255){
        rule = rule - 256;
      }
       String encript = "";
       for(int i = 0; i < text.length(); i++){
         char letra = text.charAt(i);
         int AsciNum = (int) letra;
         AsciNum = AsciNum + rule;
         if(AsciNum > 255){
           AsciNum = AsciNum - 256;
         }
         letra = (char) AsciNum;
         encript += letra;
       } 
      return encript;
    }
}
