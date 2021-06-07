public class Kata {
  public static String highAndLow(String numbers) {
    String [] arr = numbers.split(" ");
    
    int [] numarr = new int[arr.length];
    
    for (int i = 0; i < arr.length; i++){
      numarr[i] = Integer.parseInt(arr[i]);
    }
    
    int smallest = numarr[0];
    int largest = numarr[0];
    for (int i = 0; i < numarr.length; i++){
      if (numarr[i] > largest){
        largest = numarr[i];
      }
      
      if (numarr[i] < smallest){
        smallest = numarr[i];
      }
    }
    return largest + " " + smallest;
  }
}
