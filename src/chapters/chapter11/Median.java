package chapters.chapter11;


public class Median {


    public static int findMedian(int[] array) {
        int[] sortedArray = sortArray(array);
        int midPoint = array.length/2;
        if(array.length % 2 == 0){
          int avg = findAvg(sortedArray, midPoint);
            return avg;
        } else {
        return sortedArray[midPoint];
        }
    }

    private static int findAvg(int[] array, int midPoint) {
        return (array[midPoint] + array[midPoint - 1]) / 2;
    }

    private static int[] sortArray(int[] array) {
        for(int beginNum = 0; beginNum < array.length; beginNum++){
            int checkNum = findSmallest(array, beginNum);

            int temp = array[beginNum];
            array[beginNum] = array[checkNum];
            array[checkNum] = temp;
        }
        return array;
    }

    private static int findSmallest(int[] array, int beginNum) {
        int smallest = beginNum;
        for(int i = beginNum + 1; i < array.length; i++){
            if(array[i] < array[smallest]) smallest = i;
        }
        return smallest;
    }
}
