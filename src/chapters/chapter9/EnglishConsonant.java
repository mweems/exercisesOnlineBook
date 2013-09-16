package chapters.chapter9;

import java.util.ArrayList;
import java.util.Arrays;

public class EnglishConsonant {
    public static boolean isEnglishConsonant(char letter) {
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        if((letter >= 'A' && letter <= 'z') && (!vowels.contains(letter))){
                return true;
            }
        return false;
    }
}
