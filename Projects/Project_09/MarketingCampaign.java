import java.text.DecimalFormat;
/**
 *Parent class for various styles of Marketing Campaigns that tells information
 *on the campaigns such as their name, revenue, and ROI.
 *
 *Project 9
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/01/2021
 */
public abstract class MarketingCampaign {
   
   protected String name;
   
   protected double revenue;
   
   protected static int count = 0;
   
   /**
    *Constructor for a MarketingCampaign object that takes in parameters for
    *the object's name and revenue along with incrementing the count of objects
    *everytime an object is created.
    *
    *@param nameIn The name of the object.
    *@param revenueIn The revenue for the object.
    */
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }
   
   /**
    *Returns the name of the object.
    *
    *@return The name of the object.
    */
   public String getName() {
      return name;
   }
   
   /**
    *Takes in a parameter for a new name of an object.
    *
    *@param nameIn The new name for the object.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    *Returns the revenue of the object.
    *
    *@return The revenue of the object.
    */
   public double getRevenue() {
      return revenue;
   }
   
   /**
    *Takes in a parameter for a new revenue amount for an object.
    *
    *@param revenueIn The new revenue amount for the object.
    */
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   
   /**
    *Returns the number of Marketing Campaign child objects created.
    *
    *@return The number of Marketing Campaign child objects.
    */
   public static int getCount() {
      return count;
   }
   
   /**
    *Resets the count for the number of objects to 0.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /**
    *Calculates and returns the return on the investment for the object.
    *
    *@return The return on the investement.
    */
   public double calcROI() {
      return (revenue - campaignCost()) / campaignCost();
   }
   
   /**
    *Returns the string description for the object.
    *
    *@return The string description for the object.
    */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      DecimalFormat fmt2 = new DecimalFormat("0.##%");
     
      String output = name + " (" + this.getClass() + ")";
      output += "\nRevenue: " + fmt.format(getRevenue()) + "   Campaign Cost: "
         + fmt.format(campaignCost()) + "   ROI: " + fmt2.format(calcROI());
      
      return output;
   }
   
   /**
    *Abstract method that will be used by child classes to determine their
    *specific campaign costs.
    *
    *@return The campaign cost for the object.
    */
   public abstract double campaignCost();
}