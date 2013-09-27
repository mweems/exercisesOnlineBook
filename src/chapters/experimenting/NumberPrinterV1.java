package chapters.experimenting;

public class NumberPrinterV1 implements NumberPrinterInterface {


    @Override
    public void printNumber(int num) {
        int temp = 0;
        while(temp != num){
            temp++;
        }
        System.out.println(temp);
    }
}
