package chapters.Chapter3;

import static java.lang.String.format;

public class Conversion  {


    public Double toCM(int feet, int inches){
        Double footLength = feet * 30.48;
        Double inchLength = inches * 2.54;
        return footLength + inchLength;
    }

    public String getInterest(Double startAmount, Double interestRate, int numYears){
        Double interest = interestRate / 100;
        Double interestEarned = startAmount * interest;
        if(numYears > 1){
            return getInterest(startAmount + interestEarned, interestRate, numYears-1);
        }
        return format("%.2f",startAmount + interestEarned);
    }

    public String getRadius(int radius) {
        final Double PI = 3.14;
        Double circ = PI * (Math.pow(radius,2));
        return format("%.2f", circ);
    }

    public String getCelsius(int temp) {
        Double celsTemp = (5/9.0)*(temp - 32.00);
        return format("%.2f", celsTemp);
    }

    public int mathMagician(){
        return  4 + 9 - 2 * 16 + 1 / 3 * 6 - 67 + 8 * 2 - 3 + 26 - 1 / 34 + 3 / 7 + 2 - 5;
    }

    public String kiloToPound(int kilo){
      Double pounds = kilo * 2.2;
      Double remainder = pounds - Math.floor(pounds);
      Double ounces = remainder * 16;
      int newPounds = (int) (pounds - remainder);
      return newPounds + " pounds " + format("%.1f",ounces) + " ounces";
    }

    public Double avg(int one, int two, int three, int four){
        Double total = (one + two + three + four) / 4.0;
        return total;
    }

    public int stIves(){
        int wives = 7;
        int sacks = wives * 7;
        int cats = sacks * 7;
        int kits = cats * 7;
        return kits + 1;
    }

}
