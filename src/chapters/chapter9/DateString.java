package chapters.chapter9;

public class DateString {
    public static String dateString(int month, int day, int year) {
        String monthWord = getMonth(month);
        String yearWord = Integer.toString(year);
        return day + "-" + monthWord + "-" + yearWord.substring(2);
    }

    private static String getMonth(int month) {
        switch(month){
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
        }
        return null;
    }
}
