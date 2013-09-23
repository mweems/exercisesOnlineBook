package chapters.chapter10;

public class Calculator {

    public static double standardDeviation(double... values) {
       double avg = calculateAverage(values);
       return calculateSquareDiff(avg, values);
    }

    private static double calculateSquareDiff(double avg, double[] values) {
        double total = 0;
        for(double value: values){
            double diff = avg - value;
            total += diff * diff;
        }
        return Math.sqrt(total/values.length);
    }

    private static double calculateAverage(double[] values) {
        double total = 0;
        for(double value: values){
            total += value;
        }
        return total / values.length;
    }
}
