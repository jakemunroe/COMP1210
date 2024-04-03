import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 *Program that will create ConeList objects from a given file and perform
 *methods and operations on the objects that are within ConeList, and print
 *out brief descriptions on Cone objects and the ConeList object.
 *
 *Project 5
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/18/2021
 */
public class ConeListApp {
   /**
    *Reads in a file name from the user and scans the file for information
    *used to create cone objects and perform operations based on
    *the data given.
    *
    *@param args Command Line arguments - not used.
    *
    *@throws IOException Occurs if given invalid file name.
    */
   public static void main(String[] args) throws IOException
   {
      Scanner userInput = new Scanner(System.in);
      String input;
      
      //Prompting user for file name.
      System.out.print("Enter file name: ");
      //Getting file name from user.
      input = userInput.nextLine();
      
      //Retrieving file
      Scanner fileScan = new Scanner(new File(input));
      
      //Retrieve ConeList list name from file.
      String listName = fileScan.nextLine();
      
      //Creating new ArrayList for cone objects.
      ArrayList<Cone> coneList = new ArrayList<Cone>();
      
      //Creating cone objects and adding them to the ArrayList
      while (fileScan.hasNext()) {
         //Retrieve Cone object name.
         String coneName = fileScan.nextLine();
         //Retrieve Cone object height.
         double height = Double.parseDouble(fileScan.nextLine());
         //Retrieve Cone object radius.
         double radius = Double.parseDouble(fileScan.nextLine());
         //Create new Cone object based on collected data.
         Cone cone = new Cone(coneName, height, radius);
         //Add new Cone object to the ArrayList.
         coneList.add(cone);
      }
      fileScan.close(); //Closing the file scan.
      
      //Creating new ConeList object.
      ConeList list = new ConeList(listName, coneList);
      //Print out the ArrayList information.
      System.out.println();
      System.out.println(list);
      //Print out the SummaryInfo for the ArrayList.
      System.out.println();
      System.out.println(list.summaryInfo());
   }
}