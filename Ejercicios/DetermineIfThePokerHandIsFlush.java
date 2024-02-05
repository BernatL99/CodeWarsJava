public class Kata{
  public static boolean CheckIfFlush(String[] cards){
    int CountH = 0;
    int CountS = 0;
    int CountD = 0;
    int CountC = 0;
    
    for(int i = 0; i < cards.length; i++){
      if(cards[i].contains("H")) CountH++;
      if(cards[i].contains("S")) CountS++;
      if(cards[i].contains("D")) CountD++;
      if(cards[i].contains("C")) CountC++;
      
      if(CountH == 5 || CountS == 5 || CountD == 5 || CountC == 5) return true;
    }
      
     return false; 
  }
}
