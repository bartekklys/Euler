package euler;

import java.math.BigInteger;

/**
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 * <p>
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */
public class SelfPowers {

    private static BigInteger SUM = new BigInteger("0");

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            BigInteger x = new BigInteger(String.valueOf(i)).pow(i);
            SUM = SUM.add(x);
        }
        String result = String.valueOf(SUM);
        System.out.println(result.substring(result.length() - 10));
    }
}
