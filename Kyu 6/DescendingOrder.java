public class DescendingOrder {
  public static int sortDesc(int num) {
    int result = 0;
    int count = 1;
    int holder = num;
    int holder2 = num;
    int  temp = 0;
    // Create array to hold digits of number
    while (holder >= 10){
      count++;
      holder = holder / 10;
    }
    
    int[] digits = new int[count];
    // Add digits
    for (int i = 0; i < digits.length; i++){
      
      digits[i] = holder2 % 10;
      holder2 = holder2 / 10;
    }
    // Sort array in descending order
    for (int i = 0; i < digits.length; i++) {     
      for (int j = i + 1; j < digits.length; j++) {     
         if(digits[i] <= digits[j]) {    
            temp = digits[i];    
            digits[i] = digits[j];    
            digits[j] = temp;    
        }     
      }     
    }
    
    String str = "";
    for (int s : digits){
      str += s; 
    }
    
    result =Integer.parseInt(str);
    
    return result;
  }
}
