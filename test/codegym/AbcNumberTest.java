package codegym;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 17.04.2016.
 */
public class AbcNumberTest {
    @Test
    public void convert() throws Exception {
        AbcNumber abcNumber = new AbcNumber();
        int expected = 123;
        assertEquals(expected, abcNumber.convert("bcd"));
    }

}