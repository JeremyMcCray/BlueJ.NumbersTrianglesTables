

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
      String solu = "";

        for(int i=0;i<numberOfStars;i++){
            solu+= "*";
        }
        return solu;
      }




    public static String getTriangle(int numberOfRows) {
      String solu = "";

      for(int i=0;i<numberOfRows;i++){

        for (int j=0;j<=i;j++){
          solu+= "*";
          if(i==j){
          solu+="\n";
          }
        }

      }
        return solu;
    }


    public static String getSmallTriangle() {
      TriangleUtilities test1 = new TriangleUtilities();
      String solu = test1.getTriangle(4);
      return solu;

    }

    public static String getLargeTriangle() {
      String solu = "";

      for(int i=0;i<9;i++){

        for (int j=0;j<=i;j++){
          solu+= "*";
          if(i==j){
          solu+="\n";
          }
        }

      }
        return solu;

    }
}
