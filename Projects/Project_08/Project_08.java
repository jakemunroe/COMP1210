/**
 *
 *
 *
 *
 *
 */
public class TetrahedronList {
 
   private String listName;
   
   private Tetrahedron[] tList;
   
   private int number;
   
   public TetrahedronList(String listNameIn, int numberIn, Tetrahedron... tListIn) {
      listName = listNameIn;
      tList = tListin;
      number = numberIn;
   }
}