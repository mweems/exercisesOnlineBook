package chapters.basicExercises;

import java.util.ArrayList;

public class Triangle {

    public String oneLine(int size) {
        String line = "";
        for(int i = 0; i < size; i++){
            line += "*";
        }
        return line;
    }

    public String multiLine(int size) {
        String line = "";
        for(int i = 0; i < size; i++){
            line += "*\n";
        }
        return line.subSequence(0, line.length() - 1).toString();
    }


    public String additiveMultiLine(int size) {
        ArrayList<String> lines = new ArrayList<String>();
        String allLines = "";
        for(int i = 0; i < size; i++){
            if(lines.isEmpty()) {
                lines.add("*");
            } else {
                lines.add(lines.get(i-1) + "*");
            }
        }
        for(String line : lines){
            allLines += line + "\n";
        }
        return allLines.subSequence(0, allLines.length()-1).toString();
    }
}
