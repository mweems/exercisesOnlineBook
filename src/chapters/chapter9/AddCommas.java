package chapters.chapter9;

public class AddCommas {
    public static String addCommasToNumericString(String numString) {
        String newNum = "";
        String newNumString = "";

        if(numString.length() > 3){
          char[] numArray = numString.toCharArray();
          int mod = numString.length()%3;

          if(mod == 0) mod = 3;

          for(int i = 0; i < mod; i++){
              newNum += numArray[i];
          }
            newNum += ',';

            for(int i = mod; i < numString.length(); i++){
                newNumString += numArray[i];
            }
            addCommasToNumericString(newNumString);

        } else {
            return newNum += numString;
        }
        return newNum;
    }
}
