package chapters.chapter11;

import java.util.Arrays;

public class Mode {
    public static int findMode(int[] array) {
        int[] firstCount = new int[array.length];

        for(int i = 0; i < array.length; i++){
            firstCount[i] = getCount(array, i);
        }
        Arrays.sort(firstCount);
        return firstCount[array.length - 1];
    }

    private static int getCount(int[] array, int num) {
        int count = 0;
        for(int i : array){
            if(num == i) count++;
        }
        return count;
    }
}
