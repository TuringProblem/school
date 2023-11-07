/**
*@author override
*@since 11/07/2023
*@see <a href="https://github.com/TuringProblem">GitHub Profile</a>
*/
public class CollegeForLoop_H02 {
   public static void main(String[] args) {
       double trb = 86300;
       double rate = .04;
       int years = 35;
       double total = 0;
       System.out.println("Years\tAMT");
       for (int i = 1; i <= years + 3; ++i) {
         
         trb = trb + trb * rate;
         
         if (i >= years) {
            System.out.println(((i - years) + 1) + "\t" + trb);
            total = total + trb;
         }

      
      }//end for loop
      System.out.printf("$%,1.2f\n", total);
   }//end method
}//end class