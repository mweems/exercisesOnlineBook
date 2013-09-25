package chapters.chapter11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianTest {

    @Test
    public void shouldReturnTheValueAtIndexOneWhenGivenAnArrayWithThreeElements(){
        int[] array = {1,2,3};
        assertEquals(2, Median.findMedian(array));
    }

    @Test
    public void shouldReturnTheValueAtIndexThreeWhenGivenAnArrayWithFiveElements(){
        int[] array = {1,2,3,4,5};
        assertEquals(3, Median.findMedian(array));
    }

    @Test
    public void shouldReturnTheAverageOfIndexOneAndIndexTwoWhenGivenAnArrayWithFourElements(){
        int[] array = {1,2,4,5};
        assertEquals(3, Median.findMedian(array));
    }

    @Test
    public void shouldReturnTheMedianWhenGivenAnUnorderedArray(){
        int[] array = {3,1,2};
        assertEquals(2, Median.findMedian(array));
    }
}
