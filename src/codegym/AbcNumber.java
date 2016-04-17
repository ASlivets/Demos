package codegym;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 17.04.2016.
 */
public class AbcNumber {
    public int convert(String num) {
        final int charIndexOf_a = 97;
        int sum = 0;
        char [] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int charToInt = (int) chars[i] - charIndexOf_a;
            for (int j = 1; j < chars.length - i; j++) {
                charToInt *= 10;
            }
            sum += charToInt;
        }
        return sum;
    }
}
