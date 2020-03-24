package lect_ex16;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.*;

public class NotebookDemo {
    private static Logger LOGGER = Logger.getLogger(NotebookDemo.class);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LOGGER.setLevel(Level.INFO);
        Touchpad touchpad = new Touchpad(true, "logitech");
        Notebook notebook = new Notebook("Asus", 2019, touchpad, 15);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Asus\\IdeaProjects\\Project\\src\\lect_ex16\\Serialization2.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(notebook);
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\Project\\src\\lect_ex16\\Serialization2.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Notebook notebook1 = (Notebook) objectInputStream.readObject();
        objectInputStream.close();
        LOGGER.info(notebook1);
    }
}
