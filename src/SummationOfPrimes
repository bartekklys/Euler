package euler;

public class SummationOfPrimes {

    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i < 2000000; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    static boolean isPrime(int number) {
        boolean prime = true;
        double limit = Math.sqrt(number);
        if (number == 0 || number == 1) {
            prime = false;
        } else {
            for (int i = 2; i <= limit; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
