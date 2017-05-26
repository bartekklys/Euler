package euler;

import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 *
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
  *Find the sum of the digits in the number 100!
 */
public class FactorialDigitSum {

    public static void main(String[] args) {
        String result = String.valueOf(factorial(100));
        char[] array = result.toCharArray();

        int sum = 0;
        for (char c :
                array) {
            sum += Character.getNumericValue(c);
        }

        System.out.println(sum);
    }

    static BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = n ; i > 0 ; i--) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result;
    }
}
