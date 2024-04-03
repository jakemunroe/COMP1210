/**
 *Child program of InventoryItem.java that strictly deals with 
 *electronics items.
 *
 *Activity 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/06/2021
 */
public class ElectronicsItem extends InventoryItem {
 
   /**The weight of the object.*/
   protected double weight;
   
   /**The shipping cost per pound of the object.*/
   public static final double SHIPPING_COST = 1.5;
   
   /**
    *Constructor for an ElectronicsItem object that inherits the constructor
    *of the InventoryItem class, but adds a new value for the weight of an
    *object.
    *
    *@param nameIn The name of the object.
    *@param priceIn The price of the object.
    *@param weightIn The weight of the object.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn); //Utilizing parent constructor
      
      weight = weightIn;
   }
   
   /**
    *Sets a new weight value of an object.
    *
    *@param weightIn A new weight value for the object.
    */
   public void setWeight(double weightIn) {
      weight = weightIn;
   }
   
   /**
    *Utilizes the parent class' calculateCost method to calculate the cost of
    *the item plus shipping.
    *
    *@return The cost of the item including tax and shipping.
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}