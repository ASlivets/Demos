package codegym;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 17.04.2016.
 */
public class JoinCharactersTest {
    @Test
    public void join() throws Exception {
        JoinCharacters joiner = new JoinCharacters();
        char[] input = new char[]{'1', '2', '3'};
        int actual = joiner.join(input);
        int expected = 123;
        assertEquals(expected, actual);
    }

}