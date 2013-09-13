package chapters.chapter6;

import java.util.Random;

public class Atom {

    private String state = "Alive";
    Random rand = new Random();

    public String getCondition(){
        if(state == "Decayed"){
            return state;
        } else{
            boolean condition = rand.nextBoolean();
            if(condition == true){
                state = "Alive";
            } else {
                state = "Decayed";
            }
        }
        return state;
    }
}
