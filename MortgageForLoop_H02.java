/**
*@author override
*@since 11/07/2023
*@see <a href="https://github.com/TuringProblem">GitHub Profile</a>
*/
public class MortgageForLoop_H02 {
   public static void main(String[] args) {
       double balance = 500000;
       double monthlyPayment = 3360.16;
       double totalInterest = 0;
       double appliedToBalance, appliedToInterest;
       double rate = .071;
       System.out.println("Years\tAMT");
       for (int i = 1; i <= 30; ++i) {
         for (int j = 0; j < 12; ++j) {
            appliedToInterest = balance * rate / 12;
            appliedToBalance = monthlyPayment - appliedToInterest;
            balance = balance - appliedToBalance;
            totalInterest = totalInterest + appliedToInterest;
            System.out.println(appliedToInterest + "\t" + appliedToBalance + "\t"  + balance);
         }     
      }//end for loop
      System.out.printf("$%,1.2f\n", totalInterest);
   }//end method
}//end class