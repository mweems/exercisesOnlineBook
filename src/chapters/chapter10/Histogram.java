package chapters.chapter10;

import java.util.HashMap;

public class Histogram {

    HashMap<Integer, String> histogramMap = new HashMap<Integer, String>(11);

    public Histogram(){
        histogramMap.put(9, "0-9  |");
        histogramMap.put(19, "10-19|");
        histogramMap.put(29, "20-29|");
        histogramMap.put(39, "30-39|");
        histogramMap.put(49, "40-49|");
        histogramMap.put(59, "50-59|");
        histogramMap.put(69, "60-69|");
        histogramMap.put(79, "70-79|");
        histogramMap.put(89, "80-89|");
        histogramMap.put(99, "90-99|");
        histogramMap.put(100, "100  |");
    }


    public String createHistogram(int... scores) {
        for(int score : scores){
            updateLine(score);

            }
        String result = makeLine();
        return result;
        }

    private String makeLine() {
        String result = "";
        for(int i = 9; i <= 99; i += 10){
            result += histogramMap.get(i) + "\n";
        }
            result += histogramMap.get(100);
        return result;
    }

    private void updateLine(int score) {
        String line = "";
        if(score == 100){
            line += histogramMap.get(100);
            line += "*";
            histogramMap.put(100, line);
        }
        for(int i = 9; i <= 99; i += 10){
            if(score <= i) {
                line = histogramMap.get(i);
                line += "*";
                histogramMap.put(i, line);
                break;
            }

    }
}
}
