public abstract class Animal
{
   private String colour;
   private String name; 
    /**
     * Constructor for objects of class Animal
     */
   public Animal(String name)
   {
      this.name = name; 
      this.colour = "grey"; 
   }
   
        
   public Animal(String name, String colourIn)
   {
      this.name = name; 
      this.colour = colourIn; 
   }
   
    /**
     * getter method for colour field
     */
   public String getColour(){
      return colour;
   }
    
    /**
     * setter method for colour field
     */
   public void setColour(String colour){
      this.colour = colour;  //subclasses can access colour
   }

   public void setName(String name){
      this.name = name;  
   }
   public String getName(){
      return name;  
   }

   public abstract String move();
   public abstract String eats();
   public abstract String speaks(); 
   
   @Override
    public String toString()
   {
      String s = "\n\n" +getName()
                  +"\nColour: " +getColour()
                 + "\nsay: " +speaks()
                  +"\neat: " +eats()
                  +"\nmove: " +move();
      return s; 
   }
}