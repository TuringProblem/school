/**
 * Author: @Override
 * Date: 11/2/2023
 */

public class Perfect_AW {
    public static void main(String[] args){
        int sum;

        //initialize the for loop
        for (int n = 1; n <= 1000; ++n) {
            sum = 0;
            for (int i = 1; i < n; ++i) {
                if (n % i  == 0) {
                    sum = sum + i;
                }
            }

                if (sum == n) {
                    System.out.printf("You have a Perfect Number: %,3d \n", n);
                }

        }

    }
}
