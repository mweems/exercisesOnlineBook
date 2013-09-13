package chapters.chapter4;

import chapters.Chapter4.BeerSong;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BeerSongTest {

    @Test
    public void printTheWordsToBeerSong(){
        BeerSong song = new BeerSong();
        assertEquals("song played", song.sing(10));
        assertEquals("song played", song.sing(2));
    }
}
