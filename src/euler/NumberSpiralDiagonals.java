package euler;

/**
 * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
 * <p>
 * 21 22 23 24 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 * <p>
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * <p>
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */
public class NumberSpiralDiagonals {

    public static void main(String[] args) {

        int sum = 1;

        for (int n = 3; n <= 1001; n += 2) {
            // RHS Diagonal Forward: n = 3,5,7,9, ... 1001
            // RHS Diagonal Forward = n^2
            sum += (n * n);

            // RHS Diagonal Backward: n = 3,5,7,9, ... 1001
            // RHS Diagonal Backward Limit = 1001*1001
            // RHS Diagonal Backward = (n-2)^2 + (n-1)
            sum += ((n - 2) * (n - 2) + (n - 1));

            // LHS Diagonal Forward: n = 3,5,7,9, ... 1001
            // LHS Diagonal Forward Limit = 1001*1001
            // LHS Diagonal Forward = (n-2)^2 + 2(n-1)
            sum += ((n - 2) * (n - 2) + 2 * (n - 1));

            // LHS Diagonal Backward: n = 3,5,7,9, ... 1001
            // LHS Diagonal Backward Limit = 1001*1001
            // LHS Diagonal Backward = (n-2)^2 + 3(n-1)
            sum += ((n - 2) * (n - 2) + 3 * (n - 1));
        }
        System.out.println("Problem 28: " + sum);
    }

}
