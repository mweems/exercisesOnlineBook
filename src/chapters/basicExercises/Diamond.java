package chapters.basicExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Diamond {


    public static String makeTriangle(int size) {
        ArrayList<String> triangle = triangleArray(size);
        return join(triangle, "\n");
    }

    public static String makeDiamond(int size) {
        ArrayList<String> top = triangleArray((size + 1) / 2);
        ArrayList<String> bottom = (ArrayList<String>) top.clone();
        Collections.reverse(bottom);
        bottom.remove(0);

        return join(top, "\n") + "\n" + join(bottom, "\n");
    }

    public static String nameDiamond(int size, String name) {
        ArrayList<String> top = triangleArray((size + 1) / 2);
        ArrayList<String> bottom = (ArrayList<String>) top.clone();
        Collections.reverse(bottom);
        top.remove(top.size()-1);
        bottom.remove(0);
        return join(top, "\n") + "\n" + name + "\n" + join(bottom, "\n");
    }

    private static ArrayList<String> triangleArray(int size) {
        ArrayList<String> lines = new ArrayList<String>();
        for(int line = 1; line <= size; line ++){
            lines.add((getSpaces(size, line)) + (getAsterisks(line)));
        }
        return lines;
    }

    private static String getAsterisks(int line) {
        String asterisks = "";
        for(int i = 1; i < 2 * line; i++){
            asterisks += "*";
        }
        return asterisks;
    }

    private static String getSpaces(int size, int line) {
        String spaces = "";
        for(int i = 1; i <= size - line; i++){
            spaces += " ";
        }
        return spaces;
    }


    private static String join(List<String> strings, String separator) {
        String joinedList = "";
        for(String line : strings){
            joinedList += line + separator;
        }
     return joinedList.subSequence(0, joinedList.length() - 1).toString();
    }

}
