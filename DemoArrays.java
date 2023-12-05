import java.util.Arrays;
import java.util.Random;

public class DemoArrays {
   
   public static void main(String[] args) {
   //assign array
   Random RNG = new Random();
   
   
   int[] myArray = new int[6];
   System.out.println(myArray);
   System.out.println(Arrays.toString(myArray));
   Arrays.fill(myArray, -1);
   System.out.println(Arrays.toString(myArray));
//    myArray[0] = RNG.nextInt(10);
//    myArray[1] = RNG.nextInt(10);
//    myArray[4] = 9;
   populateArrayRandomInt(myArray, 10);
   System.out.println(Arrays.toString(myArray));
   //sorting the data passed
   Arrays.sort(myArray);
   System.out.println(Arrays.toString(myArray));
   System.out.println("Min: " + myArray[0]);
   //this is one way of getting the max value of the array
   int n = myArray.length - 1;
   System.out.println("Max: " + myArray[n]);
   
   System.out.println("Max: " + myArray[myArray.length - 1]); // this is the easier way of doing the same functions above
   
   }
   
   //create a method to populate a random number for the Arraylist
   
   public static void populateArrayRandomInt(int[] arrayPassed, int limitPassed) {
      Random RNG = new Random();
      for (int i = 0; i < arrayPassed.length; ++i) {
         // int n = RNG.nextInt(10);
         arrayPassed[i] = RNG.nextInt(limitPassed);
      }
   
   }//end method[]
  
}