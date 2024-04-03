/**
 *Driver program for ItemsList.java that demostrates the class's capabilities.
 *
 *Activity 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/06/2021
 */
public class InventoryListApp {
 
 /**
  *Adds items to the array and prints the description.
  *
  *@param args Command Line arguments - not used.
  */
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
      
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems);
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}