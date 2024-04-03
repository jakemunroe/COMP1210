/**
 *Program that is used to perform 2 types of division, integer and floating
 *point.
 *
 *Activity 11
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/13/2021
 */
public class Division {
 
   /**
    *Performs integer division with a numerator and denominator given by the
    *user and has an exception to return 0 if the user attempts to divide by 0.
    *
    *@param numerator The dividend.
    *@param denominator The divisor.
    *@return The quotient.
    */
   public static int intDivide(int numerator, int denominator) {
      try
      {
         return numerator / denominator;
      }
      catch (ArithmeticException e)
      {
         return 0;
      }
   }
   
   /**
    *Performs floating point division with a numerator and denominator given by
    *the user and throws an IllegalArgumentException if the user attempts to
    *divide by 0.
    *
    *@param numerator The dividend.
    *@param denominator The divisor.
    *@return The quotient.
    *@throws IllegalArgumentException Thrown if 0 is passed in as the
    *denominator.
    */
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator cannot be zero.");
      }
      return (double) numerator / denominator;
   }
}