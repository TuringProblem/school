public class Dog {
   
   //instance variables
   private String name;
   private int age;
   private boolean intact;
   
  //default constructor
   public Dog() {
      this.name = "unknown";
      this.age = 0;
      this.intact = true;   
   }//end method
   
   //non-default constructor
   public Dog(String namePassed, int agePassed, boolean intactPassed) {
   
   //need to have the constructor go through the setter, in order to keep all the same (not over 32)
      this.setName(namePassed);
      // this.name = namePassed;
      this.setAge(agePassed);
      this.setIntact(intactPassed);
   }//end method
   

   //getters
   public String getName() {
      return this.name;
   }
   
   public int getAge() {
      return this.age;
   }
   
   public boolean getIntact() {
      return this.intact;
   }
   //end getters
   
  
   //setters
   public void setName(String namePassed) {
      this.name = namePassed;
   }
   
   public void setAge(int agePassed) {
   //using if statement in the method here to make sure that they do not do anything over 32 and less than 0.
      if (agePassed < 0 || agePassed > 32) {
         System.out.println("Invalid age, age will be set to 0");
         agePassed = 0;
      }
      this.age = agePassed;
   }
   
   public void setIntact(boolean intactPassed) {
      this.intact = intactPassed;
   }
   //end setters
   
   //toString overriding the toString method inherited from the class Object
   public String toString() {
   return
   "\nName: " + this.getName() +
   "\nAge: " + this.getAge() +
   "\nIntact: " + this.getIntact();
   }
   
   //you can use == for the equal of two ints, and booleans--but you cannot use == for string, you need to use .equals() method
   
   public boolean equals(Dog dogPassed) {
      return 
      this.getAge() == dogPassed.getAge() && 
      this.getIntact() == dogPassed.getIntact() &&
      this.getName().equals(dogPassed.getName());
   
   }
   
   public void bark() {
   //using getter method to get the name of the dog being used.
   System.out.println("Hi my name is " + this.getName());
   System.out.println("BARK, BARK, BARK!");
   }
   
}//end class