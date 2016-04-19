package codegym;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 19.04.2016.
 */
class Alphabet {
    boolean check(String input) {
        int ALPHABETIC_SIZE = 26;
        Set<Character> characters = new HashSet<Character>(input.length());
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)){
                characters.add(c);
            }
        }

        return characters.size() >= ALPHABETIC_SIZE;
    }
}
