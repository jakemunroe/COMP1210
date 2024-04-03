import java.util.Scanner;
/**
 *Program that takes an input message and gives the 
 *user the option to perform methods on the message such 
 *as trimming, lower case, upper case, vowel replacement, 
 *and deleting the first and last characters.
 *
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/02/2021
 */
public class MessageConverter {
/**
 *Receives an input message and gives user the option
 *of what methods they want performed on the message.
 *@param args Command Line arguments - not used
 */
 
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      //New string object
      String message = "";
      int outputType;
      //New string object
      String result = "";
      //Prompt user for a message
      System.out.println("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      //Prompt user for method to be performed
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
         //Converting String object to an integer
      outputType = Integer.parseInt(userInput.nextLine());
      if (outputType == 0) {
         //as is
         result = message;
      }
      else if (outputType == 1) {
         //trimmed
         result = message.trim();
      }
      else if (outputType == 2) {
         //lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3) {
         //upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4) {
         //replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5) {
         //without first and last character
         result = message.substring(1, message.length() - 1);
      }
      else {
         //invalid input
         result = "Error: Invalid choice input.";
      }
      //prints result of input
      System.out.println("\n" + result);
   }
}