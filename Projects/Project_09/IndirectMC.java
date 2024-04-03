import java.text.DecimalFormat;
/**
 *Child class of MarketingCampaign.java that also serves as a parent program
 *for more specific classes.
 *
 *Project 9
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/01/2021
 */
public class IndirectMC extends MarketingCampaign {
 
   protected double costPerAd;
   
   protected int numberOfAds;
   
   /**
    *Constant value for the base cost of each InirectMC object.
    */
   public static final double BASE_COST = 1500.0;
   
   /**
    *Constructor for a DirectMC object that uses the constructor from the
    *parent class while adding two parameters for the cost per ad and the
    *number of ads.
    *
    *@param nameIn The name of the object.
    *@param revenueIn The revenue for the object.
    *@param costIn The cost per ad.
    *@param numberIn The number of ads in the object.
    */
   public IndirectMC(String nameIn, double revenueIn, double costIn,
      int numberIn) {
      super(nameIn, revenueIn);
      
      costPerAd = costIn;
      
      numberOfAds = numberIn;
   }
   
   /**
    *Returns the cost per ad of the object.
    *
    *@return The cost per ad.
    */
   public double getCostPerAd() {
      return costPerAd;
   }
   
   /**
    *Takes in a parameter for the new cost of each ad and assigns teh value.
    *
    *@param costIn The new cost of each ad.
    */
   public void setCostPerAd(double costIn) {
      costPerAd = costIn;
   }
   
   /**
    *Returns the number of ads in the object.
    *
    *@return The number of ads.
    */
   public int getNumberOfAds() {
      return numberOfAds;
   }
   
   /**
    *Takes in a parameter for the new number of ads and assigns the value.
    *
    *@param numberIn The new number of ads for the object.
    */
   public void setNumberOfAds(int numberIn) {
      numberOfAds = numberIn;
   }
   
   /**
    *Returns the base cost of the marketing campaign for the object.
    *
    *@return The base cost for the object.
    */
   public double getBaseCost() {
      return BASE_COST;
   }
   
   /**
    *Calculates and returns the total cost for the marketing campaign.
    *
    *@return The total cost of the campaign.
    */
   public double campaignCost() {
      return getBaseCost() + (costPerAd * numberOfAds);
   }
   
   /**
    *Returns the string description for the object.
    *
    *@return The string description for the object.
    */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      DecimalFormat fmt2 = new DecimalFormat("0.##%");
      
      String output = super.toString();
      output += "\n   Base Cost: " + fmt.format(getBaseCost());
      output += "\n   Ad Cost: " + fmt.format(costPerAd * numberOfAds) + " = "
         + fmt.format(costPerAd) + " per ad * " + numberOfAds + " ads";
         
      return output;
   }
}