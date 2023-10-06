import java.util.Scanner;

public class squirrels_aW {
   public static void main(String[] args) {
      int sQ1, sQ2, sQ3, sQ4, sQ5, n, pile, chipMunk;
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter the amount of ");
      n = keyboard.nextInt();
      pile = 12495 + (15625 * n);
      chipMunk = 0;

      //create algorithm for sq1,2,3,4,5 then --pile, and ++chipmunk

      sQ1 = pile / 5;
      pile = pile - sQ1;
      --pile;
      ++chipMunk;
      System.out.println("Squirrel 1 has: " + sQ1);
      System.out.println("There are " + pile + " in the new pile.");

      sQ2 = pile / 5;
      pile = pile - sQ2;
      --pile;
      ++chipMunk;
      System.out.println("Squirrel 2 has: " + sQ2);
      System.out.println("There are " + pile + " in the new pile.");

      sQ3 = pile / 5;
      pile = pile - sQ3;
      --pile;
      ++chipMunk;
      System.out.println("Squirrel 3 has: " + sQ3);
      System.out.println("There are " + pile + " in the new pile.");

      sQ4 = pile / 5;
      pile = pile - sQ4;
      --pile;
      ++chipMunk;
      System.out.println("Squirrel 4 has: " + sQ4);
      System.out.println("There are " + pile + " in the new pile.");

      sQ5 = pile / 5;
      pile = pile - sQ5;
      --pile;
      ++chipMunk;
      System.out.println("Squirrel 5 has: " + sQ5);
      System.out.println("There are " + pile + " in the new pile.");

      pile = pile % 5;

      System.out.println("There is only " + pile + " left over after splitting between each other.");

      --pile;
      ++chipMunk;

      System.out.println("Lazy chipmunk is happy with his " + chipMunk + " nuts :)");

   }//end main

}//end class
