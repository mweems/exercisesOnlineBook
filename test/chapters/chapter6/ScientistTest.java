package chapters.chapter6;

import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.*;

public class ScientistTest {

    @Test
    public void sixAtomsShouldDecayAfterFirstYear(){
        Random rand = new Random(1);
        Scientist scientist = new Scientist(rand);
        assertEquals("Live atoms: 4, Decayed atoms: 6", scientist.experiment(10,1));
    }
}
