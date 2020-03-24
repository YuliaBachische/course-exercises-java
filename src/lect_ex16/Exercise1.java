/*
Сравнить скорость чтения и записи 5 МБ символов при
использовании классов буфиризированого и не буфиризированого
символьного ввода вывода
*/
package lect_ex16;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.*;

public class Exercise1 {
    private static Logger LOGGER = Logger.getLogger(Exercise1.class);
    public static void main(String[] args) throws IOException {
        LOGGER.setLevel(Level.INFO);
        long start = System.currentTimeMillis();
        int c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/lect_ex16/BufferedReader.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/lect_ex16/BufferedWriter.txt")));
        while ((c = br.read()) != -1) {
            bw.write((char) c);
        }
        br.close();
        bw.close();
        long finish = System.currentTimeMillis();
        LOGGER.info("Buffered IO: " + (finish - start) + " ms");
        long start2 = System.currentTimeMillis();
        int c2 = 0;
        Reader br2 = new FileReader("src/lect_ex16/Reader.txt");
        Writer bw2 = new FileWriter("src/lect_ex16/Writer.txt");
        while ((c2 = br2.read()) != -1) {
            bw2.write((char) c2);
        }
        br2.close();
        bw2.close();
        long finish2 = System.currentTimeMillis();
        LOGGER.info("Not buffered IO: " + (finish2 - start2) + " ms");
    }

}

