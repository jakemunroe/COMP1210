import java.text.DecimalFormat;
/**
 *Program that takes an array of Tetrahedron objects and can perform various
 *methods to edit, delete, and add objects to the list as well as 
 *perfroming several calculations.
 *
 *Project 8
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 03/25/2021
 */
public class TetrahedronList {
 
   /**String representing the TetrahedronList's name.*/
   private String listName;
   
   /**Tetrahedron array for the TetrahedronList.*/
   private Tetrahedron[] tList;
   
   /**Integer that keeps track of the number of Tetrahedron objects 
    *in the array.*/
   private int numberOfTetrahedron;
   
   
   
   /**
    *Constructor for a TetrahedronList object that takes in a string for the
    *name of the list, an array of Tetrahedron objects, and an integer
    *representing the number of Tetrahedron objects.
    *
    *@param listNameIn String representing the TetrahedronList name.
    *@param tListIn Array of Tetrahedron objects.
    *@param numberIn Integer value for the number of Tetrahedron objects in
    *the array.
    */
   public TetrahedronList(String listNameIn, Tetrahedron[] tListIn,
      int numberIn) {
      listName = listNameIn;
      tList = tListIn;
      numberOfTetrahedron = numberIn;
   }
   
   
   
   /**
    *Returns the name of the list.
    *
    *@return The String name of the list.
    */
   public String getName() {
      return listName;
   }
   
   
   
   /**
    *Returns the number of Tetrahedron objects in the array.
    *
    *@return Integer value of Tetrahedron objects in the array.
    */
   public int numberOfTetrahedrons() {
      return numberOfTetrahedron;
   }
   
   
   
   /**
    *Calculates the total surface area of Tetrahedron objects in the array.
    *
    *@return Double value for the total surface area of Tetrahedron
    *objects in the array.
    */
   public double totalSurfaceArea() {
      double sum = 0; //initial value for the sum
      //checks if there are tetrahedrons present
      if (numberOfTetrahedrons() != 0) {
         //loops through all tetrahedrons in array
         for (int i = 0; i < tList.length; i++) {
            //checks if array element is null
            if (tList[i] != null) {
               //add surface area of object to running sum
               sum += tList[i].surfaceArea();
            }
         }
      }
      return sum; //return value for sum
   }
   
   
   
   /**
    *Calculates the total volume of Tetrahedron objects in the array.
    *
    *@return Double value for the total volume of Tetrahedron objects
    *in the array.
    */
   public double totalVolume() {
      double sum = 0; //initial value for the sum
      //checks if there are tetrahedrons present
      if (numberOfTetrahedrons() != 0) {
         //loops through all tetrahedrons in array
         for (int i = 0; i < tList.length; i++) {
            //checks if array element is null
            if (tList[i] != null) {
               //add volume of object to running sum
               sum += tList[i].volume();
            }
         }
      }
      return sum; //return value for sum
   }
   
   
   
   /**
    *Calculates the average surface area of Tetrahedron objects in the array.
    *
    *@return Double value for average surface area of Tetrahedron objects
    *in the array.
    */
   public double averageSurfaceArea() {
      double sum = 0; //initial value for the sum
      //checks if there are tetrahedrons present
      if (numberOfTetrahedrons() != 0) {
         //loops through all tetrahedrons in array
         for (int i = 0; i < tList.length; i++) {
            //checks if array element is null
            if (tList[i] != null) {
               //add surface area of object to running sum
               sum += tList[i].surfaceArea();
            }
         }
         return sum / numberOfTetrahedrons(); //returns average
      }
      return sum; //returns 0
   }
   
   
   
   /**
    *Calculates the average volume of Tetrahedron objects in the array.
    *
    *@return Double value for average volume of Tetrahedron objects
    *in the array.
    */
   public double averageVolume() {
      double sum = 0; //initial value for the sum
      //checks if there are tetrahedrons present
      if (numberOfTetrahedrons() != 0) {
         //loops through all tetrahedrons in array
         for (int i = 0; i < tList.length; i++) {
            //checks if array element is null
            if (tList[i] != null) {
               //add volume of object to running sum
               sum += tList[i].volume();
            }
         }
         return sum / numberOfTetrahedrons(); //returns average
      }
      return sum; //returns 0
   }
   
   
   
   /**
    *Gives a String description of a TetrahedronList object.
    *
    *@return String description of the TetrahedronList object.
    */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----";
      output += "\nNumber of Tetrahedrons: " + numberOfTetrahedrons();
      output += "\nTotal Surface Area: " + fmt.format(totalSurfaceArea())
         + " square units";
      output += "\nTotal Volume: " + fmt.format(totalVolume()) + " cubic units";
      output += "\nAverage Surface Area: " + fmt.format(averageSurfaceArea())
         + " square units";
      output += "\nAverage Volume: " + fmt.format(averageVolume())
         + " cubic units";
      return output;
   }
   
   
   
   /**
    *Returns the array of Tetrahedron objects.
    *
    *@return The array of Tetrahedron objects.
    */
   public Tetrahedron[] getList() {
      return tList;
   }
   
   
   
   /**
    *Creates a new Tetrahedron object, increments the number of tetrahedrons,
    *and creates a new array with a length for a new Tetrahedron, copies the
    *previous objects into the new list, and adds the new object into the list.
    *
    *@param labelIn The name of the new Tetrahedron.
    *@param edgeIn The edge length of the new Tetrahedron.
    */
   public void addTetrahedron(String labelIn, double edgeIn) {
     //new Tetrahedron object
      Tetrahedron t = new Tetrahedron(labelIn, edgeIn);
      numberOfTetrahedron++; //increment the count
      
      //new array with larger size for new object
      Tetrahedron[] newTList = new Tetrahedron[numberOfTetrahedron];
      
      //loop to copy previous array elements to new array
      for (int i = 0; i < numberOfTetrahedron - 1; i++) {
         newTList[i] = tList[i];
      }
      
      //adds new tetrahedron to new array
      newTList[numberOfTetrahedron - 1] = t;
      
      //object now points to value of new array
      tList = newTList;
   }
   
   
   
   /**
    *Finds and returns a Tetrahedron object with a given String name
    *from the array returns null if none are found.
    *
    *@param labelIn The name of the Tetrahedron object to be identified.
    *@return The matching Tetrahedron object, or, if none, null.
    */
   public Tetrahedron findTetrahedron(String labelIn) {
     //loop to check if there is a matching label
      for (int i = 0; i < numberOfTetrahedron; i++) {
         //checks if element is null
         if (tList[i] != null) {
            //checks for matching label
            if (tList[i].getLabel().equalsIgnoreCase(labelIn)) {
               return tList[i]; //returns object with matching label
            }
         }
      }
      return null; //returns null if no matches
   }
   
   
   
   /**
    *Searches for and if found, deletes a Tetrahedron object from the array
    *if no match is found then null is returned.
    *
    *@param labelIn The name of the Tetrahedron object to be identified.
    *@return The Tetrahedron that was deleted, or null if none are deleted.
    */
   public Tetrahedron deleteTetrahedron(String labelIn) {
     //loop to check for matching label
      for (int i = 0; i < numberOfTetrahedron; i++) {
         //check if element is null
         if (tList[i] != null) {
            //checks for matching label
            if (tList[i].getLabel().equalsIgnoreCase(labelIn)) {
               //identifies and stores tetrahedron to be deleted
               Tetrahedron t = findTetrahedron(labelIn);
               //loop starting at matching element that shifts all elements left
               for (int j = i; j < numberOfTetrahedron - 1; j++) {
                  //element to the right is now takes place of current element
                  tList[j] = tList[j + 1]; //"deletes" first element
               }
            
               //deletes the duplicate object at end of array
               tList[numberOfTetrahedron - 1] = null;
            
               numberOfTetrahedron--; //decrements number of objects
            
               return t; //returns deleted object
            }
         }
      }
         
      return null; //returns null
   }
   
   
   
   /**
    *If match is found returns true and sets the matching Tetrahedron object
    *to a new edge length, and if no match is found returns false.
    *
    *@param labelIn Label for the Tetrahedron object to be identified.
    *@param edgeIn New edge length for the Tetrahedron object.
    *@return Whether a matching object was found and edited or not.
    */
   public boolean editTetrahedron(String labelIn, double edgeIn) {
      boolean result = false; //initial boolean value
      
      //locating the object in the array
      Tetrahedron t = findTetrahedron(labelIn);
      
      //checks if object is present
      if (t != null) {
         t.setEdge(edgeIn); //assigning new edge length
         result = true; //update boolean value
      }
      
      return result; //return true/false
   }
   
   
   
   /**
    *Finds the Tetrahedron object in the array with the largest volume.
    *
    *@return The Tetrahedron object with the largest volume in the array.
    */
   public Tetrahedron findTetrahedronWithLargestVolume() {
      double largest = 0; //initial value of the largest volume
      int indexOfLargest = 0; //index of element with largest volume
      int index = 0; //index for while loop
      
      //checks of objects are present
      if (numberOfTetrahedron != 0) {
         //while loop for array
         while (index < tList.length) {
            //check if array element is null
            if (tList[index] != null) {
               //checks if there is a bigger volume
               if (largest < tList[index].volume()) {
                  //if bigger assigns volume of element to value of largest
                  largest = tList[index].volume();
                  //update index of element with largest volume
                  indexOfLargest = index;
               }
            }
            
            index++; //increment index
         }
         
         return tList[indexOfLargest]; //returns obj with largest volume
      }
      
      return null; //returns null
   }
}