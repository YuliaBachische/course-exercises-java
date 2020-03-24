package lect_ex16;

import java.io.*;

public class Computer implements Serializable {
    private String company;
    private int date;

    public Computer(String company, int date) {
        this.company = company;
        this.date = date;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company='" + company + '\'' +
                ", date=" + date +
                '}';
    }
}
