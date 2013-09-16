package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.*;

public class EnglishConsonantTest {

    @Test
    public void returnTrueWhenPassedAnEnglishConsonant(){
        assertTrue(EnglishConsonant.isEnglishConsonant('h'));
    }

    @Test
    public void returnFalseWhenPassedAnEnglishVowel(){
        assertFalse(EnglishConsonant.isEnglishConsonant('a'));
    }
}
