package chapters.chapter9;

public class AddCommas {

    public static String addCommasToNumericString(String numString) {

        if(numString.length() <= 3) return numString;

        int numOfDigitsBeforeFirstComma =  numString.length() % 3;
        String numberWithCommas = "";

        if(numOfDigitsBeforeFirstComma == 0) numOfDigitsBeforeFirstComma = 3;
        for(int i=0; i < numOfDigitsBeforeFirstComma; i++) {
            numberWithCommas += numString.charAt(i);
        }

        for(int i=numOfDigitsBeforeFirstComma; i < numString.length(); i = i+3) {
            numberWithCommas += ",";
            numberWithCommas += numString.substring(i, i+3);
        }

        return numberWithCommas;
    }
}
