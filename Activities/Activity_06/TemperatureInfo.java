import java.util.ArrayList;
import java.util.Scanner;
/**
 *Program that will create instances of Temperatures objects based on a user's
 *input and give information about the list of temperatures.
 *
 *Activity 6
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/23/2021
 */
public class TemperatureInfo {
   
   /**
    *Receives integer values for the temperature from the user, stores
    *these values in an ArrayList, and gives information about the list.
    *
    *@param args Command Line arguments - not used.
    */
   public static void main(String [] args) {
      Scanner userInput = new Scanner(System.in);
      
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, [P]rint," 
            + "[E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}