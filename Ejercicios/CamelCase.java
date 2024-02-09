public class Solution {

    public static String camelCase(String str) {
      if (str == null || str.isEmpty()) {
            return "";  // Devuelve un array vacio
        }

        String[] words = str.split(" ");
        StringBuilder camelCase = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {  // Salta los espacios vacios
                camelCase.append(Character.toUpperCase(word.charAt(0)))
                          .append(word.substring(1).toLowerCase());
            }
        }

        return camelCase.toString();
    }
}
