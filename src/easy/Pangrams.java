/**
 * Problem: Pangrams
 * Link: https://www.hackerrank.com/challenges/pangrams/problem
 *
 * Description:
 * A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet.
 * Ignore case. Return either pangram or not pangram as appropriate.
 */

package easy;
import java.util.*;

public class Pangrams {
    public static String pangrams(String s) {
        String inputText = s.toLowerCase();
        Set<Character> uniqueLetters = new HashSet<>();

        for (char currentChar : inputText.toCharArray()) {
            if (currentChar >= 'a' && currentChar <= 'z') {
                uniqueLetters.add(currentChar);
            }
        }

        if(uniqueLetters.size() == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }

    }
}
