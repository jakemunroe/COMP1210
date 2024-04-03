/**
 *Program that stores InvetoryItem objects in an array where data can be
 *pulled from.
 *
 *Activity 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/06/2021
 */
public class ItemsList {
 
   private InventoryItem[] inventory;
   
   private int count;
   
   /**
    *Constructor for an ItemsList object that takes no parameters, creates
    *an emtpy array of size 20, and assigns the count of items in the array
    *to 0.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
    *Takes an InventoryItem object as a parameter and adds that object to the
    *array.
    *
    *@param itemIn The object to be added to the array.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
    
    /**
     *Keeps a running total of the cost of each item in the array, if the item
     *is an electronics item, then a surcharge will be added to the total.
     *
     *@param electronicsSurcharge The surcharge for an electronics item.
     *@return The total cost for all items in teh array.
     */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += electronicsSurcharge + inventory[i].calculateCost();
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
    *String description of an ItemsList object.
    *
    *@return The string description of the object.
    */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i].toString() + "\n";
      }
      
      return output;
   }
}