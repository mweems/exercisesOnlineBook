package chapters.chapter6;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ScientistTest {

    @Test
    public void allTenAtomsShouldDecayAfterFiveYears(){
        Scientist scientist = new Scientist();
        assertEquals("After 5 years there are 0 live atoms out of 10", scientist.experiment(10,5));
    }
}
