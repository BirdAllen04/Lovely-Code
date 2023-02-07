// 04/02/23
// Kain Allen
// Penguin.java

public class Penguin extends Bird 
{
  
   //Constructors for Canary class
   public Canary(String name) {
      super(name, "Black and White", false);   
   }
   
   //Methods for Canary class
   @Override
   public String eats() {
      return "Penguin eats Fish";
   }
   @Override
   public String move() {
      return "I am a penguin that cannot fly";
   }
   @Override
   public String speaks() {
      return "Quack Quack";
   }
   @Override
   public Boolean getFly() {
      return super.getFly();
   }
   public String toString() {
      return super.toString();
   }

}