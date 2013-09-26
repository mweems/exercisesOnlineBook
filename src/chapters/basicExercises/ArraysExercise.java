package chapters.basicExercises;

import java.util.ArrayList;

public class ArraysExercise {
    public String findShortestString(String[] words) {
        String smallest = words[0];
        for(String word : words){
            if(word.length() < smallest.length()) smallest = word;
        }
        return smallest;
    }

    public Integer[] findOddNumbers(int[] numbers) {
        ArrayList<Integer> oddArrayList = new ArrayList<Integer>();
        for(int num : numbers){
            if(num % 2 != 0) oddArrayList.add(num);
        }
        Integer[] oddNumbers = oddArrayList.toArray(new Integer[oddArrayList.size()]);
        return oddNumbers;
    }

    public int[] sumProduct(int[] numbers) {
        Integer[] oddNumbers = findOddNumbers(numbers);
        Integer[] evenNumbers = findEvenNumbers(numbers);
        int runningOddTotal = 0;
        int runningEvenTotal = 1;
        int[] total = new int[2];

        for(int num : oddNumbers){
            runningOddTotal += num;
        }

        for(int num : evenNumbers){
            runningEvenTotal *= num;
        }

        total[0] = runningOddTotal;
        total[1] = runningEvenTotal;
        return total;

    }

    private Integer[] findEvenNumbers(int[] numbers) {
        ArrayList<Integer> evenArrayList = new ArrayList<Integer>();
        for(int num : numbers){
            if(num % 2 == 0) evenArrayList.add(num);
        }
        Integer[] evenNumbers = evenArrayList.toArray(new Integer[evenArrayList.size()]);
        return evenNumbers;
    }

}