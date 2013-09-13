package chapters.chapter3;

import chapters.Chapter3.Conversion;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ConversionTest {

    Conversion convert = new Conversion();


    @Test
     public void returnCorrectNumberOfCentimetersInAFoot(){
        assertEquals(30.48, convert.toCM(1, 0));
    }

    @Test
     public void returnCorrectNumberOfCentimetersInTwoFeet(){
        assertEquals(60.96, convert.toCM(2, 0));
    }

    @Test
    public void returnCorrectNumberOfCentimetersWhenGivenOneInch(){
        assertEquals(2.54, convert.toCM(0, 1));
    }

    @Test
    public void returnCorrectBalanceAfterOneYear(){
        assertEquals("6255.00", convert.getInterest(6000.0,4.25,1));
    }

    @Test
    public void returnCorrectBalanceAfterTwoYears(){
        assertEquals("6520.84", convert.getInterest(6000.0,4.25,2));
    }

    @Test
    public void returnCorrectBalanceAfterThreeYears(){
        assertEquals("6797.97", convert.getInterest(6000.0,4.25,3));
    }

    @Test
    public void returnCircumferenceOfACircle(){
        assertEquals("314.00", convert.getRadius(10));
    }

    @Test
    public void returnTemperatureInCelsius(){
        assertEquals("100.00", convert.getCelsius(212));
    }

    @Test
    public void getAnswerFromMathmagicianProblem(){
        assertEquals(-50, convert.mathMagician());
    }

    @Test
    public void getWeightInPoundsAndOuncesFromKilos(){
        assertEquals("2 pounds 3.2 ounces", convert.kiloToPound(1));
    }

    @Test
    public void getTheAverageOfFourIntegers(){
        assertEquals(3.5, convert.avg(2,3,4,5));
    }

    @Test
    public void getTheTotalComingFromStIves(){
        assertEquals(2402 ,convert.stIves());
    }


}
