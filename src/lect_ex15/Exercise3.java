package lect_ex15;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.*;

public class Exercise3 {
    private static Logger LOGGER = Logger.getLogger(Exercise3.class);
    public static void main(String[] args) throws IOException {
        LOGGER.setLevel(Level.INFO);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/lect_ex15/3.txt")));
        String line = "";
        StringBuilder stringBuilder = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = alphabet.toCharArray();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append(" ");
        }
        String[] words = stringBuilder.toString().split(" ");
        for (char aChar : chars) {
            for (int j = 0; j < words.length - 1; j++) {
                if (((words[j].endsWith(String.valueOf(aChar)))) && (words[j + 1].startsWith(String.valueOf(aChar)))) {
                    LOGGER.info(words[j]);
                }
            }
        }
        bufferedReader.close();
    }
}
