package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.*;

public class RandomWordTest {

    @Test
    public void wordLengthShouldBeOneCharacter(){
        String word = RandomWord.randomWord(1);
        assertEquals(1, word.length());
    }

    @Test
    public void wordLengthShouldBeTwoCharacters(){
        String word = RandomWord.randomWord(2);
        assertEquals(2, word.length());
    }

    @Test
    public void wordLengthShouldBeTwentySixCharacters(){
        String word = RandomWord.randomWord(26);
        assertEquals(26, word.length());
    }

    @Test
    public void wordLengthShouldBeRandom(){
        String word = RandomWord.randomWordLength();
        assertNotNull(word);
    }







}
