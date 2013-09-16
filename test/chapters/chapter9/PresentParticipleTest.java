package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PresentParticipleTest {

    @Test
    public void shouldReturnSeeingWhenGivenSee(){
        assertEquals("seeing", PresentParticiple.presentParticiple("see"));
    }

    @Test
    public void shouldReturnTimingWhenGivenTime(){
        assertEquals("timing", PresentParticiple.presentParticiple("time"));
    }

    @Test
    public void shouldReturnProgrammingWhenGivenProgram(){
        assertEquals("programming", PresentParticiple.presentParticiple("program"));
    }

    @Test
    public void shouldReturnWalkingWhenGivenWalk(){
        assertEquals("walking", PresentParticiple.presentParticiple("walk"));
    }
}
