package chapters.chapter10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseCodeTest {

    @Test
    public void shouldReturnPeriodDashWhenGivenA(){
        MorseCode coder = new MorseCode();
        assertEquals(".- ", coder.encryptMessage("A"));
    }

    @Test
    public void shouldReturnPeriodDashPeriodDashWhenGivenAA(){
        MorseCode coder = new MorseCode();
        assertEquals(".- .- ", coder.encryptMessage("AA"));
    }

    @Test
    public void shouldReturnPeriodDashNewLinePeriodDashWhenGivenASpaceA(){
        MorseCode coder = new MorseCode();
        assertEquals(".- \n.- ", coder.encryptMessage("A A"));
    }

    @Test
    public void shouldReturnIgnoreAnyNonSpacePunctuationInMessage(){
        MorseCode coder = new MorseCode();
        assertEquals(".- .- \n-... ", coder.encryptMessage("AA .B"));
    }

    @Test
    public void shouldReturnEntireMessage(){
        MorseCode coder = new MorseCode();
        assertEquals("-..- .... .- - \n" +
                     ".... .- - .... \n" +
                     "--. --- -.. \n" +
                     "-..- .-. --- ..- --. .... - ", coder.encryptMessage("What Hath God Wrought"));
    }
}
