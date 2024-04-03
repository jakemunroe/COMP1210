import java.util.Scanner;
/**
 *Program that takes a given input of petroleum oil 
 *measured in ounces, then converts and prints the 
 *amount to barrels, gallons, quarts, and ounces.
 *
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 01/27/2021
 */
public class PetroleumUnits {
 /**
  *Takes an input value, then performs multiple 
  *conversions and prints the result.
  *@param args Command Line arguments - not used
  */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      int petroleumAmount = 0;
      int barrels = 0;
      int gallons = 0;
      int quarts = 0;
      
      //Prompts user for petroleum amount in ounces
      System.out.print("Enter amount of petroleum in ounces: ");
      petroleumAmount = userInput.nextInt();
      //Checks if amount exceeds 1,000,000,000
      if (petroleumAmount > 1000000000) {
      //Prints error message
         System.out.println("Amount must not exceed 1,000,000,000.");
         return;
      }
      else {
         System.out.println("Petroleum amount in units:");
         //Convert oz to bl and subtract from total
         barrels = petroleumAmount / 5376;
         petroleumAmount -= barrels * 5376;
         System.out.println("\tBarrels: " + barrels);
         //Convert oz to gal and subtract from total
         gallons = petroleumAmount / 128;
         petroleumAmount -= gallons * 128;
         System.out.println("\tGallons: " + gallons);
         //Convert oz to qt and subtract from total
         quarts = petroleumAmount / 32;
         petroleumAmount -= quarts * 32;
         System.out.println("\tQuarts: " + quarts);
         //Prints remaining oz
         System.out.println("\tOunces: " + petroleumAmount);
         System.out.print((petroleumAmount + barrels * 5376 
            + gallons * 128 + quarts * 32) + " oz = ");
         //Prints conversions on one line
         System.out.print("(" + barrels + " bl * 5376 oz) + ");
         System.out.print("(" + gallons + " gal * 128 oz) + ");
         System.out.print("(" + quarts + " qt * 32 oz) + ");
         System.out.print("(" + petroleumAmount + " oz)");
      }
   }
}