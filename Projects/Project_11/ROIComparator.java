import java.util.Comparator;
/**
 *Program that will be used to sort MarketingCampaign objects from highest ROI
 *to lowest.
 *
 *Project 10
 *@author Jacob Munroe - COMP 1213 - 001
 *@version 04/07/2021
 */
public class ROIComparator implements Comparator<MarketingCampaign> {

   /**
    *Compare method for two different MarketingCampaign objects, returns an int
    *value representing if an object is greater than, less than, or equal to
    *another.
    *
    *@param obj1 First object used to compare.
    *@param obj2 Second object used to compare.
    *@return Int value represent the order of the two objects.
    */
   public int compare(MarketingCampaign obj1, MarketingCampaign obj2) {
     //if obj1 is less than obj2
      if (obj1.calcROI() < obj2.calcROI()) {
         return 1; //return pos
      }
      //if obj1 is greater than obj2
      else if (obj1.calcROI() > obj2.calcROI()) {
         return -1; //return neg
      }
      //if equal
      else {
         return 0; //return 0
      }
   }
}