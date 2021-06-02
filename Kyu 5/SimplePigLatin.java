public class PigLatin {
    public static String pigIt(String str) {
      String result = "";
      
      String [] words = str.split(" ");
      String holder = " ";
      for (int i = 0; i < words.length; i++){
        if (words[i].equals("!") || words[i].equals("?")){
          holder = words[i];
        }
        else{
          holder = words[i].substring(1) + words[i].substring(0, 1) + "ay";
        }
        
        words[i] = holder;
        result = result + holder + " ";
        holder = "";
      }
      
      result = result.substring(0, result.length() - 1);
      return result;  
    }
}
