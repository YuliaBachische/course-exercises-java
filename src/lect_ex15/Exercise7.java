package lect_ex15;

import java.io.*;

public class Exercise7 {
    public static void main(String[] args) throws IOException {

        //symbols of strings and strings in reverse order

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/lections_exercises10_2/Dictionary.java")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/lect_ex15/7.txt")));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }

        bufferedWriter.write(stringBuilder.reverse().toString());
        bufferedReader.close();
        bufferedWriter.close();

        // symbols of strings in reverse order

        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("src/lections_exercises10_2/Dictionary.java"));
        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter("src/lect_ex15/7.txt"));
        String s;
        while((s = bufferedReader2.readLine()) != null) {
            for( int i=s.length()-1;i>=0;i--) {
                bufferedWriter2.write(s.charAt(i));
            }
            bufferedWriter2.write("\r\n");
        }
        bufferedWriter2.close();
        bufferedReader2.close();
    }
}

