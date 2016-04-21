package codegym;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 19.04.2016.
 */
class FirstUniqueCharacter {
    Character find(String s) {
        for (Character c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return c;
            }
        }
        return null;
    }
}
