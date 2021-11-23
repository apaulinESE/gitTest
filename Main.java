

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Long> hashV = new ArrayList<Long>();
        EfficientModularExponential efficientModularExponential = new EfficientModularExponential();

        System.out.println("Aufgabe 2) b: 7^151 mod 15 = " + efficientModularExponential.efficientModEx(7, 151, 15) + "\n \n \n"); //a --> basis, b --> anfangswert


        for (int i = 1; i < 100000; i++) {

            long z = efficientModularExponential.efficientModEx(50, i, 999983); //a --> basis, b --> anfangswert, m --> grosse primzahl
            System.out.println(z);
            if (i % 20 == 0){
                System.out.println("-------------i = " + i);
            }

            if (hashV.contains(z)){
                System.out.println("Collision for i (starting value that we want to encrypt) = " + i + " and z (Hash-value) = " + z);
                break; //from this point on every new z will be a collision. --> remove break-statement to test
            }

            if (z != 0) {
                hashV.add(z);
            }
        }
    }
}
