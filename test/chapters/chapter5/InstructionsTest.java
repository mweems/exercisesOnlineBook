package chapters.chapter5;

import chapters.Chapter5.Instructions;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class InstructionsTest {

    Instructions needInstructions = new Instructions();

    @Test
    public void returnTrueWhenPassedInYes(){
        assertEquals(true, needInstructions.askYesNoQuestion("yes"));
    }

    @Test
    public void returnFalseWhenPassedInNo(){
        assertEquals(false, needInstructions.askYesNoQuestion("no"));
    }
}
