import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *Program that takes an input x value and uses it to calculate 
 *the result of an expression along with how many numbers are 
 *to the left and right of the decimal point.
 *
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/04/2021
 */
public class SolveIt {
   /**
    *Calculates the expression with input value and finds numbers 
    *to the left and right of the decimal.
    *@param args Command Line arguments - not used
    */
   public static void main(String[] args) {
      
      //Declaring variables of type double for expression
      double x, numerator, denomenator, result;
      String answer, left, right;
      int decimal, numLeft, numRight;
      
      Scanner userInput = new Scanner(System.in);
      
      //Prompt user for a number
      System.out.print("Enter a value for x: ");
      //Convert string input into a double value
      x = Double.parseDouble(userInput.nextLine());
      
      //Performs the operations in the numerator
      numerator = Math.sqrt(Math.abs(3 + (3 * x) + (3 * Math.pow(x, 2)) + (3 * Math.pow(x, 3)) + (3 * Math.pow(x, 4)))) + (3 * Math.pow(x, 5));
      
      //Performs the operations in the denomenator
      denomenator = Math.abs(x) + 3;
      
      //Prints result of the division
      result = numerator / denomenator;
      System.out.println("Result: " + result);
      
      //Making a string object to contain result
      answer = Double.toString(result);
      
      //Finding the index of '.' in answer
      decimal = answer.indexOf(".");
      //Creating string object for values left of the decimal
      left = answer.substring(0, decimal);
      //Creating string object for values right of the decimal
      right = answer.substring(decimal, answer.length() - 1);
      //Finding the length to the left
      numLeft = left.length();
      //Finding the length to the right
      numRight = right.length();
      System.out.println("# of characters to left of decimal point: "
         + numLeft);
      System.out.println("# of characters to right of decimal point: "
         + numRight);
      
      //Creating new format style for the Formatted Result
      DecimalFormat fmtResult = new DecimalFormat("#,##0.0##");
      System.out.println("Formatted Result: " + fmtResult.format(result));
   }
}