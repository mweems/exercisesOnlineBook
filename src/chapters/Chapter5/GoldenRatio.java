package chapters.Chapter5;

import static java.lang.String.format;

public class GoldenRatio {

    public String ratio(){
        Double ratio = (1 + Math.sqrt(5))/2;
        String ans = format("%.2f", ratio);
        return ans;
    }
}
