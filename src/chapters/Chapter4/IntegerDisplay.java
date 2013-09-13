package chapters.Chapter4;

public class IntegerDisplay {

    public String divisible(){
        for(int num = 1; num <= 100; num++){
            if( num % 6 == 0 || num % 7 == 0){
                System.out.println(num);
            }
        }
        return "display shown";
    }

    public String unlessDivisible(){
        for (int num = 1; num <= 100; num++){
            if( num % 6 == 0 || num % 7 == 0){
                if (!(num % 6 == 0 && num % 7 == 0)){
                    System.out.println(num);
                }
            }
        }
        return "display shown";
    }
}
