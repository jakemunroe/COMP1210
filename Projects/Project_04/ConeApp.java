import java.util.Scanner;
/**
 *Program that creates cone objects and performs calculations such as finding
 *the base perimeter, base area, slant height, side area, suface area,
 *and volume.
 *
 *Project 4
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/1/2021
 */
public class ConeApp {

   /**
    *Creates cone objects and calls on their methods.
    *
    *@param args Command Line arguements - not used.
    */
   public static void main(String[] args) {
     //New string object that is empty.
      String label = null;
      //New double variable assigned to a value of 0.
      double height = 0;
      //New double variable assigned to a value of 0.
      double radius = 0;
      //Creating a new scanner for the program.
      Scanner input = new Scanner(System.in);
      //Creating a new cone object.
      Cone cone = new Cone(label, height, radius);
      
      //Print statement for user.
      System.out.println("Enter label, height, and radius for a cone.");
      
      //Prompt user for a label.
      System.out.print("\tlabel: ");
      label = input.nextLine();
      
      //Checking to see if label is valid.
      if (cone.setLabel(label)) {
         //If label is valid then prompt user for a height.
         System.out.print("\theight: ");
         height = Double.parseDouble(input.nextLine());
      }
      //Error message for invalid label.
      else {
         System.out.println("Error: must enter a label.");
         return;
      }
      
      //Checking to see if height is valid.
      if (cone.setHeight(height)) {
         //If height is valid then prompt user for radius.
         System.out.print("\tradius: ");
         radius = Double.parseDouble(input.nextLine());
      }
      //Error message for invalid height.
      else {
         System.out.println("Error: height must be greater than 0.");
         return;
      }
      
      //Checking to see if radius is valid.
      if (cone.setRadius(radius)) {
         //If radius is valid then print cone description.
         System.out.print(cone);
      }
      //Error message for invalid radius.
      else {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }
   }
}