package chapters.Chapter5;

public class PerfectSquare {

    public boolean isPerfectSquare(int num){
        for(int i = 1; i <= num/2; i++){
            if(i * i == num){
                return true;
            }
        }
        return false;
    }
}
