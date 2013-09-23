package chapters.chapter10;

public class Game {


    private final Judge[] judges;

    public Game(Judge... judges) {

        this.judges = judges;
    }

    private Double calculateTotalScore() {
        double totalScore = 0;
        for(Judge judge:judges) totalScore += judge.score();
        return totalScore;
    }

    private Double highLow() {
        double highestNumber = 0;
        double lowestNumber = 10;

        for(int i = 0; i < judges.length; i++){
            if(highestNumber < judges[i].score()) highestNumber = judges[i].score();
            if(lowestNumber > judges[i].score()) lowestNumber = judges[i].score();
        }
       return highestNumber + lowestNumber;
    }

   public Double score() {
        double total = calculateTotalScore();
        if(judges.length < 5){
            return total / judges.length;
        } else {
            total -= highLow();
            return total / (judges.length - 2);

        }
    }
}
