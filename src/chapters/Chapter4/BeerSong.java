package chapters.Chapter4;

public class BeerSong {


    public String sing(int startingBottles){


        if(startingBottles == 0) System.out.println("");
        String song = "";


        for(int i = startingBottles; i > 0; i--){
            song += numBottles(i) + " of Beer on the wall\n" +
                numBottles(i) + " of Beer\n" +
                "Take 1 down\n" +
                "Pass it around\n" +
                numBottles(i - 1) + " of Beer on the wall";
                if(i != 1) song += "\n";
        }
//        System.out.println(song);
        return song;
    }

    private String numBottles(int startingBottles) {
        String bottle = startingBottles == 1? "Bottle":"Bottles";
        return startingBottles + " " + bottle;
    }
}
