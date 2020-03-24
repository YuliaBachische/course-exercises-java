/*
Задан файл с текстом. В каждой строке найти и вывести
наибольшее число цифр, идущих подряд
*/
package lect_ex15;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    private static Logger LOGGER = Logger.getLogger(Exercise4.class);
    public static void main(String[] args) throws IOException {
        LOGGER.setLevel(Level.INFO);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/lect_ex15/4.txt")));
        String line;
        List<String> list = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        Pattern pattern = Pattern.compile("(^[0-9]+)");
        int[] max = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            max[i] = 0;
        }
        for (int i = 0; i < list.size(); i++) {
            String[] result = list.get(i).split(" ");
            for (String s : result) {
                Matcher matcher = pattern.matcher(s);
                while (matcher.find()) {
                    int res = s.toCharArray().length;
                    if (res > max[i]) {
                        max[i] = res;
                    }
                }
            }
        }
        for (int value : max) {
            LOGGER.info(value);
        }
        bufferedReader.close();
    }
}
