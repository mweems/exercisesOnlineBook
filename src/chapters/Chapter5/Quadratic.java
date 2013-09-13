import static java.lang.String.format;

public class Quadratic {

    public String quadForm(int a, int b, int c){
        int val = ((b * b)- 4 * a * c);
        if (val < 0) return "no solution";
        Double first = (-b + Math.sqrt(val)) / (2 * a);
        Double second = (-b - Math.sqrt(val)) / (2 * a);
        return "First = " + format("%.0f", first) + ", Second = " + format("%.0f", second);
    }
}
