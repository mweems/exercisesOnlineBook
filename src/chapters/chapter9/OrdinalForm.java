package chapters.chapter9;

public class OrdinalForm {
    public static String ordinalForm(int num) {
        String numWord = String.valueOf(num);
        char[] numArray = numWord.toCharArray();
        if(numArray[numArray.length - 1] == '1'){
            if(numArray.length > 1 && numArray[numArray.length - 2] == '1'){
                numWord += "th";
            } else {
                numWord += "st";
            }

        } else if (numArray[numArray.length - 1] == '2'){
            numWord += "nd";
        } else if (numArray[numArray.length - 1] == '3'){
            numWord += "rd";
        }  else {
            numWord += "th";
        }
        return numWord;
    }
}
