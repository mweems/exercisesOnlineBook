package chapters.Chapter5;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    public boolean isPerfect(int num){
        int[] checkValues = new int[4];
        checkValues[0] = 2;
        checkValues[1] = 3;
        checkValues[2] = 5;
        checkValues[3] = 7;

        for(int i: checkValues){
            Double prime = Math.pow(2,i-1)*(Math.pow(2,i) - 1);
            if((double) num == prime){
                return true;
            }
        }
        return false;
    }

    public Integer[] findPerfect(int begin, int end){
        List<Integer> ints = new ArrayList<Integer>();
        for(int i = begin; i <= end; i++ ){
            if(isPerfect(i)) ints.add(i);
        }
        Integer[] foo = new Integer[ints.size()];
        return ints.toArray(foo);
    }
}
