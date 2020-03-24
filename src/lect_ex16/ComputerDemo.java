package lect_ex16;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.*;

public class ComputerDemo {
    private static Logger LOGGER = Logger.getLogger(ComputerDemo.class);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LOGGER.setLevel(Level.INFO);
        Computer computer = new Computer("Asus", 2019);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Asus\\IdeaProjects\\Project\\src\\lect_ex16\\Serialization.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(computer);
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\Project\\src\\lect_ex16\\Serialization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Computer computer1 = (Computer) objectInputStream.readObject();
        objectInputStream.close();
        LOGGER.info(computer1);
    }
}
