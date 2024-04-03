import java.util.Scanner;
/**
 *Program that takes an input for a person's name, age,
 *and gender and returns two age conversions and a 
 *max heart rate for the person.
 *
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 01/25/2021
 */
public class AgeStatistics {
 /**
  *Uses the input data to perform conversions 
  *and perform a calculation based on the given data.
  *@param args Command Line arguments - not used
  */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      //Prompt the user for their name
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      //Prompt the user for their age
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      //Prompt the user for their gender
      System.out.print("Enter your gender (1 for female "
         + "and 0 for male): ");
      gender = userInput.nextInt();
      //Age conversion to minutes
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      //Age conversion to centuries
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      //Display max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1) {
      //Calculate female HR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else {
      //Calculate male HR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
   }
}