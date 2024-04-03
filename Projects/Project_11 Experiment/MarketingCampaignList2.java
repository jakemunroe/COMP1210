import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
/**
 *Program that creates MarketingCampaignList objects made up of an array of
 *MarketingCampaign objects and uses the objects to sort the array to generate
 *different reports.
 *
 *Project 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/07/2021
 */
public class MarketingCampaignList2 {
 
   private MarketingCampaign[] list;
   
   private String[] invalids;
   
   /**
    *Constructor for a MarketingCampaignList object that sets the orginal size
    *of the two different arrays to zero.
    */
   public MarketingCampaignList2() {
      list = new MarketingCampaign[0];
      invalids = new String[0];
   }
   
   /**
    *Returns the array of MarketingCampaign objects.
    *
    *@return The array of MarketingCampaign objects.
    */
   public MarketingCampaign[] getMarketingCampaignArray() {
      return list;
   }
   
   /**
    *Returns the array of Strings for the invalid records.
    *
    *@return Array of Strings for the invalid records.
    */
   public String[] getInvalidRecordsArray() {
      return invalids;
   }
   
   /**
    *Takes in a parameter of a new MarketingCampaign object and adds that
    *element to the end of the array.
    *
    *@param objIn The object to be added to the array.
    */
   public void addMarketingCampaign(MarketingCampaign objIn) {
     //making copy of the array with + 1 size
      list = Arrays.copyOf(list, list.length + 1);
      //assigning last element to new object
      list[list.length - 1] = objIn;
   }
   
   /**
    *Takes in a parameter of a new String object and adds that element
    *to the end of the array.
    *
    *@param stringIn The String to be added to the array.
    */
   public void addInvalidRecord(String stringIn) {
     //making copy of the array with + 1 size
      invalids = Arrays.copyOf(invalids, invalids.length + 1);
      //assigning last element to the new object
      invalids[invalids.length - 1] = stringIn;
   }
   
   /**
    *Method used to read in a given file.
    *
    *@param fileIn The name of the file to be read in.
    *@throws FileNotFoundException In case of invalid file name.
    */
   public void readFile(String fileIn) throws FileNotFoundException {
      Scanner input = new Scanner(new File(fileIn)); //scanner for filename
      
      do {
         String info = input.nextLine();
         
         Scanner input2 = new Scanner(info);
         input2.useDelimiter(",");
         
         char category = input2.next().charAt(0);
         
         try {
            //switch statement for different category codes read in
            switch (category) {
               case 'D': //for DirectMC
                  String label = input2.next();
                        //retrieve revenue
                  double revenue = Double.parseDouble(input2.next());
                        //retrieve cost
                  double cost = Double.parseDouble(input2.next());
                        //retrieve pieces
                  int pieces = Integer.parseInt(input2.next());
                     
                           //new DirectMC object with info read in
                  DirectMC direct = new DirectMC(label, revenue,
                              cost, pieces);
                  this.addMarketingCampaign(direct); //add object to array
                  break;
                  
               case 'I': //for IndirectMC
                  label = input2.next();
                  revenue = Double.parseDouble(input2.next());
                  cost = Double.parseDouble(input2.next());
                  pieces = Integer.parseInt(input2.next());
                     
                     //new IndirectMC object with info read in
                  IndirectMC indirect = new IndirectMC(label, revenue,
                           cost, pieces);
                  this.addMarketingCampaign(indirect);
                  break;
                  
               case 'S': //for SearchEngineMC
                  label = input2.next();
                  revenue = Double.parseDouble(input2.next());
                  cost = Double.parseDouble(input2.next());
                  pieces = Integer.parseInt(input2.next());
                     
                     //new SearchEngineMC object with info read in
                  SearchEngineMC search = new SearchEngineMC(label, revenue,
                           cost, pieces);
                  this.addMarketingCampaign(search);
                  break;
                  
               case 'M': //for SocialMediaMC
                  label = input2.next();
                  revenue = Double.parseDouble(input2.next());
                  cost = Double.parseDouble(input2.next());
                  pieces = Integer.parseInt(input2.next());
                     
                     //new SocialMediaMC object with info read in
                  SocialMediaMC social = new SocialMediaMC(label, revenue,
                           cost, pieces);
                  this.addMarketingCampaign(social);
                  break;
               default: //for invalid category codes
                  InvalidCategoryException except = new InvalidCategoryException("" + category);
                  info += "\n" + except.toString();
                  this.addInvalidRecord(info);
                  break;
            }
         }
         catch (NumberFormatException error) {
            info += "\n" + error.toString();
            this.addInvalidRecord(info);
         }
         catch (NoSuchElementException error) {
            info += "\n" + error.toString() + ": For missing input data";
            this.addInvalidRecord(info);
         }
      } while (input.hasNextLine());
   }
   
   
   /**
    *Takes the MarketingCampaign objects in the array and creates a string
    *report in the order that the objects appear in the array.
    *
    *@return The report of the array in order that objects appear.
    */
   public String generateReport() {
      String output = "-------------------------------";
      output += "\nMarketing Campaign Report";
      output += "\n-------------------------------";
      
      for (int i = 0; i < list.length; i++) {
         output += "\n\n" + list[i].toString();
      }
      return output;
   }
   
   /**
    *Takes the MarketingCampaign objects in the array and creates a string
    *report in the natural order (alphabetical) of the objects.
    *
    *@return The report of the array in the natural order.
    */
   public String generateReportByName() {
      Arrays.sort(getMarketingCampaignArray());
      
      String output = "-----------------------------------------";
      output += "\nMarketing Campaign Report (by Name)";
      output += "\n-----------------------------------------";
      
      for (int i = 0; i < list.length; i++) {
         output += "\n\n" + list[i].toString();
      }
      return output;
   }
   
   /**
    *Takes the MarketingCampaign objects in the array and creates a string
    *report in the order of lowest campaign cost to highest.
    *
    *@return The report of the array in order of lowest campaign cost to
    *highest.
    */
   public String generateReportByCampaignCost() {
      Arrays.sort(getMarketingCampaignArray(), new CampaignCostComparator());
      
      String output = "-------------------------------------------------";
      output += "\nMarketing Campaign Report (by Lowest Campaign Cost)";
      output += "\n-------------------------------------------------";
      
      for (int i = 0; i < list.length; i++) {
         output += "\n\n" + list[i].toString();
      }
      return output; 
   }
   
   /**
    *Takes the MarketingCampaign objects in the array and creates a string
    *report in the order of highest ROI to lowest.
    *
    *@return The report of the array in order of hightest ROI to lowest.
    */
   public String generateReportByROI() {
      Arrays.sort(getMarketingCampaignArray(), new ROIComparator());
      
      String output = "-------------------------------------------------";
      output += "\nMarketing Campaign Report (by Highest ROI)";
      output += "\n-------------------------------------------------";
      
      for (int i = 0; i < list.length; i++) {
         output += "\n\n" + list[i].toString();
      }
      return output; 
   }
   
   /**
    *
    *
    *
    */
   public String generateInvalidRecordsReport() {
      String output = "----------------------";
      output += "\nInvalid Records Report";
      output += "\n----------------------";
      
      for (int i = 0; i < invalids.length; i++) {
         output += "\n\n" + invalids[i];
      }
      return output;
   }
}