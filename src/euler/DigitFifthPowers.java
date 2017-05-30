package euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 * <p>
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 * As 1 = 14 is not a sum it is not included.
 * <p>
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * <p>
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class DigitFifthPowers {

    private static final int MAX_FIFTH_POWER = (9 ^ 5) * (9 ^ 5) * (9 ^ 5) * (9 ^ 5) * (9 ^ 5);
    private static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 2; i <= MAX_FIFTH_POWER; i++) {

            char[] array = String.valueOf(i).toCharArray();

            List<Integer> arraySum = new ArrayList<>();

            for (char c :
                    array) {
                arraySum.add(getFifthPower(c));
            }

            if (getSum(arraySum) == i) {
                result.add(i);
            }
        }
        System.out.println(getSum(result));
    }

    static int getFifthPower(char c) {
        int n = Character.getNumericValue(c);
        return n * n * n * n * n;
    }

    static int getSum(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
