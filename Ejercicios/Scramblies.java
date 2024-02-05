import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        HashMap<Character, Integer> st1 = new HashMap<>();
        HashMap<Character, Integer> st2 = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            st1.put(ch, st1.getOrDefault(ch, 0) + 1);                        //Añadimos los datos en el hashMap st1
        }

        for (char ch : str2.toCharArray()) {                                //Añadimos los datos en el hashMap st2
            st2.put(ch, st2.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : st2.entrySet()) {        //Recorremos el st2 hashMap y lo comparamos con el st1 y comprobamos si contiene los char de st2 en st1
            try {                                                           //Try lo usamos para encapsular un conjunto de declaraciones que pueden lanzar excepciones. Si ocurre alguna excepción el control se transfiere al bloque catch.    
                if (entry.getValue() > st1.get(entry.getKey())) {           
                    return false;
                }
            } catch (NullPointerException e) {                              //Usamos Catch para manejaR la excepcion de NullPointerExcepcion, eset último es una excepción que se lanza cuando se intenta acceder a un objeto o invocar un metodo que es null
                return false;
            }
        }

        return true;
    }
}
