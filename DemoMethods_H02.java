public class DemoMethods_H02 {
   public static void main(String[] args) {
      int num1 = 4, num2 = 12, n;
      double d;
    
      String question = "What is your favorite food: ";
      hello();
      greeting("How are you: ");
      greeting(question);
      System.out.println(add(3, 8));
      System.out.println(add(num1, num2));
      System.out.println(add(num1, 8));
      System.out.println(add(5 * 3, 6 * 2));
//       System.out.println(add(3.5, 8.7));
//       System.out.println(add(1, 8));
      n = add(4, 7);
      d = add(4, 7);
      
      System.out.println(n);
      System.out.println(d);
   }//end main method
   
    public static int add(int n1, int n2) {
       int total = n1 + n2;
       return total;   
    }//end add method
    
    
//       public static double add(int n1, int n2) {
//          return n1 + n2;
//       }
//    was using example above to show the different ways you could potentially use the "add" method
   public static void hello() {
      System.out.println("Hello, world!");
   }//end hello method
   
   public static void greeting(String messagePassed) {
      System.out.println(messagePassed);
   }//end greeting method
  
  
}//end class