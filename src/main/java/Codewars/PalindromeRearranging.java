package Codewars;
import java.util.HashSet;
import java.util.Set;

/**
 * This method take single String and check if it can be turned into palindrome.It works for
 * single word and whole sentence.
 */
class PalindromeRearranging {

    PalindromeRearranging(String checkingString) {
    }

    boolean canBePalindrome(String inputString) {
        inputString = inputString.replaceAll(" ", "");
        Set<Character> oddCharsArray = new HashSet<>();
        for (char c : inputString.toCharArray()) {
            if (!oddCharsArray.add(c)) {
                oddCharsArray.remove(c);
            }
        }
        return oddCharsArray.size() <= 1;
    }
}
