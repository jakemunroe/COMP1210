/**
 *Parent program that gives an outline for inventory items and the 
 *different item variants.
 *
 *Activity 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/06/2021
 */
public class InventoryItem {
 
   /**Represents the name of the item.*/
   protected String name;
   
   /**Represents the price of the item.*/
   protected double price;
   
   /**Represents the tax rate that an item is subject to.*/
   private static double taxRate = 0;
   
   /**
    *Constructor for the InventoryItem object that is also used by child 
    *classes.
    *@param nameIn The name of the item.
    *@param priceIn The price of the item.
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      
      price = priceIn;
   }
   
   /**
    *Returns the name of the object.
    *
    *@return The string name of the object.
    */
   public String getName() {
      return name;
   }
   
   /**
    *Calculates the total cost of the item with tax included.
    *
    *@return The cost of the item with tax included.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
    *Sets a new value for the tax rate.
    *
    *@param taxRateIn The new value for the tax rate.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    *Gives a string description of an Inventory Item object.
    *
    *@return The string description of the object.
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}