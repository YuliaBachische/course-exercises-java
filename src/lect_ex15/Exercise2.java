package lect_ex15;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
    private static Logger LOGGER = Logger.getLogger(Exercise2.class);
    public static void main(String[] args) throws IOException {
        LOGGER.setLevel(Level.INFO);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/lect_ex15/2.txt")));
        Pattern pattern = Pattern.compile("^(?i:[aeiouy]).*");
        String line = "";
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(" ").append(line);
        }
        String[] words = stringBuilder.toString().split(" ");
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                LOGGER.info(word);
            }
        }
        bufferedReader.close();
    }
}
