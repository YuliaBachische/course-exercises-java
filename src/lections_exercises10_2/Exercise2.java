package lections_exercises10_2;

import lections_exercises10.Exercise3;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.*;

public class Exercise2 {
    private static Logger LOGGER = Logger.getLogger(Exercise2.class);
    public static void main(String[] args) {
        Map<String,String> myMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            myMap.put(Exercise3.Random(), generateSurname());
        }
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(myMap);
        LOGGER.info(isUnique(myMap));
    }
    public static boolean isUnique(Map<String, String> map){
     Set<String> mySet = new HashSet<>();
        for (Map.Entry<String, String> entry: map.entrySet()) {
         mySet.add(entry.getValue());
     }
        return mySet.size() == map.size();
    }
    public static String generateSurname(){
        String [] strings = new String[]{"Bennett", "Neil", "Peters", "Paulson", "Cooper", "Williamson", "Wayne", "Simpson", "Blake", "Griffin", "Green",
        "Rudd", "Pierson", "James"};
        return strings[(int)(Math.random()*14-1)];
    }
}
