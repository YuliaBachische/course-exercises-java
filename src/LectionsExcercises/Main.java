package LectionsExcercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два слова через пробел:");
        String line1 = sc.next();
        String line2 = sc.next();
        line1.equals(line2);
        line1.equalsIgnoreCase(line2);
        line1.length();
        line2.length();
        if (line1.equals(line2)) {
            System.out.println("Отлично. Слова одинаковы.");
        } else if (line1.equalsIgnoreCase(line2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (line1.length() == line2.length()) {
            System.out.println("Ну хотя бы одной длины");
        } else {
            System.out.println("Они совсем разные");

        }

    }
}