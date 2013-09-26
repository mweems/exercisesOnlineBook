package chapters.basicExercises;

import java.util.*;

public class Collection {

    TreeMap phoneNumbers = new TreeMap();

    public Collection(){
        phoneNumbers.put("Bill", "832-367-0666");
        phoneNumbers.put("Archer", "818-555-1234");
        phoneNumbers.put("Lana", "818-555-4321");
    }

    public String combineStrings(ArrayList<String> firstSet, ArrayList<String> secondSet) {
        String combinedStrings = "";
        combinedStrings += getString(firstSet) + " ";
        combinedStrings += getString(secondSet);
        return combinedStrings;
    }

    private String getString(ArrayList<String> wordSet) {
        String combinedStrings = "";
        for(String word : wordSet) combinedStrings += word;
        return combinedStrings.trim();
    }


    public String phoneNumber(String name) {
        for(Object key : phoneNumbers.keySet()){
            if(key.toString().equals(name)) return phoneNumbers.get(key).toString();
        }
        return "person not found";
    }

    public String listAll() {
        String allNumbers = "";
        for(Object key : phoneNumbers.keySet()){
            allNumbers += key + ", ";
            allNumbers += phoneNumbers.get(key) + "; ";
        }

       return allNumbers;
    }
}
