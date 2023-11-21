public class MyMathMethods {
   public static double mult(int n1, int n2) {
      System.out.println("int, int");
      return n1 * n2;
   }
   public static double mult(int n1, int n2, int n3) {
      System.out.println("int, int, int");
      return n1 * n2 * n3;
   }
   public static double mult(double n1, double n2) {
      System.out.println("double, double");
      return n1 * n2;
   }

   public static double mult(double n1, double n2, double n3) {
      System.out.println("double, double, double");
      return n1 * n2 * n3;
   }
   public static double add(double n1, int n2) {
      System.out.println("double, int");
      return n1 + n2;
   }
   public static double add(int n1, double n2) {
      System.out.println("int, double");
      return n1 + n2;
   }

}//end class