package codegym;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 16.04.2016.
 */
public class SumOfDigits {
    public int sum(int number) {
        long l = (long) number;
        if(l < 0){
            l = 0 - l;
        }
        int sum = 0;
        while (l > 0){
            sum += l % 10;
            l /= 10;
        }
        return sum;
    }
}
