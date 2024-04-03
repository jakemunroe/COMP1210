/**
 *
 *
 *Project 11
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/14/2021
 */
public class InvalidCategoryException extends Exception {
 
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}