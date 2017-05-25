package euler;

import java.math.BigInteger;

public class FibonacciNumber1000digit {

    private static int NUMBER = 0;
    private static BigInteger FIB;

    public static void main(String[] args) {
        while (String.valueOf(fibonacci1000digit(NUMBER)).length() < 1000) {
            FIB = fibonacci1000digit(NUMBER++);
        }
        System.out.println(NUMBER);
    }

    static BigInteger fibonacci1000digit(int n) {
        if (n == 0)
            return new BigInteger("0");
        else if (n == 1 || n == 2)
            return new BigInteger("1");
        else {
            BigInteger fib1 = new BigInteger("1");
            BigInteger fib2 = new BigInteger("1");
            BigInteger fibNext = new BigInteger("2");

            for (int i = 2; i < n; i++) {
                fibNext = fib1.add(fib2);
                fib1 = fib2;
                fib2 = fibNext;
            }
            return fibNext;
        }
    }
}
