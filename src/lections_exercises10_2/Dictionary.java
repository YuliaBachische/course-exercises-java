package lections_exercises10_2;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static Logger LOGGER = Logger.getLogger(Dictionary.class);
    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);
        Map<String, Integer> myMap = new HashMap<>();
        String str = "The dictionary is a totality of all the words of some language, also words used in some book or books of particular author.";
                str = str.toLowerCase().replaceAll("[^a-zA-Z0-9^ ]", "");
        String [] array = str.split(" ");
        for (String s : array) {
            if(myMap.containsKey(s)){
                myMap.put(s, myMap.get(s)+1);
            }else {
                myMap.put(s, 1);
            }
        }
        for (String key: myMap.keySet()) {
            LOGGER.info("{" + key + " : " + myMap.get(key) + "}");
        }
    }
}
