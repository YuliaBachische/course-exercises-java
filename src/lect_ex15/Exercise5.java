package lect_ex15;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.*;

public class Exercise5{
    private static Logger LOGGER = Logger.getLogger(Exercise5.class);
     DataOutputStream dos;
       {
        try {
            dos = new DataOutputStream(new FileOutputStream("src/lect_ex15/5.dat"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void writeInt(int v) throws IOException {
        dos.write((v >>> 24) & 0xFF);
        dos.write((v >>> 16) & 0xFF);
        dos.write((v >>> 8) & 0xFF);
        dos.write((v) & 0xFF);
    }
    public static void main(String[] args) throws IOException {
        LOGGER.setLevel(Level.INFO);
        Exercise5 exercise5 = new Exercise5();
        int[] nums = new int[20];
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (int num : nums) {
            num = (int) ((Math.random() *745) + 256);
            stringBuilder.append(num).append(" ");
            exercise5.writeInt(num);
            sum += num;
        }
        exercise5.dos.close();
        InputStream inputStream = new FileInputStream("src/lect_ex15/5.dat");
        DataInputStream reader = new DataInputStream(inputStream);
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            stringBuilder1.append(reader.readInt()).append(" ");
        }
        LOGGER.info(stringBuilder);
        LOGGER.info(stringBuilder1);
        LOGGER.info(sum/nums.length);
        reader.close();
    }
}
