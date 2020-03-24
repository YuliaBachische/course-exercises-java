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
