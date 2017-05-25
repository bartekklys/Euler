package euler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LargestPalindromeProduct {

    static Set<Integer> palindromes = new HashSet<>();

    public static void main(String[] args) {
        int threeDigitNumber = 100;
        while (threeDigitNumber < 1000) {
            for (int i = 100; i < 1000; i++) {
                int product = threeDigitNumber * i;
                if (isPalindrome(product)) {
                    palindromes.add(product);
                }

            }
            threeDigitNumber++;
        }

        System.out.println(palindromes.size());
        System.out.println("Max palindrome: " + Collections.max(palindromes));
    }

    static boolean isPalindrome(int number) {
        String stringValue = String.valueOf(number);
        return stringValue.equals(new StringBuilder(stringValue).reverse().toString());
    }
}