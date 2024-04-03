import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *Test file for the Tetrahedron class.
 *
 *Project 7B
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 03/19/2021
 */
public class TetrahedronTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**Tests the getLabel method.**/
   @Test public void labelTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals("Incorrect Method", "Small Example",
         example1.getLabel());
   }
   
   /**Tests the setLabel method.**/
   @Test public void setLabelTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      example1.setLabel("example");
      Assert.assertEquals("Incorrect Method", "example", example1.getLabel());
      example1.setLabel(null);
      Assert.assertEquals("Incorrect Method", "example", example1.getLabel());
   }
   
   /**Tests the getEdge method.**/
   @Test public void edgeTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals("Incorrect Method", 0.5, example1.getEdge(), 0.01);
   }
   
   /**Tests the setEdge method.**/
   @Test public void setEdgeTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      example1.setEdge(2);
      Assert.assertEquals("Incorrect Method", 2, example1.getEdge(), 0.01);
      example1.setEdge(-1);
      Assert.assertEquals("Incorrect Method", 2, example1.getEdge(), 0.01);
   }
   
   /**Tests the height method.**/
   @Test public void heightTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      example1.height();
      Assert.assertEquals("Incorrect Method", 0.408, example1.height(), 0.001);
   }
   
   /**Tests the surfaceArea method.**/
   @Test public void surfaceAreaTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      example1.surfaceArea();
      Assert.assertEquals("Incorrect Method", 0.433, example1.surfaceArea(),
         0.001);
   }
   
   /**Tests the volume method.**/
   @Test public void volumeTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      example1.volume();
      Assert.assertEquals("Incorrect Method", 0.015, example1.volume(), 0.001);
   }
   
   /**Tests the toString method.**/
   @Test public void toStringTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      example1.toString();
      Assert.assertTrue(example1.toString().contains("\"Small Example\""));
   }
   
   /**Tests the getCount method.**/
   @Test public void countTest() {
      Tetrahedron.resetCount();
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals("Incorrect Method", 1, Tetrahedron.getCount());
   }
   
   /**Tests the resetCount method.**/
   @Test public void resetCount() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron("Medium Example", 12.8);
      Tetrahedron example3 = new Tetrahedron("Small Example", 97.36);
      Tetrahedron.resetCount();
      Assert.assertEquals("Incorrect Method", 0, Tetrahedron.getCount());
   }
   
   /**Tests the equals method.**/
   @Test public void equalsTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example1A = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals("Incorrect Method", true,
         example1.equals(example1A));
      
      Tetrahedron example1B = new Tetrahedron("Minuscule Example", 0.5);
      Assert.assertEquals("Incorrect Method", false,
         example1.equals(example1B));
      
      Tetrahedron example1C = new Tetrahedron("Small Example", 12.8);
      Assert.assertEquals("Incorrect Method", false,
         example1.equals(example1C));
   }
   
   /**Tests the equals method for a false value.**/
   @Test public void equalsTest2() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Object obj = new Object();
      
      Assert.assertFalse(example1.equals(obj));
   }
   
   /**Tests the hashCode method.**/
   @Test public void hashCodeTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals("Incorrect Method", 0, example1.hashCode());
   }
   
    /**Tests the compareTo method for equivalent Customer objects.**/
   @Test public void compareToTest1() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example1B = new Tetrahedron("Minuscule Example", 0.5);
      
      Assert.assertTrue(example1.compareTo(example1B) == 0);
   }
   
   /**Tests the compareTo method for a negative return value.**/
   @Test public void compareToTest2() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example1B = new Tetrahedron("Minuscule Example", 12.8);
      
      Assert.assertTrue(example1.compareTo(example1B) < 0);
   }
   
   /**Tests the compareTo method for a positive return value.**/
   @Test public void compareToTest3() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 12.8);
      Tetrahedron example1B = new Tetrahedron("Minuscule Example", 0.5);
      
      Assert.assertTrue(example1.compareTo(example1B) > 0);
   }

   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */
}
