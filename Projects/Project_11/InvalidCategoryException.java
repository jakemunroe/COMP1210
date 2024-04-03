/**
 *Exception used to identify Invalid Category types.
 *
 *Project 11
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/14/2021
 */
public class InvalidCategoryException extends Exception {
 
   /**
    *Constructor for the InvalidCategoryException that takes in a parameter
    *for the invalid category type.
    *
    *@param categoryIn The invalid category character.
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}