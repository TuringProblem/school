import java.util.Scanner;


public class DemoDog_H02 {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      Scanner keyboard = new Scanner(System.in);
      //System.out.println(d1.name);
      //d1.age = 99;
      System.out.println(d1.getName());
      //System.out.println
      d1.setAge(41);
      System.out.println("Age: " +d1.getAge());
      System.out.println(d1);
      
      //.toString() is inherited from the super class Object.
      System.out.println(d1.toString());
      //instanciating new instance variables for the non-default method created
      Dog d3 = new Dog("Fluffy", 10, true);
      Dog d4 = new Dog("Killer", 1, false);
      
      System.out.println(d3.toString());
      System.out.println(d4.toString());
      
      //doing this will take the address and put it in to d3, which will make d3, and d4 point to the same place.
      d3 = d4;
      System.out.println(d3.toString());
      System.out.println(d4.toString() + "\n");
      
      if (d3 == d4) {
         System.out.println("Same");
      }
      
      //using setter to change the name of "Killer" to "Chicken dog"
      d4.setName("Chicken Dog");
      System.out.println(d4.toString() + "\n");

      Dog d2 = new Dog("Champ", 9, true);
      //Dog d5 = new Dog("Chump", 19, false);
      Dog d5 = new Dog("Champ", 9, true);
      
      System.out.println(d2.equals(d5));
      
      //equals is looking at the addresses, so just like how we did toString() we need to make an equals() method as well
      
      Dog d6 = new Dog("Lassie", 55, true);
      System.out.println(d6.toString() + "\n");
      d6.bark();
      
      
   }//end main method

}//end class