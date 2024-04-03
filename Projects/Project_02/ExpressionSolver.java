import java.util.Scanner;
/**
 *Program that finds and prints a specified result of an
 *equation after taking input values for an x, y, and z varable.
 *
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 01/21/2021
 */
public class ExpressionSolver {
 /**
  *Takes input for x, y, z and prints the result of 
  *running the numbers through an expression.
  *@param args Command Line arguments - not used
  */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x, y, z, result;
      
      //Prints the equation that we are using values for
      System.out.println("result = (9x + 6.25) (6y - 4.5) "
         + "(3z + 2.75) / xyz");
      //Prompts user for an x value
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      //Prompts user for a y value
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      //Prompts user for a z value
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      //Checks to see if result of xyz is 0
      if (x * y * z == 0) {
      //Returns error message to user
         System.out.println("result is \"undefined\"");
      }
      else {
      //Runs input values into the equation and prints the result
         result = ((9 * x + 6.25) * (6 * y - 4.5) * (3 * z + 2.75))
            / (x * y * z);
         System.out.println("result = " + result);
      }
   }
}