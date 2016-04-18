package codegym;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 16.04.2016.
 */
public class FindMaxNumberTest {
    @Test
    public void testMax() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        int actual = maxNumber.max(new int[]{1,2,4,5});
        int expected = 5;
        assertEquals(expected, actual);
    }

}