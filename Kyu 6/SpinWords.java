public class SpinWords {
// test just for 0ne word then expand 

  public String spinWords(String sentence) {
    String result = "";
    String reversedWord = "";
    //Split the sentence into a String array of words
    String [] strarr = sentence.split(" ");
 
    //Check to see if the word has 5 or more letters, if they do then reverse the word

    for (int i = 0; i < strarr.length; i++){
      
      if (strarr[i].length() >= 5){
        //Reverses the word and inserts it back into the array
        for (int j = strarr[i].length() - 1; j >= 0; j--){
          reversedWord = reversedWord + strarr[i].charAt(j);
        }
        strarr[i] = reversedWord;
      }
      //empty reveredWord 
      reversedWord = "";
    }

    // Reconstruct the sentence once words are reversed
    
    for (int i = 0; i < strarr.length; i++){
      if (i == strarr.length - 1){
        result = result + strarr[i];
      }

      else{
        result = result + strarr[i] + " ";
      }
    }
    return result;
     
  }
}
