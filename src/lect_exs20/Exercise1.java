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

