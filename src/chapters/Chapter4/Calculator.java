package chapters.Chapter4;

public class Calculator {

    public int add(int totalNums){
        int total = 0;
        int add = 1;
        for(int num = 1; num <= totalNums; num ++){
            total += add;
            add += 2;
        }
        return total;
    }
}
