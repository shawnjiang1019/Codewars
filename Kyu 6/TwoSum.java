public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
      int [] numarr = new int[2];
      for (int i = 0; i < numbers.length - 1; i++){
        for (int j = i + 1; j < numbers.length; j++){
          if (numbers[i] + numbers[j] == target){
            numarr[0] = i;
            numarr[1] = j;
          }
        }
      }
      return numarr; // Do your magic!
    }
}
