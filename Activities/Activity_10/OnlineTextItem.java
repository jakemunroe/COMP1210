/**
 *Child program of InventoryItem.java that strictly deals with
 *online text items.
 *
 *Activity 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/06/2021
 */
public abstract class OnlineTextItem extends InventoryItem {
   
   /**
    *Constructor for an OnlineTextItem object that utilizes the constructor
    *from the parent class InventoryItem.
    *
    *@param nameIn The name of the item.
    *@param priceIn The price of the item.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn); //utilizing parent constructor
   }
   
   /**
    *Calculates the cost for an OnlineTextItem object that is not subject to
    *shipping or tax.
    *
    *@return The cost of the object.
    */
   public double calculateCost() {
      return price;
   }
}