

public class MyJavaMethodMain extends MyJavaMethods {

   public static void main(String[] args) {
      MyJavaMethods.method1();
    
     // MyJavaMethods.method2();
      
      MyJavaMethods.method3();
      
//      MyJavaMethods.method4(); how would I implement this? Need to make an instance of the class


      MyJavaMethods Fred = new MyJavaMethods();
      Fred.method4();
      Fred.method5();
      
      
      MyJavaMethods.method6();
 
   }//end main method
}//end class