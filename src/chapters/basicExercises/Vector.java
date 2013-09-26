package chapters.basicExercises;

public class Vector {


    public double[] getCoordinates(int xCoord, int yCoord) {
        double[] coordinates = {(double) xCoord, (double) yCoord};
        return coordinates;
    }

    public double[] sumCoordinates(int x1, int y1, int x2, int y2) {
        double[] addedCoordinates = {((double) x1 + (double) x2), ((double) y1 + (double) y2)};
        return addedCoordinates;
    }

    public double[] diffCoordinates(int x1, int y1, int x2, int y2) {
        double[] subtractedCoordinates = {((double) x1 - (double) x2), ((double) y1 - (double) y2)};
        return subtractedCoordinates;
    }

    public int dotProduct(int[] firstArray, int[] secondArray) {
        int dotProduct = 0;
        for(int i = 0; i < firstArray.length; i++){
            dotProduct += firstArray[i] * secondArray[i];
        }
        return dotProduct;
    }


    public int vectorLength(int xLength, int yLength) {
        int length = (int) Math.sqrt((xLength * xLength) + (yLength * yLength));
        return length;
    }
}
