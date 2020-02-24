package LectionsExcercises2;

import java.util.Random;

import static java.lang.Math.*;

public class Excercise4 {
    public static void main(String[]args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = Random();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        if (array[0] < array[1] && array[1] < array[2]) {
            System.out.println("Последовательность является строго возрастающей");
        } else {
            System.out.println("Последовательность не является строго возрастающей");
        }
    }
    private static int Random() {
        Random rand = new Random();
        int rand1 = 10 + rand.nextInt(100 - 10);
        return rand1;
    }
}
