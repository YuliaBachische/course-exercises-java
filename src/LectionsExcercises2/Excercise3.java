package LectionsExcercises2;

import java.util.Random;

public class Excercise3 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = nextDouble();
        }
        double maxDouble = array[0];
        double minDouble = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (minDouble > array[i]) {
                minDouble = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (maxDouble < array[i]) {
                maxDouble = array[i];
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    double sort = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sort;
                }
            }
        }
        System.out.println("Сортировка: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum += array[i];
            count += 1;
        }
        double averageDouble = sum/2;
        System.out.println("Минимальное значение: " + " " + minDouble);
        System.out.println("Максимальное значение: " + " " + maxDouble);
        System.out.println("Среднее значение: " + " " + averageDouble);
    }
    public static double nextDouble() {
        Random random = new Random();
        return random.nextDouble();
    }
}
