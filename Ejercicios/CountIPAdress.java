public class CountIPAddresses {

	public static long ipsBetween(String start, String end) {
    long count = 0;
    String[] separacionStart = start.split("\\.");
    String [] separacionEnd = end.split("\\.");
    long Ip1Start = Long.parseLong(separacionStart[0]);
    long Ip2Start = Long.parseLong(separacionStart[1]);
    long Ip3Start = Long.parseLong(separacionStart[2]);
    long Ip4Start = Long.parseLong(separacionStart[3]);
    
    long Ip1End = Long.parseLong(separacionEnd[0]);
    long Ip2End = Long.parseLong(separacionEnd[1]);
    long Ip3End = Long.parseLong(separacionEnd[2]);
    long Ip4End = Long.parseLong(separacionEnd[3]);
    
    while((Ip1Start <= Ip1End) && (Ip2Start <= Ip2End) && (Ip3Start <= Ip3End) && (Ip4Start <= Ip4End)){
      Ip4Start++;
      if(Ip4Start > 256){
        Ip3Start++;
        Ip4Start = 0;
      }if(Ip3Start > 256){
        Ip2Start++;
        Ip3Start = 0;
      }if(Ip2Start > 256){
        Ip1Start++;
        Ip2Start = 0;
      }
      count++;
    }
    return count;
	}
}
