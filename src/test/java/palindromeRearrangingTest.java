import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class palindromeRearrangingTest {

    private PalindromeRearranging sut;

    @Test
    public void oneCharacterInString() {
        String checkingWord = "a";
        sut = new PalindromeRearranging(checkingWord);
        boolean result = sut.canBePalindrome(checkingWord);
        assertEquals(true, result);
    }

    @Test
    public void twoDifferentInString() {
        String checkingWord = "ab";
        sut = new PalindromeRearranging(checkingWord);
        boolean result = sut.canBePalindrome(checkingWord);
        assertEquals(false, result);
    }

    @Test
    public void twoSameCharacterInString() {
        String checkingWord = "aa";
        sut = new PalindromeRearranging(checkingWord);
        boolean result = sut.canBePalindrome(checkingWord);
        assertEquals(true, result);
    }

    @Test
    public void classicPalindrome() {
        String checkingWord = "ajkka";
        sut = new PalindromeRearranging(checkingWord);
        boolean result = sut.canBePalindrome(checkingWord);
        assertEquals(true, result);
    }

    @Test
    public void classicPalindromeWithSpaces() {
        String checkingWord = "kobyla ma maly bok";
        sut = new PalindromeRearranging(checkingWord);
        boolean result = sut.canBePalindrome(checkingWord);
        assertEquals(true, result);
    }

    @Test
    public void notPalindrome1() {
        String checkingWord = "zzzddd";
        sut = new PalindromeRearranging(checkingWord);
        boolean result = sut.canBePalindrome(checkingWord);
        assertEquals(false, result);
    }

    @Test
    public void notPalindrome2() {
        String checkingWord = "computer";
        sut = new PalindromeRearranging(checkingWord);
        boolean result = sut.canBePalindrome(checkingWord);
        assertEquals(false, result);
    }

    @Test
    public void notPalindromeWithSpace() {
        String checkingWord = "computer sdffhjhfrse";
        sut = new PalindromeRearranging(checkingWord);
        boolean result = sut.canBePalindrome(checkingWord);
        assertEquals(false, result);
    }
}
