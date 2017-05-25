package euler;

import static java.lang.Math.pow;

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {

        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (a < b && b < c && a + b < 1000) {
                    if (pow(a, 2) + pow(b, 2) == pow(c, 2)) {
                        System.out.println(a*b*c);
                    }
                }
            }
        }
    }
}
