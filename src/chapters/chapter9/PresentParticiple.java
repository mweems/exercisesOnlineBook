package chapters.chapter9;

import java.util.ArrayList;
import java.util.Arrays;

public class PresentParticiple {

    private static String participle;

    public static String presentParticiple(String word) {
        participle = "";
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char[] letter = word.toCharArray();
        if((letter[letter.length-1] == 'e') && (vowels.contains(letter[letter.length - 2]))){
            participle = word + "ing";
        } else if((!vowels.contains(letter[letter.length - 1])) && (vowels.contains(letter[letter.length - 2]))){
            participle = word + letter[letter.length - 1] + "ing";
        }  else if ((letter[letter.length-1] == 'e') && (!vowels.contains(letter[letter.length - 2]))){
            participle = word.replace("e", "ing");
        } else {
            participle = word + "ing";
        }
        return participle;
    }
}
