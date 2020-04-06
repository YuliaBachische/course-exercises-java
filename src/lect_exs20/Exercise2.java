package lect_exs20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Exercise2 {
    static int[] shared = new int[1000000];
    public static void main(String[] args) {
        for (int i = 0; i < shared.length; i++) {
            shared[i] = (int) (Math.random()*300);
        }
        ExecutorService service = Executors.newSingleThreadExecutor();
        AtomicLong start = new AtomicLong();
        AtomicLong finish = new AtomicLong();
        service.submit(() -> {
            start.set(System.nanoTime());
            int maxNumber = 0;
            for (int value : shared) {
                if (maxNumber < value) {
                    maxNumber = value;
                }
            }
            finish.set(System.nanoTime());
            System.out.println("single thread: " + (finish.get() - start.get()));
        });
        service.shutdown();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        AtomicLong start2 = new AtomicLong();
        AtomicLong finish2 = new AtomicLong();
        executorService.submit(() -> {
            start2.set(System.nanoTime());
            int maxNumber = 0;
            for (int value : shared) {
                if (maxNumber < value) {
                    maxNumber = value;
                }
            }
            finish2.set(System.nanoTime());
            System.out.println("threadPool: " + (finish2.get() - start2.get()));
        });
        executorService.shutdown();
    }
}
