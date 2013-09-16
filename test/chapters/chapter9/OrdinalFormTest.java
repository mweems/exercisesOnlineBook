package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OrdinalFormTest {

    @Test
    public void shouldReturn1stWhenPassed1(){
        assertEquals("1st", OrdinalForm.ordinalForm(1));
    }

    @Test
    public void shouldReturn2ndWhenPassed2(){
        assertEquals("2nd", OrdinalForm.ordinalForm(2));
    }

    @Test
    public void shouldReturn3rdWhenPassed3(){
        assertEquals("3rd", OrdinalForm.ordinalForm(3));
    }

    @Test
    public void shouldReturn4thWhenPassed4(){
        assertEquals("4th", OrdinalForm.ordinalForm(4));
    }

    @Test
    public void shouldReturn11thWhenPassed11(){
        assertEquals("11th", OrdinalForm.ordinalForm(11));
    }

    @Test
    public void shouldReturn21stWhenPassed21(){
        assertEquals("21st", OrdinalForm.ordinalForm(21));
    }
}
