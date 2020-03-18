package LectionsExcercises2;

import java.util.Scanner;

public class Excercise7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        int mul = 1; //long
        for(int i = 1; i <= num; i++){
            mul *= i; 
        }
        System.out.println("Факториал числа: ");
        System.out.println(mul);
    }

}
