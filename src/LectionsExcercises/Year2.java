package LectionsExcercises;
import java.util.Scanner;
public class Year2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа через пробел(день, месяц, год): ");
        int day = sc.nextInt();
        int mon = sc.nextInt();
        int year = sc.nextInt();
            switch(mon){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(day>=1&&day<=31){
                        System.out.println("The date is real");
                    }else{
                        System.out.println("The date isn't real");
                    } break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if(day>=1&&day<=30){
                        System.out.println("The date is real");
                    } else{
                        System.out.println("The date isn't real");
                    } break;
                case 2:
                    if(day>=1&&day<=28){
                        System.out.println("The date is real");
                    }
                    else if(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) )&&(day>=1&&day<=29)){
                        System.out.println("The date is real");
                    }else{
                       System.out.println("The date isn't real");
                    }
                    break;
                default:
                    System.out.println("The date isn't real");
            }
        }
    }

