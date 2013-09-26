package chapters.basicExercises;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CollectionTest {

    Collection collection = new Collection();

    @Test
    public void shouldTakeTwoCollectionsOfStringsAndReturnAllTheStringsFromBothCollections(){
        ArrayList<String> firstSet = new ArrayList<String>();
        ArrayList<String> secondSet = new ArrayList<String>();
        firstSet.add("Hello");
        secondSet.add("World");
        String expected = "Hello World";
        assertEquals(expected, collection.combineStrings(firstSet, secondSet));
    }

    @Test
    public void shouldReturnBillsPhoneNumberWhenGivenBillsName(){
        assertEquals("832-367-0666", collection.phoneNumber("Bill"));
    }

    @Test
    public void shouldReturnAllNamesAndPhoneNumbersInPhoneNumberMap(){
        String expected = "Archer, 818-555-1234; " +
                           "Bill, 832-367-0666; " +
                           "Lana, 818-555-4321; ";
        assertEquals(expected, collection.listAll());
    }
}
