package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.*;

public class CapitalizeTest {

    @Test
    public void shouldReturnCapitalizedVersionOfLowerCaseArgument(){
        assertEquals("Matt", Capitalize.capitalize("matt"));
    }

    @Test
    public void shouldReturnCapitalizedVersionOfUpperCaseArgument(){
        assertEquals("Matt", Capitalize.capitalize("MATT"));
    }

    @Test
    public void shouldReturnCapitalizedVersionOfMixedCaseArgument(){
        assertEquals("Matt", Capitalize.capitalize("mAtT"));
    }

    @Test
    public void shouldPrintErrorMessageWhenWordBeginsWithNumber(){
        assertEquals("word must start with a letter", Capitalize.capitalize("1att"));
    }
}
