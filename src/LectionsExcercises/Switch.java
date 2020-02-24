package LectionsExcercises;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        int num = sc.nextInt();
        switch(num) {
            case 1:
                System.out.println(num + " " + "рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(num + " " + "рубля");
                break;
            default:
                System.out.println(num + " " + "рублей");
                break;
        }
    }
}