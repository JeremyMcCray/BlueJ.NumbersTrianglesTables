


public class NumberUtilities {

    public static String getRange(int stop) {
      String solu = "";
      for(int i=0; i<stop;i++){
        solu+= i;
      }

        return solu;
    }

    public static String getRange(int start, int stop) {
      String solu = "";
      for(int i = start; i <stop;i++){
        solu+=i;
      }
        return solu;
    }


    public static String getRange(int start, int stop, int step) {
      String solu = "";
      for(int i = start; i <stop;i+=step){
        solu+=i;

      }
       return solu;
    }

    public static String getEvenNumbers(int start, int stop) {
      String solu = "";
      for(int i = start;i<stop;i++){
        if(i%2==0){
          solu+=i;
        }
      }
        return solu;
    }


    public static String getOddNumbers(int start, int stop) {
      String solu = "";
      for(int i = start;i<stop;i++){
        if(i%2==1){
          solu+=i;
        }
      }
        return solu;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
      String solu = "";
      int temp = 0;
      for(int i = start;i<=stop;i++){
        temp = (int)Math.pow(i,exponent);

        solu+=temp;
        temp=0;
        }
         return solu;
      }

    }
