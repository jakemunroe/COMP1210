import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 *Program that will be used to create instances of ConeList objects and utilize
 *its methods in this class.
 *
 *Project 6
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/25/2021
 */
public class ConeList {
   
   /**
    *String that will store the name of the ConeList object.
    */
   private String listName;
   
   /**
    *The ArrayList of Cone objects that ConeList will reference from.
    */
   private ArrayList<Cone> listCones = new ArrayList<Cone>();
   
   /**
    *Constructor for the ConeList object that takes in a name for a list
    *and an ArrayList of Cone objects.
    *
    *@param listNameIn The name of the list of Cone objects.
    *@param listConesIn The ArrayList of Cone objects.
    */
   public ConeList(String listNameIn, ArrayList<Cone> listConesIn) {
      listName = listNameIn;
      listCones = listConesIn;
   }
   
   /**
    *Returns a string that represents the name of the ConeList.
    *
    *@return The name of the ConeList object.
    */
   public String getName() {
      return listName;
   }
   
   /**
    *Returns an integer value for the number objects in the ArrayList.
    *
    *@return The number of Cone objects in the ArrayList.
    */
   public int numberOfCones() {
     //Checking to see if given an empty list.
      if (listCones.isEmpty()) {
         //Return 0 for number of cones if empty.
         return 0;
      }
      else {
         //Returns number of elements in the ArrayList.
         return listCones.size();
      }
   }
   
   /**
    *Returns a double value for the total base perimeter of the ArrayList.
    *
    *@return The total of all base perimeter of all Cone objects in the 
    *ArrayList.
    */
   public double totalBasePerimeter() {
      int index = 0;
      double perimeter = 0;
      //Checking if given empty ArrayList.
      if (numberOfCones() != 0) {
         //while loop for ArrayList.
         while (index < numberOfCones()) {
            Cone cone = listCones.get(index);
            //Adding base perimeter of a single obj to total sum.
            perimeter += cone.basePerimeter();
            index++;
         }
      }
      return perimeter;
   }
   
   /**
    *Returns the total base area of all objects in the ArrayList.
    *
    *@return The total base area of all Cone objects in the ArrayList.
    */
   public double totalBaseArea() {
      int index = 0;
      double baseArea = 0;
      //Checking if given empty ArrayList.
      if (numberOfCones() != 0) {
         //while loop for ArrayList.
         while (index < numberOfCones()) {
            Cone cone = listCones.get(index);
            //Adding base area of a single obj to total sum.
            baseArea += cone.baseArea();
            index++;
         }
      }
      return baseArea;
   }
   
   /**
    *Returns the total slant height of all objects in the ArrayList.
    *
    *@return The total slant height of all Cone objects in the ArrayList.
    */
   public double totalSlantHeight() {
      int index = 0;
      double slantHeight = 0;
      //Checking if given empty ArrayList.
      if (numberOfCones() != 0) {
         //while loop for ArrayList.
         while (index < numberOfCones()) {
            Cone cone = listCones.get(index);
            //Adding slant height of a single obj to total sum.
            slantHeight += cone.slantHeight();
            index++;
         }
      }
      return slantHeight;
   }
   
   /**
    *Returns the total side area of all objects in the ArrayList.
    *
    *@return The total sidea area of all Cone objects in the ArrayList.
    */
   public double totalSideArea() {
      int index = 0;
      double sideArea = 0;
      //Checking if given empty ArrayList.
      if (numberOfCones() != 0) {
         //while loop
         while (index < numberOfCones()) {
            Cone cone = listCones.get(index);
            //Adding side area of a single obj to total sum.
            sideArea += cone.sideArea();
            index++;
         }
      }
      return sideArea;
   }
   
   /**
    *Returns the total surface area of all objects in the ArrayList.
    *
    *@return The total sufrace area of all Cone objects in the ArrayList.
    */
   public double totalSurfaceArea() {
      int index = 0;
      double surfaceArea = 0;
      //Checking if given empty ArrayList.
      if (numberOfCones() != 0) {
         //while loop
         while (index < numberOfCones()) {
            Cone cone = listCones.get(index);
            //Adding surface area of single obj to total sum.
            surfaceArea += cone.surfaceArea();
            index++;
         }
      }
      return surfaceArea;
   }
   
   /**
    *Returns the total volume of all objects in the ArrayList.
    *
    *@return The total volume of all Cone objects in the ArrayList.
    */
   public double totalVolume() {
      int index = 0;
      double volume = 0;
      //Checking if given empty ArrayList.
      if (numberOfCones() != 0) {
         //while loop
         while (index < numberOfCones()) {
            Cone cone = listCones.get(index);
            //Adding volume of a single obj to total sum.
            volume += cone.volume();
            index++;
         }
      }
      return volume;
   }
   
   /**
    *Returns the average surface area of all objects in the ArrayList.
    *
    *@return The average surface area of all Cone objects in the ArrayList.
    */
   public double averageSurfaceArea() {
      double average = 0;
      //Checking if given empty ArrayList.
      if (numberOfCones() != 0) {
         //Finding average by diving total over # of objs.
         average = totalSurfaceArea() / numberOfCones();
      }
      return average;
   }
   
   /**
    *Returns the average volume of all objects in the ArrayList.
    *
    *@return The average volume of all Cone objects in the ArrayList.
    */
   public double averageVolume() {
      double average = 0;
      //Checking if given empty ArrayList.
      if (numberOfCones() != 0) {
         //Finding average by diving total over # of objs.
         average = totalVolume() / numberOfCones();
      }
      return average;
   }
   
   /**
    *Returns a string description of all objects in the ArrayList.
    *
    *@return A string representation of all Cone objects in the ArrayList.
    */
   public String toString() {
      String output = getName() + "\n";
      int index = 0;
      //Checking if given empty ArrayList.
      if (numberOfCones() != 0) {
         while (index < numberOfCones()) {
            Cone cone = listCones.get(index);
            //Printing out string description for each obj.
            output += "\n" + cone + "\n";
            index++;
         }
      }
      return output;
   }
   
   /**
    *Returns a string to give a summary of the ConeList object.
    *
    *@return A string description of the ConeList object.
    */
   public String summaryInfo() {
     //DecimalFormat being used for method.
      DecimalFormat dFmt = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----";
      output += "\nNumber of Cones: " + numberOfCones();
      output += "\nTotal Base Perimeter: " + dFmt.format(totalBasePerimeter());
      output += "\nTotal Base Area: " + dFmt.format(totalBaseArea());
      output += "\nTotal Slant Height: " + dFmt.format(totalSlantHeight());
      output += "\nTotal Side Area: " + dFmt.format(totalSideArea());
      output += "\nTotal Surface Area: " + dFmt.format(totalSurfaceArea());
      output += "\nTotal Volume: " + dFmt.format(totalVolume());
      output += "\nAverage Surface Area: " + dFmt.format(averageSurfaceArea());
      output += "\nAverage Volume: " + dFmt.format(averageVolume());
      return output;
   }
   
   /**
    *Returns the ArrayList of Cones.
    *
    *@return The ArrayList of Cone Objects.
    */
   public ArrayList<Cone> getList() {
      return listCones;
   }
   
   /**
    *Returns a new ConeList object after reading information in from a file.
    *
    *@param fileNameIn The name of the file that information will be read.
    *@return A new ConeList object.
    *@throws IOException Occurs if given invalid file name.
    */
   public ConeList readFile(String fileNameIn) throws IOException
   {
      String fileName = fileNameIn;
      Scanner fileScan = new Scanner(new File(fileName));
      String listNameIn = fileScan.nextLine();
      while (fileScan.hasNext()) { //Create Cones and adding to list
         //Retrieve Cone object name.
         String coneName = fileScan.nextLine();
         //Retrieve Cone object height.
         double height = Double.parseDouble(fileScan.nextLine());
         //Retrieve Cone object radius.
         double radius = Double.parseDouble(fileScan.nextLine());
         //Create new Cone object based on collected data.
         Cone cone = new Cone(coneName, height, radius);
         //Add new Cone object to the ArrayList.
         listCones.add(cone);
      }
      fileScan.close(); //Closing the file scan.
      ConeList list = new ConeList(listNameIn, listCones); //ConeList object
      return list;
   }
   
   /**
    *Creates and adds a new Cone object to the ArrayList with a given label,
    *height, and radius.
    *
    *@param labelIn The label for the Cone object.
    *@param heightIn The height for the Cone object.
    *@param radiusIn The radius for the Cone object.
    */
   public void addCone(String labelIn, double heightIn, double radiusIn) {
      Cone cone = new Cone(labelIn, heightIn, radiusIn);
      listCones.add(cone);
   }
   
   /**
    *Takes in a value for the name of a Cone object and returns the cone
    *in the ArrayList with the matching name.
    *
    *@param labelIn The String representing the name of a Cone object.
    *@return The matching Cone object.
    */
   public Cone findCone(String labelIn) {
      Cone cone = null;
      for (Cone c : listCones) {
         if (labelIn.equalsIgnoreCase(c.getLabel())) {
            cone = c;
         }
      }
      return cone;
   }
   
   /**
    *Takes in a value for the name of a Cone object,
    *identifies the Cone object in the ArrayList, and deletes the matching cone.
    *
    *@param labelIn The String representing the name of a Cone object.
    *@return The Cone object that was deleted.
    */
   public Cone deleteCone(String labelIn) {
     //Finding matching Cone object
      Cone cone = findCone(labelIn);
      int index = 0;
      if (cone != null) { //Checking if Cone exists
         index = listCones.indexOf(cone); //Finding the index of Cone object
         listCones.remove(index); //Remove Cone object from ArrayList
      }
      return cone;
   }
   
   /**
    *Returns a boolean value dictating whether the cone has had its height
    *and radius changed by the user, if changed true, otherwise false.
    *
    *@param labelIn The String representing the name of a Cone object.
    *@param heightIn Double value representing the height of the Cone.
    *@param radiusIn Double value representing the radius of the Cone.
    *@return Whether a Cone Object has been edited, true if edited, false
    *otherwise.
    */
   public boolean editCone(String labelIn, double heightIn, double radiusIn) {
      boolean edit = false;
      for (Cone c : listCones) {
         if (labelIn.equalsIgnoreCase(c.getLabel())) {
            c.setHeight(heightIn);
            c.setRadius(radiusIn);
            edit = true;
         }
      }
      return edit;
   }
}