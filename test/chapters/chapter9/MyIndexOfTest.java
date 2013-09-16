package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MyIndexOfTest {

    @Test
    public void shouldReturn1WhenGivenWordITAndSearchCharT(){
        assertEquals(1, MyIndexOf.myIndexOf("it",'t'));
    }

    @Test
    public void shouldReturn2WhenGivenWordMattAndSearchCharT(){
        assertEquals(2,MyIndexOf.myIndexOf("matt", 't'));
    }
}
