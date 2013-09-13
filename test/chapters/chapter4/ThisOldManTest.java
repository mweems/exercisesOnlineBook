package chapters.chapter4;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ThisOldManTest {

    @Test
    public void printTheLyricsToThisOldMan(){
        ThisOldMan song = new ThisOldMan();
        assertEquals("song played", song.sing());
    }
}
