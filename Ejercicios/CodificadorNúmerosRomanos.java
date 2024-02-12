import java.util.HashMap;
import java.util.Map;

public class Conversion {

    public String solution(int n) {
        String numRom ="";
        Map<Integer, String> romanMap = new HashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
       
        while(n >= 1000){
          numRom += romanMap.get(1000);
          n = n - 1000;
        }
        while((n >= 900) && (n < 1000)){
          numRom += romanMap.get(900);
          n = n - 900;
        }
      while((n > 500) && (n < 900)){
          numRom += romanMap.get(500);
          n = n - 500;
        }
      while((n >= 400) && (n < 500)){
          numRom += romanMap.get(400);
          n = n - 400;
        }
      while((n >= 100) && (n < 400)){
          numRom += romanMap.get(100);
          n = n - 100;
        }
      while((n >= 90) && (n < 100)){
          numRom += romanMap.get(90);
          n = n - 90;
        }
      while((n >= 50) && (n < 90)){
          numRom += romanMap.get(50);
          n = n - 50;
        }
      while((n >= 40) && (n < 50)){
          numRom += romanMap.get(40);
          n = n - 40;
        }
      while((n >= 10) && (n < 40)){
          numRom += romanMap.get(10);
          n = n - 10;
        }
      while(n == 9){
          numRom += romanMap.get(9);
          n = n - 9;
        }
      while((n >= 5) && (n < 9)){
          numRom += romanMap.get(5);
          n = n - 5;
        }
      while(n == 4){
          numRom += romanMap.get(4);
          n = n - 4;
        }
      while(n >= 1 && n < 5){
          numRom += romanMap.get(1);
          n = n - 1;
        }
        return numRom;
    }
}
