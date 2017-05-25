package euler;

import java.util.HashSet;
import java.util.Set;

public class CircularPrimes implements Problem {

    static Set<Integer> circularPrimes = new HashSet<>();

    @Override
    public void solve() {
        for (int i = 0; i < 1000000; i++) {
            if (Prime10001st.isPrime(i)) {
                if (isCircularPrime(i)) {
                    circularPrimes.add(i);
                }
            }
        }
        System.out.println("Problem 35: " + circularPrimes.size());
    }

    static boolean isCircularPrime(int primeNumber) {
        Set<String> permutations = generatePerm(String.valueOf(primeNumber));
        for (String s :
                permutations) {
            if (!Prime10001st.isPrime(Integer.valueOf(s))) {
                return false;
            }
        }
        return true;
    }

    static Set<String> generatePerm(String input) {
        Set<String> set = new HashSet<>();
        if (input == "")
            return set;

        Character a = input.charAt(0);

        if (input.length() > 1) {
            input = input.substring(1);

            Set<String> permSet = generatePerm(input);

            for (String x : permSet) {
                for (int i = 0; i <= x.length(); i++) {
                    set.add(x.substring(0, i) + a + x.substring(i));
                }
            }
        } else {
            set.add(a + "");
        }
        return set;
    }
}
