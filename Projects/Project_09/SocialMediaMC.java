/**
 *Child class of IndirectMC.java that deals strictly with search engine
 *marketing campaigns.
 *
 *Project 9
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/01/2021
 */
public class SocialMediaMC extends IndirectMC {
 
   /**Constant value for the base cost of each SocialMediaMC object.*/
   public static final double BASE_COST = 3000.0;
   
   /**
    *Constructor for a SocialMediaMC object that utilizes its parent class'
    *constructor for the parameters.
    *@param nameIn The name for the object.
    *@param revenueIn The revenue for the object.
    *@param costIn The cost of each ad.
    *@param numberIn The number of ads.
    */
   public SocialMediaMC(String nameIn, double revenueIn, double costIn,
      int numberIn) {
      super(nameIn, revenueIn, costIn, numberIn);
   }
   
   /**
    *Returns the base cost of the marketing campaign.
    *
    *@return The base cost of the campaign.
    */
   public double getBaseCost() {
      return BASE_COST;
   }
}