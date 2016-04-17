package codegym;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 17.04.2016.
 */
public class JoinCharacters {

    public int join(char[] input) {
        int CHAR_ZERO_INDEX = 48;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            int charToIntValue = (int) input[i] - CHAR_ZERO_INDEX;
            for (int j = 1; j < input.length - i; j++) {
                charToIntValue *= 10;
            }
            sum += charToIntValue;
        }
        return sum;
    }
}
