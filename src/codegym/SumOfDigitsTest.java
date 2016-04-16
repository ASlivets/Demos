package codegym;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jedyCoder on 16.04.2016.
 * with love ^^
 */
public class SumOfDigitsTest {

    @Test
    public void sumTest(){
        SumOfDigits sumOfDigits = new SumOfDigits();
        int actual = sumOfDigits.sum(1234);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void sumTestWithNegative() throws Exception {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int actual = sumOfDigits.sum(-256);
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    public void testLongValue() throws Exception {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int actual = sumOfDigits.sum(-2147483648);
        int expected = 47;
        assertEquals(expected, actual);
    }
}