package chapters.chapter9;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Character.toLowerCase;

public class Palindrome {


    public static boolean isPalindrome(String word) {
        ArrayList<Character> letters = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        char[] wordArray = word.toCharArray();
        ArrayList<Character> wordArrayList = new ArrayList<Character>();

        for(char letter: wordArray){
            if(letters.contains(toLowerCase(letter))){
             wordArrayList.add(letter);

            }
        }
        String editedWord = "";
        String reverseWord = "";

        for(int i = wordArrayList.size(); i > 0; i--){
            reverseWord += wordArrayList.get(i - 1);
        }

        for(int i = 0; i < wordArrayList.size(); i++){
            editedWord += wordArrayList.get(i);
        }

        if(reverseWord.toLowerCase().equals(editedWord.toLowerCase())) return true;
        return false;
    }
}
