package chapters.chapter5;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GoldenRatioTest {

    GoldenRatio formula = new GoldenRatio();

    @Test
    public void returnTheGoldenRation(){
        assertEquals("1.62", formula.ratio());
    }
}
