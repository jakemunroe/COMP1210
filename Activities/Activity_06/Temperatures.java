import java.util.ArrayList;
/**
 *Program that will be used to create Temperatures objects and
 *utilize its methods.
 *
 *Activity 6
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/23/2021
 */
public class Temperatures {
 
   /**
    *ArrayList that will be used to store the int values for the temperature.
    */
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
    /**
     *Contructor for the Temperatures class that takes in an ArrayList of
     *integers representing the temperature.
     *
     *@param temperaturesIn The ArrayList of temperatures of type int.
     */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   /**
    *Returns an integer value for the lowest temperature value present
    *in the ArrayList.
    *
    *@return The lowest temperature integer from the ArrayList.
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /**
    *Returns an integer value for the highest temperature value
    *present in the ArrayList.
    *
    *@return The highest temperature integer from the ArrayList.
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
   /**
    *Compares an inputed number to the lowest temperature of the ArrayList and
    *returns the lowest value of the two.
    *
    *@param lowIn An integer value that will be compared to the lowest
    *temperature in the ArrayList.
    *@return The lowest of the two compared values.
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
    *Compares an inputed number to the highest temperature of the ArrayList
    * and returns the highest value of the two.
    *
    *@param highIn An integer value that will be compared to the lowest
    *temperature in the ArrayList.
    *@return The highest of the two compared values.
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
    *Returns a string description of a Temperatures object.
    *
    *@return A string value to describe Temperatures objects.
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}