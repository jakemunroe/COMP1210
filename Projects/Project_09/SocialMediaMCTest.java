import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *Tests class for SocialMediaMC.java.
 *
 *Project 9
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/01/2021
 */
public class SocialMediaMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**Tests the getName and setName methods.*/
   @Test public void getNameSetNameTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals("Web Ads 3", mc3.getName());
      
      mc3.setName("Test");
      Assert.assertEquals("Test", mc3.getName());
   }
   
      /**Tests the getRevenue and setRevenue methods.*/
   @Test public void getRevenueSetRevenue() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(35000.00, mc3.getRevenue(), 0.01);
      
      mc3.setRevenue(0.0);
      Assert.assertEquals(0.0, mc3.getRevenue(), 0.01);
   }
   
   /**Tests the getCount and resetCount methods.*/
   @Test public void getCountResetCount() {
      MarketingCampaign.resetCount();
      
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(1, MarketingCampaign.getCount());
   }
   
   /**Tests the calcROI method.*/
   @Test public void calcROITest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(0.2963, mc3.calcROI(), 0.01);
   }
   
   /**Tests the toString method.*/
   @Test public void toStringTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertTrue(mc3.toString().contains("Web Ads 3 "
         + "(class SocialMediaMC)"));
   }
   
   /**Tests the campaignCost method.*/
   @Test public void campaignCostTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(27000.0, mc3.campaignCost(), 0.01);
   }
   
   /**Tests the getCostPerAd and setCostPerAd method.*/
   @Test public void getCostSetCostTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(3.0, mc3.getCostPerAd(), 0.01);
      
      mc3.setCostPerAd(2.5);
      Assert.assertEquals(2.5, mc3.getCostPerAd(), 0.01);
   }
   
   /**Tests the getNumberOfAds and setNumberOfAds methods.*/
   @Test public void getNumberSetNumberTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(8000, mc3.getNumberOfAds());
      
      mc3.setNumberOfAds(200);
      Assert.assertEquals(200, mc3.getNumberOfAds());
   }
   
   /**Tests the getBaseCost method.*/
   @Test public void getBaseCostTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(3000.0, mc3.getBaseCost(), 0.01);
   }

   /** A test that always fails. 
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */
}
