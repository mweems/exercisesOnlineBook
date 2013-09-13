package chapters.chapter5;

import chapters.Chapter5.Quadratic;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class QuadraticTest {

    Quadratic formula = new Quadratic();

    @Test
    public void whenGivenOneNegativeFiveAndSixShouldReturnThreeAndTwo(){
        assertEquals("First = 3, Second = 2", formula.quadForm(1,-5,6));
    }

    @Test
    public void whenRootValueIsNegativeReturnStringMessage(){
        assertEquals("no solution", formula.quadForm(6,4,1));
    }
}
