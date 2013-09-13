package chapters.Chapter4;

public class ThisOldMan {

    String song = "With a knick knack, paddy whack,\nGive a dog a bone,\nThis old man came rolling home";

    public String sing(){
        for(int num = 1; num <= 10; num++){
            String item = getItem(num);
            System.out.println("This old man, he played " + num);
            System.out.println("He played knick knack on his " + item);
            System.out.println(song);
        }
        return "song played";
    }

    private String getItem(int num){
        String item = "";
        switch (num){
            case 1: item = "thumb";
                break;
            case 2: item = "shoe";
                break;
            case 3: item = "knee";
                break;
            case 4: item = "door";
                break;
            case 5: item = "hive";
                break;
            case 6: item = "sticks";
                break;
            case 7: item = "up to heaven";
                break;
            case 8: item = "pate";
                break;
            case 9: item = "spine";
                break;
            case 10: item = "shin";
                break;
        }
        return item;
    }
}
