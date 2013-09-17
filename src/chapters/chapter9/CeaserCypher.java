package chapters.chapter9;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Character.toLowerCase;

public class CeaserCypher {

    static ArrayList<Character> letters = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

    public static String encodeString(String message, int cypher) {
        char[] splitMessage = message.toCharArray();
        String codedMessage = "";
        for(char letter: splitMessage){
            int letterCode = -1;
            if(letters.contains(toLowerCase(letter))){
                letterCode = letter + cypher;
                if(letterCode > 90 && letterCode < 97 || letterCode > 122) letterCode -= 26;
            }
            if(letterCode < 0){
                codedMessage += letter;
            } else {
                codedMessage += ((char)letterCode);
            }
        }
        return codedMessage;

    }
}
