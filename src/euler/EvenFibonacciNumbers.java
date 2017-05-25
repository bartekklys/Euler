package euler;

/**
 * Created by bartek on 08.08.16.
 */
public class EvenFibonacciNumbers {
    public void fibonacci(){
        int limit=4000000;
        int sum=0;
        int a=1;
        int b=1;
        int c=a+b;
        while (c<limit) {
            sum = sum + c;

            a = b + c;
            b = c + a;
            c = a + b;
        }
        System.out.println(sum);
    }
}
