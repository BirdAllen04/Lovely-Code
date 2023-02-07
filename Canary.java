// 04/02/23
// Kain Allen
// Canary.java

public class Canary extends Bird implements Petable
{
  
   //Constructors for Canary class
   public Canary(String name, Boolean flyIn) {
      super(name, "Yellow", flyIn);   
   }
   
   //Methods for Canary class
   @Override
   public String eats() {
      return "Canary eats Grass seeds";
   }
   @Override
   public String move() {
      return "Canaries Fly";
   }
   @Override
   public String speaks() {
      return "Tweet Tweet";
   }
   @Override
   public Boolean getFly() {
      return super.getFly();
   }
   public String toString() {
      return super.toString();
   }
   
    public String play() {
      return "I play by Singing";
   }
}