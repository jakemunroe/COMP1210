import java.io.FileNotFoundException;
/**
 *Driver Program for MarketingCampaign.java that takes in a command line
 *arguement representing the name of a file, creates a MarketingCampaignList
 *object using the information from the file, and prints an output of the
 *information sorted in several different ways.
 *
 *Project 11
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/16/2021
 */
public class MarketingCampaignPart3 {
 
   /**
    *Main method that takes in a command line arguement representing a file
    *name and uses the information to generate a report.  Handles the
    *FileNotFoundException by printing a message to the user.
    *
    *@param args Represents the name of the file to be read in.
    */
   public static void main(String[] args) {
      //check if array is empty
      if (args.length > 0) {
         try {
            //new MarketingCampaignList obj
            MarketingCampaignList list = new MarketingCampaignList();
         
            list.readFile(args[0]); //reading information from file
         
            //print statements
            System.out.println(list.generateReport() + "\n");
            System.out.println(list.generateReportByName() + "\n");
            System.out.println(list.generateReportByCampaignCost() + "\n");
            System.out.println(list.generateReportByROI() + "\n");
            System.out.println(list.generateInvalidRecordsReport() + "\n");
         }
         catch (FileNotFoundException error) {
            System.out.println("*** Attempted to read file: " + args[0]
               + " (No such file or directory)");
         }
      }
      else {
         //print statement if array is empty
         System.out.println("File name expected as command line argument."
            + "\nProgram ending.");
      }
   
   }
}