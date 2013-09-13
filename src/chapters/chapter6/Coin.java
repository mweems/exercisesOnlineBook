package chapters.chapter6;

public class Coin {

    private final boolean value;

    public Coin(boolean value) {
        this.value = value;
    }

    public String getValue(){
        String face;
        if(value == true){
            face = "Heads";
        } else {
            face = "Tails";
        }
        return face;
    }
}
