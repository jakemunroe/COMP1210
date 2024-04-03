import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *Test class for SearchEngineMC.java.
 *
 *Project 9
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/01/2021
 */
public class SearchEngineMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**Tests the getName and setName methods.*/
   @Test public void getNameSetNameTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      
      Assert.assertEquals("Web Ads 2", mc2.getName());
      
      mc2.setName("Test");
      Assert.assertEquals("Test", mc2.getName());
   }
   
   /**Tests the getRevenue and setRevenue methods.*/
   @Test public void getRevenueSetRevenue() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      
      Assert.assertEquals(27500.00, mc2.getRevenue(), 0.01);
      
      mc2.setRevenue(0.0);
      Assert.assertEquals(0.0, mc2.getRevenue(), 0.01);
   }
   
   /**Tests the getCount and resetCount methods.*/
   @Test public void getCountResetCount() {
      MarketingCampaign.resetCount();
      
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      
      Assert.assertEquals(1, MarketingCampaign.getCount());
   }
   
   /**Tests the calcROI method.*/
   @Test public void calcROITest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      
      Assert.assertEquals(0.8966, mc2.calcROI(), 0.01);
   }
   
   /**Tests the toString method.*/
   @Test public void toStringTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      
      Assert.assertTrue(mc2.toString().contains("Web Ads 2 "
         + "(class SearchEngineMC)"));
   }
   
   /**Tests the campaignCost method.*/
   @Test public void campaignCostTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      
      Assert.assertEquals(14500.0, mc2.campaignCost(), 0.01);
   }
   
   /**Tests the getCostPerAd and setCostPerAd methods.*/
   @Test public void getCostSetCostTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      
      Assert.assertEquals(2.50, mc2.getCostPerAd(), 0.01);
      
      mc2.setCostPerAd(2.5);
      Assert.assertEquals(2.5, mc2.getCostPerAd(), 0.01);
   }
   
   /**Tests the getNumberOfAds and setNumberOfAds methods.*/
   @Test public void getNumberSetNumberTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      
      Assert.assertEquals(5000, mc2.getNumberOfAds());
      
      mc2.setNumberOfAds(200);
      Assert.assertEquals(200, mc2.getNumberOfAds());
   }
   
   /**Tests the getBaseCost method.*/
   @Test public void getBaseCostTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      
      Assert.assertEquals(2000.0, mc2.getBaseCost(), 0.01);
   }

   /** A test that always fails. 
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */
}
