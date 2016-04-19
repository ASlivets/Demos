package codegym;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 19.04.2016.
 */
public class AlphabetTest {
    @Test
    public void check() throws Exception {
        Alphabet alphabet = new Alphabet();
        assertEquals(true, alphabet.check("\"abcdefghijklmnopqrstuvwxyz\""));
    }

}