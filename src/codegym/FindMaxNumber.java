package codegym;

import java.util.Arrays;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 16.04.2016.
 */
public class FindMaxNumber {
    public int max(int[] input) {
        Arrays.sort(input);
        return input[input.length - 1];
    }
}
