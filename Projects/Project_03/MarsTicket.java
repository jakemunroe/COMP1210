import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
/**
 *Program that takes an input ticket code from the user 
 *and derives information such as ticket number, date, 
 *time, seat, price, discount, cost, and prize number.
 *
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/04/2021
 */
public class MarsTicket {
   /**
    *Receives an input number and performs conversions
    *to derive information.
    *@param args Command Line arguments - not used
    */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      Random generator = new Random();
      String ticketCode = "";
      String price = "";
      double newPrice, percent, cost;
      String discount = "";
      String time, date, row, seat, ticketDescription, section;
      int prizeNumber;
      
      //Prompting user for a ticket code
      System.out.print("Enter ticket code: ");
      ticketCode = userInput.nextLine();
      //Checking to see if code exceeds 27 characters
      if (ticketCode.length() >= 28) {
         //Trimming string object
         ticketCode = ticketCode.trim();
         
         //Format that both price and cost will use
         DecimalFormat priceFmt = new DecimalFormat("$#,##0.00");
         //New string obj with characters for price
         price = ticketCode.substring(0, 6);
         //Converts string obj to a double value
         newPrice = Double.parseDouble(price);
         //Precision for the price
         newPrice = newPrice / 100;
         
         //Format for the discount %
         DecimalFormat percentFmt = new DecimalFormat("0%");
         //New string obj with characters for discount
         discount = ticketCode.substring(6, 8);
         //Converts string obj to a double value
         percent = Double.parseDouble(discount);
         //Precision for the discount
         percent = percent / 100;
         
         //Applies discount to price
         cost = newPrice * (1 - percent);
         
         //New string obj with characters for time
         time = ticketCode.substring(8, 12);
         
         //New string obj with characters for date
         date = ticketCode.substring(12, 20);
         
         section = ticketCode.substring(20, 23);
         
         //New string obj with characters for row
         row = ticketCode.substring(23, 25);
         
         seat = ticketCode.substring(25, 27);
         
         //New string obj with characters for ticket description
         ticketDescription = ticketCode.substring(27, ticketCode.length());
         ticketDescription = ticketDescription.trim();
         
         //Format to be used for prize number
         DecimalFormat prizefmt = new DecimalFormat("000000");
         //Generating random number between 000000 and 999999
         prizeNumber = Math.abs(generator.nextInt() / 10000);
         
         //Print Mars ticket to user
         System.out.println("\nTicket: " + ticketDescription);
         System.out.print("Date: " + date.substring(0, 2) + "/"
            + date.substring(2, 4) + "/" + date.substring(4, 8));
         System.out.println("   Time: " + time.substring(0, 2) + ":"
            + time.substring(2, 4));
         System.out.println("Section: " + section + "   Row: " + row
            + "   Seat: " + seat);
         System.out.print("Price: " + priceFmt.format(newPrice));
         System.out.print("   Discount: " + percentFmt.format(percent));
         System.out.println("   Cost: " + priceFmt.format(cost));
         System.out.println("Prize Number: " + prizefmt.format(prizeNumber));
      }
      //Print error message to user
      else {
         System.out.println("\n*** Invalid Ticket Code ***"
            + "\nTicket code must have at least 28 characters.");
      }
      
   }
}