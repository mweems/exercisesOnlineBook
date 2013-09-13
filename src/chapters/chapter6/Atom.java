package chapters.chapter6;

public class Atom {

    private final boolean condition;

    public Atom(boolean condition) {
        this.condition = condition;
    }

    public String getCondition(){
        String state;
        if(condition == true){
            state = "Alive";
        } else {
            state = "Decayed";
        }
        return state;
    }
}
