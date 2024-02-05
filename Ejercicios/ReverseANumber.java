public class ReverseNumber {

	public static int reverse(int number) {
    int numEntero = 0;
		String Normal = Integer.toString(number);
    if(number > -10 && number < 10){
      return number;
    }
    if(number >= 10){
      String invertida = "";
      for(int i = Normal.length() -1; i >= 0; i--){
      invertida += Normal.charAt(i);
      }
      numEntero = Integer.parseInt(invertida);
    }else if(number < -9){
      String invertida = "-";
      for(int j = Normal.length() -1; j >=1 ; j--){
        invertida += Normal.charAt(j);
      }
      numEntero = Integer.parseInt(invertida);
    }
    return numEntero;
    
	}

}
