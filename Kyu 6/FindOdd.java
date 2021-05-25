public class FindOdd {
  public static int findIt(int[] a) {
    int odd = 0;
    int highest = 0;
    int count = 0;
    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a.length; j++){
        if (a[j] == a[i]){
          count++;
        }
      }
      if (count % 2 == 1){
        return a[i];
      }
      count = 0;
      
      
    }
    return odd;
  }
}
