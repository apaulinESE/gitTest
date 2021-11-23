

import java.util.ArrayList;

public class EfficientModularExponential {

   public EfficientModularExponential(){

    }

    public long efficientModEx(int a, int b, int m){
        String bBinary = Integer.toBinaryString(b);
        ArrayList<Integer> allBytes = new ArrayList<Integer>();
        for (long i = 0; i < bBinary.length(); i++){
            allBytes.add(Character.getNumericValue(bBinary.charAt((int) i)));
        }

        long i = 1;

       for (long j = 0; j < allBytes.size(); j++){

           i = i*i % m;
           if (allBytes.get((int) j) == 1){
               i = i * a % m;
           }
       }
        return i;
    }

}
