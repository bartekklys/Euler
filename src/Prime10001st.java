import java.util.ArrayList;
import java.util.List;

public class Prime10001st {

    private static List<Integer> primeNumbers = new ArrayList<>();

    public static final int NO = 2000000;

    public static void main(String[] args) {

        int i = 0;
        long start = System.currentTimeMillis();
        while (i < NO) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
            i++;
        }
        long stop = System.currentTimeMillis();
        int sum = 0;
        System.out.println("SIZE: " + primeNumbers.size());
        for (Integer j :
                primeNumbers) {
            sum += j;
        }
        System.out.println("Czas: " + (stop - start) + "ms");
        System.out.println(sum);
        System.out.println(primeNumbers.get(primeNumbers.size()-1));
    }


    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        else if (number == 2 || number == 3 || number == 5) {
        return true;
        }
        else if (number % 2 == 0) {
            return false;
        }
        else if (number % 3 == 0) {
            return false;
        } else if (number % 5 == 0) {
            return false;
        } else {
            for (Integer i :
                    primeNumbers) {
                if (number % i == 0) {
                return false;
                }
            }
        }
        return true;
    }

}
