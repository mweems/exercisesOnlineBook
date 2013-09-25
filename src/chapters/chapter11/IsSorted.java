package chapters.chapter11;

public class IsSorted {

    public static boolean checkArray(int[] array) {
        return sortArray(array);
    }

    private static boolean sortArray(int[] array) {
        for(int beginNum = 0; beginNum < array.length; beginNum++){
            int checkNum = findSmallest(array, beginNum);
            if(beginNum != checkNum) return false;
        }
        return true;
    }

    private static int findSmallest(int[] array, int beginNum) {
        int smallest = beginNum;
        for(int i = beginNum + 1; i < array.length; i++){
            if(array[i] < array[smallest]) smallest = i;
        }
        return smallest;
    }
}
