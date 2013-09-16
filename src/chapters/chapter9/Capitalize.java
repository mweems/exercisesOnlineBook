package chapters.chapter9;

import static java.lang.Character.isLetter;
import static java.lang.Character.toUpperCase;

public class Capitalize {
    public static String capitalize(String word) {
        String fixedWord = "";
        char firstLetter = word.charAt(0);
        if(isLetter(firstLetter)){
            char upCased = toUpperCase(firstLetter);
            fixedWord += upCased;
        } else {
            return "word must start with a letter";
        }
        fixedWord += word.toLowerCase().substring(1);
        return fixedWord;
    }
}
