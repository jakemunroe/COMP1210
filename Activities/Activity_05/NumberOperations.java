/**
 *Program that will be used to create instances of NumberOperations objects and
 /perform methods such as giving the current value, finding all odd numbers
 *less than the given value, finding all powers of 2 that are less than the
 *given number value, and testing whether a number is less than, greater
 *than or equal to another number.
 *
 *Activity 05
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/16/2021
 */
public class NumberOperations {

   /**
    *Integer to store the number that is read in from the user.
    */
   private int number;
   
   /**
    *Constructor for a new NumberOperations object that takes in a number.
    *
    *@param numberIn The number that is given from the user.
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   
   /**
    *Returns an integer value for the current value of the number.
    *
    *@return The current value of the number.
    */
   public int getValue() {
      return number; //return current value of number
   }
   
   /**
    *Returns a string value for the odd numbers less than the value given.
    *
    *@return All odd numbers less than the give value.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output; //returns all odd int values less than number
   }
   
   /**
    *Returns a string value for all powers of 2 less than the given value.
    *
    *@return All powers of 2 that are less than the given number value.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output; //returns all powers of 2 that are less than number
   }
   
   /**
    *Returns an integer value that is used to signify whether a the value for 
    *number is greater than, less than, or equal to another value.
    *
    *@param compareNumber The value that will be tested against
    *the user's number.
    *@return An integer signifying less than, greater than, or equal to.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1; //indicates number is greater than compareNumber
      }
      else if (number < compareNumber) {
         return -1; //indicates compareNumber is greater than number
      }
      else {
         return 0; //indicates number and compareNumber are equal values
      }
   }
   
   /**
    *Returns a string value for the number.
    *
    *@return The user's number stored as a string object.
    */
   public String toString() {
      return number + ""; //converts int number to string value
   }
}