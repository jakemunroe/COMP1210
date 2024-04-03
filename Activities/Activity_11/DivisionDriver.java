import javax.swing.JOptionPane;
/**
 *Driver program for Divsion.java that perfroms integer and floationg point
 *division, as well as handling exceptions.
 *
 *Activity 11
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/13/2021
 */
public class DivisionDriver {
 
   /**
    *Prompts user for two numbers, a numerator and denominator, and performs
    *integer and floating point division with those numbers. Handles exceptions
    *for illegal arguments passed in and dividing by 0.
    *
    *@param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
      
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
                     + Division.intDivide(num, denom)
                     + "\n\nFloating point division: \n"
                     + Division.decimalDivide(num, denom);
                  
         JOptionPane.showMessageDialog(null, result, "Result",
            JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null, 
            "Invalid input: enter numerical integer values only.", "Error",
            JOptionPane.ERROR_MESSAGE);
      }
      catch (Exception e)
      {
         JOptionPane.showMessageDialog(null, e, "Error",
            JOptionPane.ERROR_MESSAGE);
      }
   }
}