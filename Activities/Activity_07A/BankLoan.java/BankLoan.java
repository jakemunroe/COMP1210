/**
 *Program that creates BankLoan objects and allows for various 
 *operations to be performed on the objects.
 *
 *Activity 7
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 03/09/2021
 */
public class BankLoan {
	// constant fields
   /**Constant value for max loan amount.**/
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   /**Name of the customer.**/
   private String customerName;
   /**Customer's account balance and the current interest rate.**/
   private double balance, interestRate;
   /**Tracks the number of loans being created.**/
   private static int loansCreated = 0;

   /**
    *Constructor for a BankLoan object that takes in a customer's name and
    *an interest rate.
    *
    *@param customerNameIn The String value for the customer's name.
    *@param interestRateIn A double value for the interest rate.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
    *Returns true if the customer takes a loan and updates their balance,
    *returns false otherwise.
    *
    *@param amount A double value for the amount the customer borrows.
    *@return A boolean value representing whether a customer took out a loan.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

    /**
     *Returns a value representing how much a customer owes on their balance.
     *
     *@param amountPaid The amount that the customer is paying off.
     *@return The amount that the customer still owes.
     */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    *Returns a value for the customer's current balance.
    *
    *@return The double value for the customer's current balance.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    *Sets a new interest rate if given a valid value and returns true, otherwise
    *returns false.
    *
    *@param interestRateIn The new interest rate.
    *@return A boolean value representing if a new interest rate was set.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    *Returns the current interest rate.
    *
    *@return A double value for the current interest rate.
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    *Charges the current interest rate to the customer's balance and updates
    *their balance.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    *Returns a description of a BankLoan object.
    *
    *@return The string description of the BankLoan object.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
    *Checks to see if an input amount is valid, returns true if valid,
    *false otherwise.
    *
    *@param amount A double value for the input amount.
    *@return A boolean value representing whether or not the amount is valid.
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**
    *Checks to see if a customer has any debt, returns true if in debt,
    *false otherwise.
    *
    *@param loan BankLoan object that will be used.
    *@return A boolean value represething whether or not the customer
    *is in debt.
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
    *Returns how many loans have been created.
    *
    *@return The integer value for number of BankLoan objects created.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
    *Resets the number of loans that have been created to a value of 0.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

}
