package chapters.chapter9;

public class MyIndexOf {
    public static int myIndexOf(String word, Character character) {
        int index = 0;
        char[] letter = word.toCharArray();
        for(int i = 0; i < letter.length; i++){
            if(character.equals(letter[i])) {
                index = i;
                break;
            }

        }
        return index;
    }
}
