import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *Test program for DirectMC.java.
 *
 *Project 9
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/01/2021
 */
public class DirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**Tests the getName and setName methods.*/
   @Test public void getNameSetNameTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals("Ad Mailing", mc0.getName());
      
      mc0.setName("Test");
      Assert.assertEquals("Test", mc0.getName());
   }
   
   /**Tests the getRevenue and setRevenue methods.*/
   @Test public void getRevenueSetRevenue() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(10000.00, mc0.getRevenue(), 0.01);
      
      mc0.setRevenue(0.0);
      Assert.assertEquals(0.0, mc0.getRevenue(), 0.01);
   }
   
   /**Tests the getCount and resetCount methods.*/
   @Test public void getCountResetCount() {
      MarketingCampaign.resetCount();
      
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(1, MarketingCampaign.getCount());
   }
   
   /**Tests the calcROI method.*/
   @Test public void calcROITest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(0.4286, mc0.calcROI(), 0.01);
   }
   
   /**Tests the toString method.*/
   @Test public void toStringTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertTrue(mc0.toString().contains("Ad Mailing (class DirectMC)"));
   }
   
   /**Tests the campaignCost method.*/
   @Test public void campaignCostTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(7000.0, mc0.campaignCost(), 0.01);
   }
   
   /**Tests the getCost and setCost methods.*/
   @Test public void getCostSetCostTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(3.0, mc0.getCostPerMailPiece(), 0.01);
      
      mc0.setCostPerMailPiece(2.5);
      Assert.assertEquals(2.5, mc0.getCostPerMailPiece(), 0.01);
   }
   
   /**Tests the getNumber and setNumber methods.*/
   @Test public void getNumberSetNumberTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(2000, mc0.getNumberOfMailPieces());
      
      mc0.setNumberOfMailPieces(100);
      Assert.assertEquals(100, mc0.getNumberOfMailPieces());
   }

   /** A test that always fails.
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */
}
