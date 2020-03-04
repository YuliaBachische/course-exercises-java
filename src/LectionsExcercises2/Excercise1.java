package LectionsExcercises2;

class Exercise1 {
    public static void main(String[]args){
        int[] array = new int[5];
        array[0] = 8;
        array[1] = 10;
        array[2] = 6;
        array[3] = 0;
        array[4] = 12;
        System.out.println("Обычный порядок: ");
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
        int[] array2 = new int[5];
        for(int i = 0; i < array2.length; i++){
                array2[4-i] = array[i];
        }
        System.out.println("Обратный порядок: ");
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}
