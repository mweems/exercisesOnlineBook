package chapters.Chapter4;

public class BeerSong {

    final String lyric1Singular = " bottle of beer";
    final String lyric1Plural = " bottles of beer";
    final String lyric2 = " on the wall";

    public String sing(int startingBottles){
       for(int bottles = startingBottles; bottles > 0; bottles --){

           String currentLyric = bottles == 1 ? lyric1Singular : lyric1Plural;
           System.out.println(bottles + currentLyric + lyric2);
           System.out.println(bottles + currentLyric);
           System.out.println("You take one down, Pass it around ");

           String nextLyric = bottles == 2 ? lyric1Singular : lyric1Plural;
           System.out.println(bottles - 1 + nextLyric + lyric2);
        }
        return "song played";
    }
}
