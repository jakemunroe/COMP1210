/**
 *Driver program for InventoryItem.java and its child classes.
 *
 *Activity 9
 *@author Kody Wingard
 *@version 04/04/2022
 */
public class InventoryApp {
 
   /**
    *Creates different objects from different classes and uses methods to give
    *those objects information.
    *
    *@param args Command line arguments - not used.
    */
   public static void main(String[] args) {
   
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39);
      
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80, 1.8);
      
      OnlineArticle item3 = new OnlineArticle("Java News", 8.5);
      item3.setWordCount(700);
      
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
   }
}