package chapters.basicExercises;

import java.util.HashMap;

public class FizzBuzz {

    private HashMap<Integer, String> numsToSwap = new HashMap<Integer, String>();

    public FizzBuzz(){
        numsToSwap.put(3,"Fizz");
        numsToSwap.put(5, "Buzz");

    }

    public String numbers(int startNum, int endNum) {
        String numbers = "";
        for(int i = startNum; i <= endNum; i++){
            int counter = 0;
            for(int num : numsToSwap.keySet()){
                if(i % num == 0){
                    numbers += numsToSwap.get(num);
                    counter++;
                }
            }
            if(counter == 0){
                numbers += i + "\n";
            } else {
                numbers += "\n";
            }
        }
        return numbers.subSequence(0,numbers.length() - 1).toString();
    }
}
