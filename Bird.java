// 03/02/23
// Kain Allen
// Bird.java

public abstract class Bird extends Animal 
{
   private Boolean canFly;
   
   //Constructors for Bird class
   public Bird(String name, String colourIn, Boolean flyIn) {
      super(name, colourIn);
      canFly = flyIn;   
   }
   
   //Methods for Bird class
   @Override
   public String eats() {
      return "Birds Eats Seeds";
   }
   @Override
   public String move() {
      return "Birds move";
   }
   @Override
   public String speaks() {
      return "Tweet Tweet";
   }
   
   public Boolean getFly() {
      return canFly;
   }
   
   public String toString() {
      return super.toString() + "Will the bird fly: " + canFly;
   }
}