import java.io.FileNotFoundException;
/**
 *Driver Program for MarketingCampaign.java that takes in a command line
 *arguement representing the name of a file, creates a MarketingCampaignList
 *object using the information from the file, and prints an output of the
 *information sorted in several different ways.
 *
 *Project 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/07/2021
 */
public class MarketingCampaignPart2 {
 
   /**
    *Main method that takes in a command line arguement representing a file
    *name and uses the information to generate a report.
    *
    *@param args Represents the name of the file to be read in.
    *@throws FileNotFoundException In case of invalid file name.
    */
   public static void main(String[] args) throws FileNotFoundException {
     //check if array is empty
      if (args.length > 0) {
         //new MarketingCampaignList obj
         MarketingCampaignList list = new MarketingCampaignList();
         
         list.readFile(args[0]); //reading information from file
         
         //print statements
         System.out.println(list.generateReport() + "\n");
         System.out.println(list.generateReportByName() + "\n");
         System.out.println(list.generateReportByCampaignCost() + "\n");
         System.out.println(list.generateReportByROI() + "\n");
      }
      else {
         //print statement if array is empty
         System.out.println("File name expected as command line argument."
            + "\nProgram ending.");
      }
   }
}