package chapters.chapter4;

import chapters.Chapter4.Fibonacci;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FibonacciTest {
        Fibonacci sequence = new Fibonacci();

    @Test
    public void returnArrayWithFibonacciSequenceUpTo1(){
        assertEquals("0,1,", sequence.getSequence(1));

    }

    @Test
    public void returnArrayWithFibonacciSequenceUpTo2(){
        assertEquals("0,1,1,", sequence.getSequence(2));

    }

     @Test
    public void returnArrayWithFibonacciSequenceUpTo15(){
         assertEquals("0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,", sequence.getSequence(15));
     }


}
