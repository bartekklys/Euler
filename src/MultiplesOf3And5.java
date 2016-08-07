/**
 * Created by bartek on 07.08.16.
 */
public class MultiplesOf3And5 {

    public int calculate(int bound){
        int sum = 0;
        for (int i = 0; i < bound; i++){
            if(i%3==0 || i%5==0){
                    sum += i;
            }
        }
        return sum;
    }
}
