public class MyJavaMethods {
   public static void method1() {
      System.out.println("Method1");
   }
   
   private static void method2() {
   System.out.println("Method2");
   }
   public static void method3() {
   System.out.println("Method3");
   method2();
   }
   
   public void method4() {
   System.out.println("Method 4");
   }
   
   public void method5() {
   System.out.println("Method5");
   method4();
   }
   public static void method6() {
   MyJavaMethods John = new MyJavaMethods();
   System.out.println("Method6");
   John.method5();
   }
   


}//end class