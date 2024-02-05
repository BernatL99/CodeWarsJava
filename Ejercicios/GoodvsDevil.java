public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    int sumGood = 0;
    int sumBad = 0;
    String[] goodBuenos = goodAmounts.split("\\s+");
    String[] evilMalos = evilAmounts.split("\\s+");
    
    int[] ComunidadDelAnillo = new int[goodBuenos.length];
    int[] Mordor = new int[evilMalos.length];
    
    for(int i = 0 ; i < goodBuenos.length; i++ ){
      ComunidadDelAnillo[i] = Integer.parseInt(goodBuenos[i]);
    }
    for(int i = 0; i < evilMalos.length; i++){
      Mordor[i] = Integer.parseInt(evilMalos[i]);
    }
    for(int i = 0; i < ComunidadDelAnillo.length; i++){
      if(i==0){
        sumGood += ComunidadDelAnillo[i];
      }if(i==1){
        sumGood = sumGood + (ComunidadDelAnillo[i]*2);
      }if((i==2) || (i==3)){
        sumGood = sumGood + (ComunidadDelAnillo[i]*3);
      }if(i==4){
        sumGood = sumGood + (ComunidadDelAnillo[i]*4);
      }if(i==5){
        sumGood = sumGood + (ComunidadDelAnillo[i]*10);
      }
      
    }
    for(int i = 0; i < Mordor.length; i++){
      if(i==0){
        sumBad += Mordor[i];
      }if((i == 1) || (i==2) || (i==3)){
        sumBad = sumBad + (Mordor[i]*2);
      }if(i == 4){
        sumBad = sumBad + (Mordor[i]*3);
      }if(i == 5){
        sumBad = sumBad + (Mordor[i]*5);
      }if(i == 6){
        sumBad = sumBad + (Mordor[i]*10);
      }
    }
    
    if(sumGood > sumBad){
      String good = "Battle Result: Good triumphs over Evil";
      return good;
    }
    if(sumGood < sumBad){
      String Bad = "Battle Result: Evil eradicates all trace of Good";
      return Bad;
    }
    return "Battle Result: No victor on this battle field";
  }
}
