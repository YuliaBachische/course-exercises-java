/*
Создать класс Notebook- наследник Computer. В этом классе
должно быть поле типа
Touchpad -также созданного класса со
своими полями.
Добавить в класс Notebook transient - поле. Создать объект
класса Notebook, сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что
transient - поля не сериализуются
*/
package lect_ex16;

import java.io.*;

public class Notebook extends Computer implements Serializable {
    private Touchpad touchpad;
    private transient int size;
    private   String company;
    private int date;

    public Notebook(String company, int date, Touchpad touchpad, int size) {
        this.company = company;
        this.date = date;
        this.touchpad = touchpad;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "touchpad=" + touchpad +
                ", size='" + size + '\'' +
                ", company='" + company + '\'' +
                ", date=" + date +
                '}';
    }
}
