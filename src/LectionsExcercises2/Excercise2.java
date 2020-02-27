package LectionsExcercises2;

public class Excercise2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int count = 0;
        for (int i = 0; i < 767; i++) {
            if (((i % 13 == 0) || (i % 17 == 0)) && (i != 0)){
                count += 1;
                for (int j = 0; j < array.length; j++) {
                    array[j] = i;
                    System.out.println(array[j]);
                    break;
                }
            }
        }
        System.out.println("Количество чисел:" + " " + count);
    }
}
