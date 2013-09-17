package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CeaserCypherTest {

    @Test
    public void shouldReturnEWhenGivenAAnd4(){
        assertEquals("E", CeaserCypher.encodeString("A",4));
    }

    @Test
    public void shouldReturnEFWhenGivenABand4(){
        assertEquals("EF", CeaserCypher.encodeString("AB",4));
    }

    @Test
    public void shouldLeaveCommaAsIs(){
        assertEquals("E,F", CeaserCypher.encodeString("A,B",4));
    }

    @Test
    public void shouldLoopBackToAWhenGivenZAnd1(){
        assertEquals("A", CeaserCypher.encodeString("Z",1));
    }

    @Test
    public void shouldLoopBackToBWhenGivenXand4(){
        assertEquals("B", CeaserCypher.encodeString("X",4));
    }

    @Test
    public void shouldEncodeLongerMessagesWithUpperAndLowerCaseLetters(){
        assertEquals("Lsa evi csy Teype?",CeaserCypher.encodeString("How are you Paula?",4));
    }


}
