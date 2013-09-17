package chapters.chapter9;

public class AddCommas {

    public static String addCommasToNumericString(String numString) {

        String newNumString = "";

        if(numString.length() > 3){
            int mod = numString.length()%3;
            char[] numArray = numString.toCharArray();

            if(mod == 0) mod = 3;

            for(int i = 0; i < mod; i++) newNumString += numArray[i];

            newNumString += ",";

            for(int i = mod; i < numString.length(); i++) newNumString += numArray[i];

        } else {
            newNumString = numString;
        }
        return newNumString;
    }


}
