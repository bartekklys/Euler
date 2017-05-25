package euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PowerDigitSum {

    private static int POWER = 1000;

    public static void main(String[] args) {
        char[] array = String.valueOf(power(POWER)).toCharArray();
        List<Integer> result = new ArrayList<>();
        for (char c :
                array) {
            result.add(Character.getNumericValue(c));
        }
        System.out.println(result.stream().mapToInt(Integer::intValue).sum());
    }

    static BigInteger power(int power) {
        BigInteger two = new BigInteger("2");
        return two.pow(power);
    }
}
