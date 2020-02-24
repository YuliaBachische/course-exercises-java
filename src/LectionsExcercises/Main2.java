package LectionsExcercises;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        int num = sc.nextInt();
        if(((num-11)%100==0) ||((num-12)%100==0)|| ((num-13)%100==0)|| ((num-14)%100==0)){
            System.out.println(num + " " + "рублей");
        }else if (((num>1)&&(num<=4))||(((num-2)%10==0)||((num-3)%10==0)||((num-4)%10==0))&&((num!=10)&&(num!=11)
                && (num!=12)&& (num!=13)&& (num!=14))) {
            System.out.println(num + " " + "рубля");
        }   else if ((num == 1)||(((num-1)%10 == 0)&&(num!=11))) {
            System.out.println(num + " " + "рубль");
        } else {
            System.out.println(num + " " + "рублей");
        }
    }
}