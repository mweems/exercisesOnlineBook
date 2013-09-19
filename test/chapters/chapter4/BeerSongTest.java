package chapters.chapter4;

import chapters.Chapter4.BeerSong;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BeerSongTest {

    BeerSong song = new BeerSong();


//    ByteArrayOutputStream BAOS = new ByteArrayOutputStream();
//    PrintStream PS = new PrintStream(BAOS);
//    System.setOut(PS);


    @Test
    public void returnsNothingWhenStartingAtZero(){
        assertEquals("", song.sing(0));
    }

    @Test
    public void returnsLyricsOnceWhenStartingAtOne(){
        assertEquals("1 Bottle of Beer on the wall\n" +
                "1 Bottle of Beer\n" +
                "Take 1 down\n" +
                "Pass it around\n" +
                "0 Bottles of Beer on the wall",song.sing(1));
    }

    @Test
    public void returnsLyricsTwiceAndCountDownWhenStartingAtTwo(){
        assertEquals("2 Bottles of Beer on the wall\n" +
                "2 Bottles of Beer\nTake 1 down\n" +
                "Pass it around\n" +
                "1 Bottle of Beer on the wall\n" +
                "1 Bottle of Beer on the wall\n" +
                "1 Bottle of Beer\n" +
                "Take 1 down\n" +
                "Pass it around\n" +
                "0 Bottles of Beer on the wall",song.sing(2));
    }
}
