import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
/**
 *Program that will present a user with a menu where the user will select the
 *tasks to be performed by the system based on data that can be read in from
 *a file and added from the user.
 *
 *Project 6
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 02/25/2021
 */
public class ConeListMenuApp {
   
    /**
     *Prints out a menu and the user selects tasks to be performed by the
     *system on data read in and edited by the user.
     *
     *@param args Command Line arguments - not used.
     *@throws IOException Occurs if given invalid file name.
     */
   public static void main(String[] args) throws IOException {
      Scanner scan = new Scanner(System.in);
      String listName = "*** no list name assigned ***";
      ArrayList<Cone> listCones = new ArrayList<Cone>();
      ConeList list = new ConeList(listName, listCones);
      
      System.out.println("Cone List System Menu");
      System.out.println("R - Read File and Create Cone List");
      System.out.println("P - Print Cone List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Cone");
      System.out.println("D - Delete Cone");
      System.out.println("F - Find Cone");
      System.out.println("E - Edit Cone");
      System.out.println("Q - Quit");
      
      //do-while loop
      char input = 'Q';
      do {
         //Prompt user for action
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = scan.nextLine().toUpperCase().charAt(0);
      
         switch(input) {
            case 'R':
               System.out.print("\tFile name: ");
               String file = scan.nextLine();
               list = list.readFile(file);
               System.out.println("\tFile read in and Cone List created\n");
               break;
            case 'P':
               System.out.println("\n" + list);
               break;
            case 'S':
               System.out.println("\n" + list.summaryInfo() + "\n");
               break;
            case 'A':
               System.out.print("\tLabel: ");
               String label = scan.nextLine();
               System.out.print("\tHeight: ");
               double height = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius: ");
               double radius = Double.parseDouble(scan.nextLine());
               list.addCone(label, height, radius);
               System.out.println("\t*** Cone added ***\n");
               break;
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (list.findCone(label) != null) {
                  label = list.findCone(label).getLabel();
                  list.deleteCone(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (list.findCone(label) != null) {
                  System.out.println(list.findCone(label) + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               if (list.editCone(label, height, radius)) {
                  System.out.println("\t\"" + label
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (input != 'Q');
   }
}