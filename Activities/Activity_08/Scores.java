/**
 *Program that sorts through an array of integers, finds and sorts
 *odd and even numbers, and can find an average of the values.
 *
 *Activity 8
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 03/22/2021
 */
public class Scores {
 
   /**The array of integers used to perform methods.**/
   private int[] numbers;
   
   /**
    *Constructor that takes in a parameter of an array of integers that will
    *be stored.
    *
    *@param numbersIn Array of integers given.
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   /**
    *Searches through the given array and finds all even numbers.
    *
    *@return A list of the even numbers from the given array.
    */
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers [i];
            count++;
         }
      }
      return evens;
   }
   
   /**
    *Searches through the given array and finds all odd numbers.
    *
    *@return A list of the odd numbers from the given array.
    */
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers [i];
            count++;
         }
      }
      return odds;
   }
   
   /**
    *Sums up all values in the array and finds the average.
    *
    *@return A double value for the average of all terms in the given array.
    */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return (double) sum / numbers.length;
   }
   
   /**
    *The array of numbers printed from the given order.
    *
    *@return The string description of a Scores object.
    */
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   /**
    *The array of numbers printed in reverse from the given order.
    *
    *@return The reverse string description of a Scores object.
    */
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}