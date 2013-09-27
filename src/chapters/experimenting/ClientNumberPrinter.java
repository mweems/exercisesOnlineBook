package chapters.experimenting;

public class ClientNumberPrinter {

    public static void main(String[] args){
        NumberPrinterInterface printer = new NumberPrinterV1();
        printer.printNumber(5);
        printer = new NumberPrinterV2();
        printer.printNumber(5);
    }
}
