// 03/02/23
// Kain Allen
// Dog.java
public class Dog extends Animal implements Petable 
{
   private String breed;
   
   //Constructors for dog class
   public Dog(String name, String colourIn, String breedtype) {
      super(name, colourIn);
      breed = breedtype;   
   }
   
   //Methods for dog class
   @Override
   public String eats() {
      return "Dog Eats Meat";
   }
   @Override
   public String move() {
      return "Dog Runs";
   }
   @Override
   public String speaks() {
      return "Bark Bark";
   }
   
   public String getBreed() {
      return breed;
   }
   
   public String toString() {
      return super.toString() + "Breed Type: " + breed;
   }
   
   public String play() {
      return "I play with chewing toy";
   }
}
