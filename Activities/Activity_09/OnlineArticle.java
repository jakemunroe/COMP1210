/**
 *Child program of OnlineTextItem.java that strictly deals with 
 *online articles.
 *
 *Activity 9
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 03/30/2021
 */
public class OnlineArticle extends OnlineTextItem {
 
   /**The word count of the article.*/
   private int wordCount;
   
   /**
    *Constructor for an OnlineArticle object that utilizes the constructor
    *from the parent class and initializes the word count of the article to 0.
    *
    *@param nameIn The name of the article.
    *@param priceIn The price of the article.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn); //utilizing parent constructor
      
      wordCount = 0;
   }
   
   /**
    *Sets the word count for the article.
    *
    *@param wordCountIn The world count for the article.
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}