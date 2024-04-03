import java.text.DecimalFormat;
/**
 *Program that is used to create Tetrahedron objects and its methods to
 *perform various calculations.
 *
 *Project 7B
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 03/19/2021
 */
public class Tetrahedron implements Comparable<Tetrahedron> {
   
   /**String that will store the label of Tetrahedron objects.*/
   private String label = "";
   /**Double that will store the edge length of Tetrahedron objects.*/
   private double edge = 0;
   
   /**Static integer that keeps track of Tetrahedron objects created.*/
   private static int count = 0;
   
   /**
    *Constructor for a Tetrahedron object that takes in a name for the 
    *cone and length for the edge.
    *
    *@param labelIn The name for the Tetrahedron object.
    *@param edgeIn The edge length for the Tetrahedron object.
    */
   public Tetrahedron(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }
   
   /**
    *Returns the name of a Tetrahedron object.
    *
    *@return Theh name of the Tetrahedron object.
    */
   public String getLabel() {
      return label;
   }
   
   /**
    *If given a valid input, sets a new name for a Tetrahedron object and
    *returns true, otherwise returns false.
    *
    *@param labelIn The new name for the Tetrahedron object.
    *@return A boolean value representing whether a new name was given or not.
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
    *Returns the edge length of a Tetrahedron object.
    *
    *@return The double value for the edge length of the Tetrahedron object.
    */
   public double getEdge() {
      return edge;
   }
   
   /**
    *If given a valid input, sets a new edge length for a Tetrahedron object
    *and returns true, otherwise returns false.
    *
    *@param edgeIn The new edge length for the Tetrahedron object.
    *@return Whether or not a new edge was given.
    */
   public boolean setEdge(double edgeIn) {
      boolean isSet = false;
      if (edgeIn >= 0) {
         edge = edgeIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    *Calculates the height for a given Tetrahedron object.
    *
    *@return The double value for the height of the Tetrahedron object.
    */
   public double height() {
      double hght;
      hght = Math.sqrt((2.0 / 3.0)) * getEdge();
      return hght;
   }
   
   /**
    *Calculates the surface area of a given Tetrahedron object.
    *
    *@return The double value for the surface area of the Tetrahedron object.
    */
   public double surfaceArea() {
      double area;
      area = Math.sqrt(3) * Math.pow(getEdge(), 2);
      return area;
   }
   
   /**
    *Calculates the volume of a given Tetrahedron object.
    *
    *@return The double value for the volume of the Tetrahedron object.
    */
   public double volume() {
      double vol;
      vol = Math.pow(getEdge(), 3) / (6 * Math.sqrt(2));
      return vol;
   }
   
   /**
    *The string description of a given Tetrahedron object.
    *
    *@return The String value of the Tetrahedron object.
    */
   public String toString() {
      String output;
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      output = "Tetrahedron \"" + getLabel() + "\" with six edges of length "
         + fmt.format(getEdge()) + " has:";
      output += "\n\theight = " + fmt.format(height()) + " units";
      output += "\n\tsurface area = " + fmt.format(surfaceArea())
         + " square units";
      output += "\n\tvolume = " + fmt.format(volume()) + " cubic units";
      return output;
   }
   
   /**
    *Returns the current number of Tetrahedron objects.
    *
    *@return The number of Tetrahedron objects.
    */
   public static int getCount() {
      return count;
   }
    
    /**
     *Resets the count for number of Tetrahedron objects.
     */
   public static void resetCount() {
      count = 0;
   }
    
    /**
     *Compares two Tetrahedron objects and returns true if they are equivalent
     *and false otherwise.
     *
     *@param obj An input object to be compared.
     *@return Whether or not two Tetrahedron objects are equal.
     */
   public boolean equals(Object obj) {
      if (!(obj instanceof Tetrahedron)) {
         return false;
      }
      else {
         Tetrahedron d = (Tetrahedron) obj;
         return (label.equalsIgnoreCase(d.getLabel())
               && Math.abs(edge - d.getEdge()) < .000001);
      }
   }
   
   /**
    *Required method when the equals method is implemented.
    *
    *@return int of 0.
    */
   public int hashCode() {
      return 0;
   }
   
   /**
    *Compares two Customer objects and determines which one has the 
    *greater balance or if they are equal.
    *
    *@param obj The object that will be compared to the current.
    *@return An integer representing greater/less than or equal to.
    */
   public int compareTo(Tetrahedron obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}