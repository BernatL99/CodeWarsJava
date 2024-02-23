//Solution of exercice from CodeWars https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
public class Solution {

  public static boolean validatePin(String pin) {
    if((pin.matches("[0-9]{4}"))|| (pin.matches("[0-9]{6}"))){
      return true;
    }
    return false;
  }

}
