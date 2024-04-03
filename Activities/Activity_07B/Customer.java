/**
 *Program that creates Customer objects and implements the Comparable
 *interface to perform actions and comparisons on Customer objects.
 *
 *Activity 7B
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 03/16/2021
 */
public class Customer implements Comparable<Customer> {
 
   /**String values for the Customer's name and location (town).**/
   private String name, location;
   
   /**Double value representing the Customer's current account balance.**/
   private double balance;
   
   /**
    *Constructor for a Customer object that takes a parameter for their name.
    *
    *@param nameIn String value for the Customer's name.
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
    *Allows the user to set a new location for a Customer.
    *
    *@param locationIn The new location for the Customer.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    *Allows the user to add or subtract from the current Customer balance.
    *
    *@param amount Adds amount to balance or if negative subtracts.
    */
   public void changeBalance(double amount) {
      balance += amount;
   }
   
   /**
    *Returns the current location of the Customer.
    *
    *@return The current location of the Customer.
    */
   public String getLocation() {
      return location;
   }
   
   /**
    *Returns the Customer's current balance.
    *
    *@return The current balance of the Customer.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    *Sets the Customer's location based on their city and state.
    *
    *@param city The city where the Customer is located.
    *@param state The state where the Customer is located.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
    *The description of a Customer object.
    *
    *@return The String description of a Customer object.
    */
   public String toString() {
      String output = name;
      output += "\n" + getLocation();
      output += "\n$" + getBalance();
      return output;
   }
   
   /**
    *Compares two Customer objects and determines which one has the 
    *greater balance or if they are equal.
    *
    *@param obj The object that will be compared to the current.
    *@return An integer representing greater/less than or equal to.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; //considers objs equal and return 0
      }
      else if (this.balance < obj.getBalance()) {
         return -1; //this obj less than param obj, return negative
      }
      else {
         return 1; //this obj greater than param obj, return positive
      }
   }
}