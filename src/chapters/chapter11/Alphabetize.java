package chapters.chapter11;

public class Alphabetize {
    public static Object[] sort(String[] array) {
        for(int i = 0; i < array.length; i++){
            int smallest = findSmallest(array, i);

            String temp = array[i];

            array[i] = array[smallest];
            array[smallest] = temp;
        }

        return array;
    }

    private static int findSmallest(String[] array, int begin) {
        int smallest = begin;
        for(int i = begin + 1; i < array.length; i++){
            if(array[i].compareTo(array[smallest]) < 0) smallest = i;
        }
        return smallest;
    }
}
