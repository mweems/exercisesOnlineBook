package chapters.chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomWord {
    static ArrayList<Character> letters = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
    static Random rand = new Random();

    public static String randomWord(int length) {
        String word = "";
        for(int i = 0; i < length; i++){
            word += letters.get(rand.nextInt(26));
        }
        System.out.println(word);
        return word;
    }
}
