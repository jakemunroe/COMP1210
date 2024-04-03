/**
 *Program that creates instances of UserInfo objects and utilizes
 *their methods to print out information about the user.
 *
 *Activity 4
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/08/2021
 */
public class UserInfoDriver {

   /**
    *Creates UserInfo objects and calls on their methods.
    *
    *@param args Command Line arguments - not used.
    */
   public static void main(String [] args) {
      
      //New UserInfo object created with name "Pat Doe"
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      //Setting location of the user to "Auburn"
      user1.setLocation("Auburn");
      //Setting age of the user to 19
      user1.setAge(19);
      //Changing status of user to "ONLINE"
      user1.logOn();
      System.out.println("\n" + user1);
      
      //New UserInfo object created with name "Sam Jones"
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      //Setting age of the user to 21
      user2.setAge(21);
      //Chagning status of user to "ONLINE"
      user2.logOn();
      System.out.println("\n" + user2);
   }
}