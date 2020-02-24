package LectionsExcercises2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Excercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        for (int i = (int) sqrt(num); i > 0; i--) {
            if (IsSimple(num) == true) {
                System.out.println("Число является простым");
                break;
            } else {
                System.out.println("Число не является простым");
                break;
            }
        }
    }

    private static boolean IsSimple(int num) {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
