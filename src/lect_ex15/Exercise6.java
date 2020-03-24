package lect_ex15;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.Arrays;

public class Exercise6 {
    private static Logger LOGGER = Logger.getLogger(Exercise6.class);
    public static void main(String[] args){
        LOGGER.setLevel(Level.INFO);
        File file = new File("C:\\Users\\Asus\\IdeaProjects");
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File value : files) {
                    LOGGER.info(Arrays.toString(recursion(value)) + "\n");
                }
            }
        } else {
            LOGGER.info(file.getName());
        }
    }

    public static File[] recursion(File file){
        File[] files = file.listFiles();
        if (files != null) {
            for (File value : files) {
                if (value.isDirectory()) {
                   return recursion(value);
                }
            }
        }
        return file.listFiles();
    }
}
