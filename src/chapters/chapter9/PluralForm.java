package chapters.chapter9;

import java.util.ArrayList;
import java.util.Arrays;

public class PluralForm {


    private static String plural = "";

    public static String regularPluralForm(String word) {
        ArrayList<Character> ending = new ArrayList<Character>(Arrays.asList('s','x','z','h'));
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char[] letter = word.toCharArray();
        if((letter[letter.length -1] == ('y')) && (!vowels.contains(letter[letter.length - 2]))){
            plural = word.replace("y", "ies");
        } else if(ending.contains(letter[letter.length - 1])){
            plural = word + "es";
        } else {
            plural = word + "s";
        }
        return plural;
    }
}
