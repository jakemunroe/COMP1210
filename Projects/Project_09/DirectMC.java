import java.text.DecimalFormat;
/**
 *Child class of MarketingCampaign.java that also serves as a parent program
 *for more specific classes.
 *
 *Project 9
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/01/2021
 */
public class DirectMC extends MarketingCampaign {
   
   private double costPerMailPiece;
   
   private int numberOfMailPieces;
   
   /**
    *Constant value for the base cost of each DirectMC object.
    */
   public static final double BASE_COST = 1000;
   
   /**
    *Constructor for a DirectMC object that uses the constructor from the
    *parent class while adding two parameters for the cost per mail piece
    *and the number of pieces.
    *
    *@param nameIn The name of the object.
    *@param revenueIn The revenue for the object.
    *@param costIn The cost of the each mail piece.
    *@param numberOfMailIn The number of mail pieces.
    */
   public DirectMC(String nameIn, double revenueIn, double costIn,
      int numberOfMailIn) {
      super(nameIn, revenueIn);
      
      costPerMailPiece = costIn;
      numberOfMailPieces = numberOfMailIn;
   }
   
   /**
    *Returns the cost of each mail piece.
    *
    *@return The cost of each mail piece.
    */
   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }
   
   /**
    *Takes in a parameter for a new value for the cost of each mail piece and
    *assigns the value.
    *
    *@param costIn The new cost per mail piece.
    */
   public void setCostPerMailPiece(double costIn) {
      costPerMailPiece = costIn;
   }
   
   /**
    *Returns the number of mail pieces for the object.
    *
    *@return The number of mail pieces for the object.
    */
   public int getNumberOfMailPieces() {
      return numberOfMailPieces;
   }
   
   /**
    *Takes in a parameter for the new number of mail pieces and assigns the
    *value.
    *
    *@param numberOfMailIn The new number of mail pieces.
    */
   public void setNumberOfMailPieces(int numberOfMailIn) {
      numberOfMailPieces = numberOfMailIn;
   }
   
   /**
    *Calculates the total cost for the campaign of the object.
    *
    *@return The total campaign cost.
    */
   public double campaignCost() {
      return BASE_COST + (costPerMailPiece * numberOfMailPieces);
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
      output += "\n   Base Cost: " + fmt.format(BASE_COST);
      output += "\n   Mail Cost: "
         + fmt.format(costPerMailPiece * numberOfMailPieces) + " = "
         + fmt.format(costPerMailPiece) + " per mail piece * "
         + numberOfMailPieces + " mail pieces";
      
      return output;
   }
}