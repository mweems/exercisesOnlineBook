package chapters.Chapter4;

public class CountDown {

    public String countdown(int startNum){
        while(startNum >= 0){
            System.out.println(startNum);
            startNum--;
        }
        return "countdown";
    }


}
