import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {
   
    int suma = 0;
    
    for(int i = 0; i < mixed.size() ; i++){
      
      if(mixed.get(i) instanceof String){                                        //Usamos mixed.get(i) para acceder al elemento de la posición i y declaramos que para acceder a este If el elemento tiene que ser tipo String
        suma += Integer.parseInt((String)mixed.get(i));                          //instanceof sirve para saber si un objeto es de un determinado tipo.
        
      }else if(mixed.get(i) instanceof Integer){
        suma += (int)mixed.get(i);
      }
    }
		return suma;
	}
}
