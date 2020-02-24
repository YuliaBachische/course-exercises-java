package LectionsExcercises2;

public class Excercise2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int count = 0;
        for (int j = 0; j < 767; j++) {
            if (((j % 13 == 0) || (j % 17 == 0)) && (j != 0)){
                count += 1;
                for (int i = 0; i < array.length; i++) {
                    array[i] = j;
                    System.out.println(array[i]);
                    break;
                }
            }
        }
        System.out.println("Количество чисел:" + " " + count);
    }
}