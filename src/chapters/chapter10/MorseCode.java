package chapters.chapter10;

import java.util.*;

public class MorseCode {

    private HashMap<Character,String> morseCode = new HashMap<Character, String>(26);

    public MorseCode() {
    morseCode.put('A', ".-");
    morseCode.put('B', "-...");
    morseCode.put('C', "-.-.");
    morseCode.put('D', "-..");
    morseCode.put('E', ".");
    morseCode.put('F', "..-.");
    morseCode.put('G', "--.");
    morseCode.put('H', "....");
    morseCode.put('I', "..");
    morseCode.put('J', ".---");
    morseCode.put('K', "-.-");
    morseCode.put('L', ".-..");
    morseCode.put('M', "--");
    morseCode.put('N', "-.");
    morseCode.put('O', "---");
    morseCode.put('P', ".--.");
    morseCode.put('Q', "--.-");
    morseCode.put('R', ".-.");
    morseCode.put('S', "...");
    morseCode.put('T', "-");
    morseCode.put('U', "..-");
    morseCode.put('V', "...-");
    morseCode.put('W', "-..-");
    morseCode.put('Y', "-.--");
    morseCode.put('Z', "--..");
    }


    public String encryptMessage(String message) {
        String encryptedMessage = "";
        for(int i = 0; i < message.length(); i++){
            String symbol = getSymbol(message.toUpperCase().charAt(i));
            encryptedMessage += symbol;
        }
        return encryptedMessage;
    }

    private String getSymbol(char letter) {
            for(char key : morseCode.keySet()){
                if(key == letter){
                    return morseCode.get(key) + " ";
               } else if(letter == ' '){
                    return "\n";
               }
            }
        return "";
    }
}
