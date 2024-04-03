/**
 *Child program of OnlineTextItem.java that strictly deals with online books.
 *
 *Activity 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/06/2021
 */
public class OnlineBook extends OnlineTextItem {
 
   /**The author of the book.*/
   protected String author;
   
   /**
    *Constructor for an OnlineBook object that utilizes the contructor of the
    *parent class.
    *
    *@param nameIn The name for the book.
    *@param priceIn The price for the book.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn); //utilizing parent constructor
      
      author = "Author Not Listed";
   }
   
   /**
    *Sets the author to an OnlineBook object.
    *
    *@param nameIn The name of the author.
    */
   public void setAuthor(String nameIn) {
      author = nameIn;
   }
   
   /**
    *The description of an OnlineBook object.
    *
    *@return The string description of the object.
    */
   public String toString() {
      String output = getName() + " - " + author + ": $" + calculateCost();
      return output;
   }
}