package chapters.chapter10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HistogramTest {

    @Test
    public void shouldReturnListOfRangesWithAsteriskInTheFirstRow(){
        Histogram histogram = new Histogram();
        assertEquals("0-9  |*\n" +
                     "10-19|\n" +
                     "20-29|\n" +
                     "30-39|\n" +
                     "40-49|\n" +
                     "50-59|\n" +
                     "60-69|\n" +
                     "70-79|\n" +
                     "80-89|\n" +
                     "90-99|\n" +
                     "100  |", histogram.createHistogram(8));
    }

    @Test
    public void shouldReturnListOfRangesWithAsterisksInProperPlacesAlongList(){
        Histogram histogram = new Histogram();
        assertEquals("0-9  |\n" +
                "10-19|\n" +
                "20-29|\n" +
                "30-39|\n" +
                "40-49|\n" +
                "50-59|\n" +
                "60-69|*\n" +
                "70-79|*\n" +
                "80-89|\n" +
                "90-99|**\n" +
                "100  |*", histogram.createHistogram(99,100,98,78,60));
    }
}
