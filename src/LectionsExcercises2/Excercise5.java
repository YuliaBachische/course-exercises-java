package LectionsExcercises2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {3, 6, 0}, {1, 7, 0}};
        int[][] array2 = {{2, 8, 3}, {0, 7, 4}, {5, 3, 8}};
        System.out.println("Первый массив: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Второй массив:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Введите индексы первого массива через пробел: ");
        Scanner sc = new Scanner(System.in);
        int enteredNum1 = sc.nextInt();
        int enteredNum2 = sc.nextInt();
        System.out.println("Введите индексы второго массива через пробел:");
        int enteredNum3 = sc.nextInt();
        int enteredNum4 = sc.nextInt();
        if (equals(enteredNum1, enteredNum2, enteredNum3, enteredNum4)) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }
    public static boolean equals(int enteredNum1, int enteredNum2, int enteredNum3, int enteredNum4) {
        int[][] array1 = {{1, 2, 3}, {3, 6, 0}, {1, 7, 0}};
        int[][] array2 = {{2, 8, 3}, {0, 7, 4}, {5, 3, 8}};
        if (array1[enteredNum1][enteredNum2] == array2[enteredNum3][enteredNum4]){
            return true;
        }
        return false;
    }
}


