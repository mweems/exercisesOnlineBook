package chapters.chapter4;

import chapters.Chapter4.ThisOldMan;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ThisOldManTest {

    @Test
    public void printTheLyricsToThisOldMan(){
        ThisOldMan song = new ThisOldMan();
        assertEquals("song played", song.sing());
    }
}
