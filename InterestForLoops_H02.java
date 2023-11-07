/**
*@author override
*@since 11/07/2023
*@see <a href="https://github.com/TuringProblem">GitHub Profile</a>
*/
public class InterestForLoops_H02 {
   public static void main(String[] args) {
       double balance = 1000;
       double rate = .07;
       int years = 10;
//        for (int i = 1; i <= years; ++i) {
//          
//          balance = balance + balance * rate;
//          System.out.println(i + "\t" + balance);      
//       
//       }//end for loop
       for (int i = 1; i <= years; ++i) {
         
         for(int j = 0; j < 12; ++j) {
          
            balance = balance + balance * rate / 12;
            System.out.println(balance);      
         }//innerloop for 12 times each year.
      
      }//end for loop
   }//end method
}//end class