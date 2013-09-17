package chapters.chapter9;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        char[] wordArray = word.toCharArray();
        String reverseWord = "";
        for(int i = word.length(); i > 0; i--){
            reverseWord += wordArray[i - 1];
        }
        if(reverseWord.equals(word)) return true;
        return false;
    }
}
