package LectionsExcercises2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[] [] array1 = new int[][]{{1, 2, 3}, {3, 6, 0}, {1, 7, 0}};
        int [] []array2 = new int[][]{{2, 8, 3}, {0, 7, 4}, {5, 3, 8}};
        Scanner sc = new Scanner(System.in);
        int enteredNum1 = sc.nextInt();
        int enteredNum2 = sc.nextInt();
        System.out.println(equals(enteredNum1,enteredNum2,array1, array2));






    }
    public static boolean equals(int enteredNum1, int enteredNum2, int[][] array1, int[][] array2) {
        array1 = new int[][]{{1, 2, 3}, {3, 6, 0}, {1, 7, 0}};
        array2 = new int[][]{{2, 8, 3}, {0, 7, 4}, {5, 3, 8}};
        if (array1[enteredNum1] == array2[enteredNum2]) {
            return true;
        }
        return false;

    }
}


