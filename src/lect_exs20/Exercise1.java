/*
 Написать программу, бесконечно считывающую
пользовательские числа из консоли.
Эти числа представляют собой количество секунд.
При каждом вводе числа, должна создаваться задача,
которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
Однако нужно сделать так, чтобы все задачи выполнялись в одном и том же потоке в порядке ввода.
Т.е. в программе есть 2 потока: главный и поток для
выполнения всех задач по очереди.
При вводе -1 программа должна завершать свою работу.
*/
package lect_exs20;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise1 {
    static boolean running = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService service = Executors.newSingleThreadExecutor();
        while (running) {
            int time = scanner.nextInt();
            if(time == -1){
                service.shutdown();
            }
            service.submit(() -> {
                try {
                    TimeUnit.SECONDS.sleep(time);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println("I've been sleeping for " + time + " seconds");
            });
        }
    }
}

