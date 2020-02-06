

public class TableUtilities {

    public static String getSmallMultiplicationTable() {
        String solu = "";
      TableUtilities test1 = new TableUtilities();
      solu=test1.getMultiplicationTable(5);
        return solu;
    }

    public static String getLargeMultiplicationTable() {
        String solu = "";
      TableUtilities test2 = new TableUtilities();
      solu=test2.getMultiplicationTable(10);
        return solu;
    }

    public static String getMultiplicationTable(int tableSize) {
      String solu = "";
      for(int i=1;i<=tableSize;i++){
        for(int j=1;j<=tableSize;j++){

          if(i*j<10){
            solu+= "  ";
          }
          if(i*j>9 && i*j<100){
            solu+= " ";
          }
            solu+=(i*j)+" |";
          if(j==tableSize){
            solu+="\n";
          }
        }
      }
        return solu;
    }
}
