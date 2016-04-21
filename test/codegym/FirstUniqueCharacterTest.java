package codegym;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 19.04.2016.
 */
public class FirstUniqueCharacterTest {
    @Test
    public void find() throws Exception {
        FirstUniqueCharacter uniqueCharacter = new FirstUniqueCharacter();
        Character actual = uniqueCharacter.find("aa");
        Character expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void findFirstW() throws Exception {
        FirstUniqueCharacter uniqueCharacter = new FirstUniqueCharacter();
        Character actual = uniqueCharacter.find("fgdebcanolmjkhivutsrqpyxfgdebcanolmjkhivutsrqpyxfgdebcanolmjkhivutsrqpyxfgdebcanolmjkhivutsrqpyxfw");
        Character expected = 'w';
        assertEquals(expected, actual);
    }

}