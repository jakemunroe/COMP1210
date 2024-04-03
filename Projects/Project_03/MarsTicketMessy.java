import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;
import java.text.DecimalFormat;
/**
 *
 *
 *
 *
 */
public class MarsTicketMessy {
 
   public static void main(String[] args){
   
      Scanner userInput = new Scanner(System.in);
      
      DecimalFormat priceFormat = new DecimalFormat("#,##0.00");
      
      System.out.print("Enter Ticket Code: ");
      String ticketCode = "";
      String price = "";
      double p;
      String discount = "";
      double percent;
      String time;
      String date;
      String seat;
      String ticketDescription;
      
      ticketCode = userInput.nextLine();
      ticketCode = ticketCode.trim();
      
      price = ticketCode.substring(0, 9);
      p = Double.parseDouble(price);
      p = p / 100;
      System.out.println("Ticket price: " + priceFormat.format(p));
      
      DecimalFormat percentFmt = new DecimalFormat("0%");
      
      discount = ticketCode.substring(9, 11);
      percent = Double.parseDouble(discount);
      percent = percent / 100;
      System.out.println("Discount: " + percentFmt.format(percent));
      
      time = ticketCode.substring(11, 15);
      System.out.println(time.substring(0, 2) + ":" + time.substring(2, 4));
      
      date = ticketCode.substring(15, 23);
      System.out.println(date.substring(0,2) + "/" + date.substring(2, 4) + "/" + date.substring(4, 6));
      
      seat = ticketCode.substring(23, 26);
      System.out.println("Seat: " + seat);
      
      ticketDescription = ticketCode.substring(26, ticketCode.length());
      System.out.println("Ticket: " + ticketDescription);
   }
}