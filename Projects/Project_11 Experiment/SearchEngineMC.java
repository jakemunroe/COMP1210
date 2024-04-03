/**
 *Child class of IndirectMC.java that deals strictly with search engine
 *marketing campaigns.
 *
 *Project 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/09/2021
 */
public class SearchEngineMC extends IndirectMC {
   
   /**
    *Constant value for the base cost of each SearchEngineMC object.
    */
   public static final double BASE_COST = 2000.0;
   
   /**
    *Constructor for a SearchEngineMC object that utilizes its parent class'
    *constructor for the parameters.
    *
    *@param nameIn The name of the object.
    *@param revenueIn The revenue for the object.
    *@param costIn The cost each ad.
    *@param numberIn The number of ads in the object.
    */
   public SearchEngineMC(String nameIn, double revenueIn, double costIn,
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