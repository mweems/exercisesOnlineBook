package chapters.chapter9;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrabbleScore {
    ArrayList<Character> one = new ArrayList<Character>(Arrays.asList('A','E','I','L','N','O','R','S','T','U'));
    ArrayList<Character> two = new ArrayList<Character>(Arrays.asList('D','G'));
    ArrayList<Character> three = new ArrayList<Character>(Arrays.asList('B','C','M','P'));
    ArrayList<Character> four = new ArrayList<Character>(Arrays.asList('F','H','V','W','Y'));
    ArrayList<Character> five = new ArrayList<Character>(Arrays.asList('K'));
    ArrayList<Character> eight = new ArrayList<Character>(Arrays.asList('J','X'));
    ArrayList<Character> ten = new ArrayList<Character>(Arrays.asList('Q','Z'));



    public int scoreWord(String word) {
        int score = 0;
        char[] letter = word.toCharArray();
        for(int i = 0; i < letter.length; i++){
          if(one.contains(letter[i]))   score += 1;
          if(two.contains(letter[i]))   score += 2;
          if(three.contains(letter[i])) score += 3;
          if(four.contains(letter[i]))  score += 4;
          if(five.contains(letter[i]))  score += 5;
          if(eight.contains(letter[i])) score += 8;
          if(ten.contains(letter[i]))   score += 10;
        }
        return score;
    }
}
