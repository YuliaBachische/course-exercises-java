package lect_ex15;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.*;

public class Exercise1 {
    private static Logger LOGGER = Logger.getLogger(Exercise1.class);
    public static void main(String[] args) throws IOException {
        LOGGER.setLevel(Level.INFO);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/lect_ex15/1.txt")));
        String line;
        while ((line = bufferedReader.readLine())!=null) {
            LOGGER.info(line);
        }
        bufferedReader.close();
    }
}