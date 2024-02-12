import java.util.HashMap;
import java.util.Map;

public class Conversion {

    public String solution(int n) {
      String numRom = "";
      Map <Integer, String> Roman = new HashMap<>();
      Roman.put(1, "I");
      Roman.put(4, "IV");
      Roman.put(5, "V");
      Roman.put(9, "IX");
      Roman.put(10, "X");
      Roman.put(40, "XL");
      Roman.put(50, "L");
      Roman.put(90, "XC");
      Roman.put(100, "C");
      Roman.put(400, "CD");
      Roman.put(500, "D");
      Roman.put(900, "CM");
      Roman.put(1000, "M");
      while(n>0){
        if(n > 1000){
          numRom += Roman.get(1000);
          n = n-1000;
        }else if((n > 1000) && (n>= 900)){
          numRom +=Roman.get(900);
          n = n-900;
        }else if((n < 900 && n >= 500)){
          numRom += Roman.get(500);
          n = n-500;  
        }else if((n < 500) && (n >= 400)){
          numRom += Roman.get(400);
          n = n-400;
        }else if((n < 400) && (n>=100)){
          numRom += Roman.get(100);
          n = n-100;
        }else if((n < 100)&&(n >= 90)){
          numRom += Roman.get(90);
          n = n-90;
        }else if((n < 90) && (n>=50)){
          numRom += Roman.get(50);
          n = n-50;
        }else if((n < 50) && (n >= 40)){
          numRom += Roman.get(40);
          n = n-40;
        }else if((n < 40) && (n >= 10)){
          numRom += Roman.get(10);
          n = n-10;
        }else if(n == 9){
          numRom += Roman.get(9);
          n = n-9;
        }else if((n< 9) && (n >= 5)){
          numRom += Roman.get(5);
          n = n-5;
        }else if(n == 4){
          numRom += Roman.get(4);
          n = n-4;
        }else if((n < 4) && (n >= 1)){
          numRom += Roman.get(1);
          n = n-1;
        }
      }
        return numRom;
    }
}
