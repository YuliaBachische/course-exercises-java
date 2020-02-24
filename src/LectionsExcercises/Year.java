package LectionsExcercises;
import java.util.Scanner;
public class Year {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        if(isaBoolean(year)){
            System.out.println("Год високосный");
        }else{
            System.out.println("Год не високосный");
        }

    }

    public static boolean isaBoolean(int year) {
        return (year%4==0)&&(year%100!=0)||(year%400==0);
    }
}
