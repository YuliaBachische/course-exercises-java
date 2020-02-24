package LectionsExcercises2;
import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
            if (IsSimple(num) == true) {
                System.out.println("Число является простым");
            } else {
                System.out.println("Число не является простым");
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
