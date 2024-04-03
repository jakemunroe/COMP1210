/**
 *Program that will be used to create instances of UserInfo
 * and also creates the methods to be used.
 *
 *Activity 4
 *@author Jacob Munroe - COMP 1213
 *@version 02/02/2021
 */
public class UserInfo {
   // instance variables
   /**
    *String objects that will hold the users first name, last name,
    *and location.
    */
   private String firstName, lastName, location;
   /**
    *Integers that store the users age and online/offline status.
    */
   private int age, status;
   /**
    *OFFLINE status is indicated by 0 and ONLINE status is indicated by 1.
    */
   private static final int OFFLINE = 0, ONLINE = 1;
   //constructor
   /**
    *The constructor method for a UserInfo object that takes in a first name
    *and a last name.
    *
    *@param firstNameIn The users first name.
    *@param lastNameIn The users last name.
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   //methods
   /**
    *Allows for the location in UserInfo to be changed when called.
    *@param locationIn The location of the user.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    *Returns a boolean value that checks to see if the age has been 
    *set before by the user, and then changes the age if it has not 
    *yet been set
    *@param ageIn Takes an input for the age of the user.
    *@return Whether the age of the user has already been set or not.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    *Returns an integer value for the age value of the user.
    *
    *@return The current age value of the user.
    */
   public int getAge() {
      return age;
   }
   /**
    *Returns a String value for the location of the user.
    *
    *@return The current location of the user.
    */
   public String getLocation() {
      return location;
   }
   /**
    *Method that allows the user to change status from ONLINE to OFFLINE.
    */
   public void logOff() {
      status = OFFLINE;
   }
   /**
    *Method that allows the user to change status from OFFLINE to ONLINE.
    */
   public void logOn() {
      status = ONLINE;
   }
   /**
    *Returns a String value that prints out the current information
    *about a user including name, location, age, and status
    *
    *@return String representation of UserInfo Object
    */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
}