package chapters.basicExercises;

public class Numbers {
    public int addNum(int num) {
        int total = 0;
        for(int i = 1; i <= num; i++){
            total += i;
        }
        return total;
    }

    public int factorial(int num) {
        int total = 1;
        for(int i = num; i > 0; i--){
            total *= num;
        }
        return total;
    }

    public int avg(int num) {
        int total = addNum(num);
        return total/num;
    }
}
