package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.*;

public class PalindromeTest {

    @Test
    public void shouldReturnTrueWhenGivenMom(){
        assertTrue(Palindrome.isPalindrome("mom"));
    }

    @Test
    public void shouldReturnFalseWhenGivenBat(){
        assertFalse(Palindrome.isPalindrome("bat"));
    }

    @Test
    public void shouldReturnTrueWhenGivenPalindromeSentence(){
        assertTrue(Palindrome.isPalindrome("Madam, I'm Adam"));
    }
}
