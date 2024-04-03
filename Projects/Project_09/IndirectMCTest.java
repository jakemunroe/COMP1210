import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *Test class for IndirectMC.java.
 *
 *Project 9
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/01/2021
 */
public class IndirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**Tests the getName and setName methods.*/
   @Test public void getNameSetNameTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals("Web Ads 1", mc1.getName());
      
      mc1.setName("Test");
      Assert.assertEquals("Test", mc1.getName());
   }
   
   /**Tests the getRevenue and setRevenue methods.*/
   @Test public void getRevenueSetRevenue() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals(15000.00, mc1.getRevenue(), 0.01);
      
      mc1.setRevenue(0.0);
      Assert.assertEquals(0.0, mc1.getRevenue(), 0.01);
   }
   
   /**Tests the getCount and resetCount methods.*/
   @Test public void getCountResetCount() {
      MarketingCampaign.resetCount();
      
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals(1, MarketingCampaign.getCount());
   }
   
   /**Tests the calcROI method.*/
   @Test public void calcROITest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals(0.7647, mc1.calcROI(), 0.01);
   }
   
   /**Tests the toString method.*/
   @Test public void toStringTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertTrue(mc1.toString().contains("Web Ads 1 "
         + "(class IndirectMC)"));
   }
   
   /**Tests the campaignCost method.*/
   @Test public void campaignCostTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals(8500.0, mc1.campaignCost(), 0.01);
   }
   
   /**Tests the getCostPerAd and setCostPerAd methods.*/
   @Test public void getCostSetCostTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals(2.0, mc1.getCostPerAd(), 0.01);
      
      mc1.setCostPerAd(2.5);
      Assert.assertEquals(2.5, mc1.getCostPerAd(), 0.01);
   }
   
   /**Tests the getNumberOfAds and setNumberOfAds methods.*/
   @Test public void getNumberSetNumberTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals(3500, mc1.getNumberOfAds());
      
      mc1.setNumberOfAds(200);
      Assert.assertEquals(200, mc1.getNumberOfAds());
   }
   
   /**Tests the getBaseCost method.*/
   @Test public void getBaseCostTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals(1500.0, mc1.getBaseCost(), 0.01);
   }


   /** A test that always fails. 
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */
}
