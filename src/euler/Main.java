package euler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bartek on 07.08.16.
 */
public class Main {

    public static void main(String[] args) {
        List<Problem> problems = new ArrayList<>();
        problems.add(new CircularPrimes());

        for (Problem p :
                problems) {
            long start = System.currentTimeMillis();
            p.solve();
            long stop = System.currentTimeMillis();

        }

    }
}
