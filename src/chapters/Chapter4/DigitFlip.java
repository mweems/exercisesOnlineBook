package chapters.Chapter4;

public class DigitFlip {

    public int flip(int num){
        String number = String.valueOf(num);
        String list = "";
        for (int i = 0; i < number.length(); i++){
            list  += (num % 10);
            num /= 10;
        }
        return Integer.parseInt(list);
    }
}
