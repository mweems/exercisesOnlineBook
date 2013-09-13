package chapters.Chapter4;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public String getSequence(int seqLength){
        String list = "";
        List<Integer> seqList = new ArrayList<Integer>();
        seqList.add(0, 0);
        seqList.add(1, 1);
        if(seqLength > 1){
            for(int i = 2; i <= seqLength; i++){
            seqList.add(i,(seqList.get(i - 1) + seqList.get(i - 2)));
            }

        }

            for(int item: seqList){
              list += String.valueOf(item) + ",";
            }
            return list;
    }
}
