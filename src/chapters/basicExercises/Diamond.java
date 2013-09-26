package chapters.basicExercises;

public class Diamond {


    public static String makeTriangle(int size) {
        String triangle = "";
        for(int line = 1; line <= size; line ++){
            triangle += getSpaces(size, line);
            triangle += getAsterisks(line);
        }
        return triangle;
    }

    private static String getAsterisks(int line) {
        String asterisks = "";
        for(int i = 1; i < 2 * line; i++){
            asterisks += "*";
        }
        return asterisks + "\n";
    }

    private static String getSpaces(int size, int line) {
        String spaces = "";
        for(int i = 1; i <= size - line; i++){
            spaces += " ";
        }
        return spaces;
    }


    public static String makeDiamond(int size) {
        String top = "";
        String bottom = "";
        top += makeTriangle((size + 1) / 2);
        for(int line = size - 1; line > 1; line--){
            bottom += getSpaces(size, line);
            bottom += getAsterisks(line/2);
        }
        String diamond = top + bottom;
        return diamond;
    }
}
