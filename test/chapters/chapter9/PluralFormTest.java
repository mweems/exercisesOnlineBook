package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PluralFormTest {

    @Test
    public void shouldReturnWordsWhenGivenWord(){
        assertEquals("words", PluralForm.regularPluralForm("word"));
    }

    @Test
    public void shouldReturnBunniesWhenGivenBunny(){
        assertEquals("bunnies", PluralForm.regularPluralForm("bunny"));
    }

    @Test
    public void shouldReturnToysWhenGivenToy(){
        assertEquals("toys", PluralForm.regularPluralForm("toy"));
    }

    @Test
    public void shouldReturnBoxesWhenGivenBox(){
        assertEquals("boxes", PluralForm.regularPluralForm("box"));
    }
}
