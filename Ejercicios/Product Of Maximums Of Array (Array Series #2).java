public class Solution
{
    public static long maxProduct(int[] numbers, int sub_size)
    {
      for(int i = 0; i < numbers.length; i++){
        for(int j = i +1; j < numbers.length; j++){
          int mover = 0;
          if (numbers[j] < numbers[i]){
            int mov = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = mov;
          }
        }
      }
      long multi = 1;
      for(int x = numbers.length -1, num = 1; num <= sub_size; x--, num++){
        multi =(long) multi*numbers[x];
      }
        return multi;
    }
}
