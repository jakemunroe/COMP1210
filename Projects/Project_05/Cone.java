import java.text.DecimalFormat;
/**
 *Program that will be used to create instances of Cone objects
 *and utilize the methods in the class.
 *
 *Project 4
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/11/2021
 */
public class Cone {
 
   /**
    *String that will store the label of the cone object.
    */
   private String label;
   /**
    *Double variables that will store the height and radius of the cone.
    */
   private double height, radius;
   /**
    *Constructor for an instance of a cone object that takes a name for 
    *the cone, a height for the cone, and a radius for the cone.
    *
    *@param labelIn The name of the cone object.
    *@param heightIn The given height for the cone object.
    *@param radiusIn The given radius for the cone object.
    */
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
   }
   /**
    *Returns a string value for the name of a cone object.
    *
    *@return The current name for the cone.
    */
   public String getLabel() {
      return label;
   }
   /**
    *Returns a boolean value that when true will assign a new name
    *to a cone object.
    *
    *@param labelIn Takes an input for the name of the cone.
    *@return Whether the name of the cone has been set or not.
    */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   /**
    *Returns a double value for the height of a cone.
    *
    *@return The current height of the cone.
    */
   public double getHeight() {
      return height;
   }
   /**
    *Returns a boolean value that when true will assign
    *a new height to a cone object.
    *
    *@param heightIn Takes a double value for the height of the cone.
    *@return Whether the height of the cone has been set or not.
    */
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    *Returns a double value for the current radius of the cone.
    *
    *@return The current radius of the cone.
    */
   public double getRadius() {
      return radius;
   }
   /**
    *Returns a boolean value that when true will assign
    *a new radius to a cone object.
    *
    *@param radiusIn Takes a double value for the radius of the cone.
    *@return Whether the radius of the cone has been set or not.
    */
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn > 0) {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    *Returns a double value for the base perimeter of a cone object.
    *
    *@return The base perimeter of the cone.
    */
   public double basePerimeter() {
      double perimeter = 2 * Math.PI * radius;
      return perimeter;
   }
   /**
    *Returns a double value for the base area of a cone object.
    *
    *@return The base area of the cone.
    */
   public double baseArea() {
      double area = Math.PI * Math.pow(radius, 2);
      return area;
   }
   /**
    *Returns a double value for the slant height of a cone object.
    *
    *@return The slant height of the cone.
    */
   public double slantHeight() {
      double slant = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
      return slant;
   }
   /**
    *Returns a double value for the side area of a cone object.
    *
    *@return The side area of the cone.
    */
   public double sideArea() {
      double slant = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
      double area = Math.PI * radius * slant;
      return area;
   }
   /**
    *Returns a double value for the surface area of a cone object.
    *
    *@return The surface area of the cone.
    */
   public double surfaceArea() {
      double baseA = Math.PI * Math.pow(radius, 2);
      double slant = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
      double sideA = Math.PI * radius * slant;
      double area = baseA + sideA;
      return area;
   }
   /**
    *Returns a double value for the volume of a cone object.
    *
    *@return The volume of the cone.
    */
   public double volume() {
      double vol = (Math.PI * Math.pow(radius, 2) * height) / 3;
      return vol;
   }
   /**
    *Returns a string representation of a cone object including the cone's
    *label, height, radius, base perimeter, base area, slant height, side area,
    *suface area, and volume.
    *
    *@return The string description of the cone object.
    */
   public String toString() {
   //Decimal format that will be used for printing results.
      DecimalFormat dFmt = new DecimalFormat("#,##0.0##");
      String output = "\"" + label + "\" " + "is a cone with height = "
         + dFmt.format(height) + " units and radius = ";
      output += dFmt.format(radius) + " units,\n";
      output += "which has base perimeter = " + dFmt.format(basePerimeter())
         + " units, ";
      output += "base area = " + dFmt.format(baseArea()) + " square units,\n";
      output += "slant height = " + dFmt.format(slantHeight()) + " units, ";
      output += "side area = " + dFmt.format(sideArea()) + " square units,\n";
      output += "surface area = " + dFmt.format(surfaceArea())
         + " square units, ";
      output += "and volume = " + dFmt.format(volume()) + " cubic units.";
      return output;
   }
}