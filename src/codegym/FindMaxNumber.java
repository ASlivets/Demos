package codegym;

import java.util.Arrays;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 16.04.2016.
 */
class FindMaxNumber {
    int max(int[] input) {
        Arrays.sort(input);
        return input[input.length - 1];
    }
}
