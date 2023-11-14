public class DemoEncrypt_H02 {
   public static void main(String[] args) {
  
   System.out.println(hashTotal("ABC"));
   System.out.println(hashTotal(""));
  
   
   }//end main
   
   public static int hashTotal(String stringPassed) {
      int total = 0;
      if (stringPassed.length() == 0) {
         return -1;
      }
      for (int i = 0; i < stringPassed.length(); ++i) {
         total = total + stringPassed.charAt(i);
      }   
      return total;
      
   }//end hashTotal method
}//end class