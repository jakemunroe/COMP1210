import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *Program that tests the TetrahedronList class.
 *
 *Project 08
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 03/25/2021
 */
public class TetrahedronListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**Tests if getName method returns the list name.**/
   @Test public void getNameTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      Assert.assertEquals("Test", test.getName());
   }
   
   /**Tests if numberOfTetrahedrons method returns proper value.**/
   @Test public void numberOfTetrahedrons() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      Assert.assertEquals(3, test.numberOfTetrahedrons());
      
      Tetrahedron[] list2 = {null, null, null, null};
      TetrahedronList test2 = new TetrahedronList("Test2", list2, 0);
      
      Assert.assertEquals(0, test2.numberOfTetrahedrons());
   }
   
   /**Tests if totalSurfaceArea method returns proper value.**/
   @Test public void totalSurfaceArea() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      Assert.assertEquals(16702.269, test.totalSurfaceArea(), 0.001);
      
      Tetrahedron[] list2 = {null, null, null};
      TetrahedronList test2 = new TetrahedronList("Test2", list2, 0);
      
      Assert.assertEquals(0, test2.totalSurfaceArea(), 0.001);
      
      Tetrahedron[] list3 = {example1, null, example3, example2};
      TetrahedronList test3 = new TetrahedronList("Test3", list3, 3);
      
      Assert.assertEquals(16702.269, test3.totalSurfaceArea(), 0.001);
   }
   
   /**Tests if totalVolume method returns proper value.**/
   @Test public void totalVolumeTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      Assert.assertEquals(109008.731, test.totalVolume(), 0.001);
      
      Tetrahedron[] list2 = {null, null, null};
      TetrahedronList test2 = new TetrahedronList("Test2", list2, 0);
      
      Assert.assertEquals(0, test2.totalVolume(), 0.001);
      
      Tetrahedron[] list3 = {example1, null, example3, example2};
      TetrahedronList test3 = new TetrahedronList("Test3", list3, 3);
      
      Assert.assertEquals(109008.731, test3.totalVolume(), 0.001);
   }
   
   /**Tests if averageSurfaceArea method returns proper value.**/
   @Test public void averageSurfaceArea() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      Assert.assertEquals(5567.423, test.averageSurfaceArea(), 0.001);
      
      Tetrahedron[] list2 = {null, null, null};
      TetrahedronList test2 = new TetrahedronList("Test2", list2, 0);
      
      Assert.assertEquals(0, test2.averageSurfaceArea(), 0.001);
      
      Tetrahedron[] list3 = {example1, null, example3, example2};
      TetrahedronList test3 = new TetrahedronList("Test3", list3, 3);
      
      Assert.assertEquals(5567.423, test3.averageSurfaceArea(), 0.001);
   }
   
   /**Tests if averageVolume method returns proper value.**/
   @Test public void averageVolumeTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      Assert.assertEquals(36336.244, test.averageVolume(), 0.001);
      
      Tetrahedron[] list2 = {null, null, null};
      TetrahedronList test2 = new TetrahedronList("Test2", list2, 0);
      
      Assert.assertEquals(0, test2.averageVolume(), 0.001);
      
      Tetrahedron[] list3 = {example1, null, example3, example2};
      TetrahedronList test3 = new TetrahedronList("Test3", list3, 3);
      
      Assert.assertEquals(36336.244, test3.averageVolume(), 0.001);
   }
   
   /**Tests if toString method prints proper statement.**/
   @Test public void toStringTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      Assert.assertTrue(test.toString().contains("Number of Tetrahedrons: 3"));
   }
   
   /**Tests if getList method returns proper array.**/
   @Test public void getListTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      Tetrahedron[] list2 = {example1, example2, example3};
      
      Assert.assertArrayEquals(test.getList(), list2);
   }
   
   /**Tests if addTetrahedron method adds a Tetrahedron object to the array.**/
   @Test public void addTetrahedronTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      test.addTetrahedron("Please Work", 2);
      
      Tetrahedron pleaseWork = new Tetrahedron("Please Work", 2);
      Tetrahedron[] list2 = {example1, example2, example3, pleaseWork};
      
      Assert.assertArrayEquals(test.getList(), list2);
      Assert.assertEquals(4, test.numberOfTetrahedrons());
   }
   
   /**Tests if findTetrahedron method returns the proper value.**/
   @Test public void findTetrahedronTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      Assert.assertEquals(example1, test.findTetrahedron("small example"));
      
      Assert.assertEquals(null, test.findTetrahedron("please work"));
   }
   
   /**Tests if deleteTetrahedron method removes the proper Tetrahedron object
    *and shifts the elements of the array down one.**/
   @Test public void deleteTetrahedronTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      test.deleteTetrahedron("medium example");
      
      Tetrahedron[] list2 = {example1, example3, null};
      
      Assert.assertArrayEquals(test.getList(), list2);
      Assert.assertEquals(2, test.numberOfTetrahedrons());
      Assert.assertEquals(null, test.deleteTetrahedron("not present"));
      
      Tetrahedron[] list3 = {example1, null, example3, example2};
      TetrahedronList test3 = new TetrahedronList("Test3", list3, 3);
      
      test3.deleteTetrahedron("large example");
      
      Assert.assertEquals(2, test3.numberOfTetrahedrons());
   }
   
   /**Tests if the editTetrahedron method changes the edge length on the
    *proper Tetrahedron object.**/
   @Test public void editTetrahedronTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      test.editTetrahedron("large example", 5);
      
      Tetrahedron example4 = new Tetrahedron("Large Example", 5.0);
      Tetrahedron[] list2 = {example1, example2, example4};
      
      Assert.assertArrayEquals(list, list2);
      
      Assert.assertEquals(false, test.editTetrahedron(null, 4));
   }
   
   /**Tests if findTetrahedronWithLargestVolume method returns the proper
    *Tetrahedron object.**/
   @Test public void findTetrahedronWithLargestVolumeTest() {
      Tetrahedron example1 = new Tetrahedron("Small Example", 0.5);
      Tetrahedron example2 = new Tetrahedron(" Medium Example ", 12.8);
      Tetrahedron example3 = new Tetrahedron("Large Example", 97.36);
      Tetrahedron[] list = {example1, example2, example3};
      TetrahedronList test = new TetrahedronList("Test", list, 3);
      
      Assert.assertEquals(example3, test.findTetrahedronWithLargestVolume());
      
      Tetrahedron[] list2 = {null, null, null};
      TetrahedronList test2 = new TetrahedronList("Test2", list2, 0);
      
      Assert.assertEquals(null, test2.findTetrahedronWithLargestVolume());
      
      Tetrahedron[] list3 = {example1, null, example3, example2};
      TetrahedronList test3 = new TetrahedronList("Test3", list3, 3);
      
      Assert.assertEquals(example3, test3.findTetrahedronWithLargestVolume());
   }


   /* A test that always fails.
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
