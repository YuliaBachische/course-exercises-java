/*
Задан массив случайных целых чисел (от 1 до 300) случайной длины (1 млн элементов).
Найти максимальный элемент в массиве двумя способами: в
одном потоке и используя 10 потоков.
Сравнить затраченное в обоих случаях время
*/
package lect_exs20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Exercise2 implements Runnable {
    int start;
    int end;
    static int maxNumber;
    public Exercise2(int start, int end) {
        this.start = start;
        this.end = end;
    }

    static int[] shared = new int[1000000];
    public static void main(String[] args){
        for (int i = 0; i < shared.length; i++) {
            shared[i] = (int) (Math.random()*300);
        }
        ExecutorService service = Executors.newSingleThreadExecutor();
        AtomicLong start = new AtomicLong();
        AtomicLong finish = new AtomicLong();
        service.submit(() -> {
            int maxNumber = 0;
            start.set(System.nanoTime());
            for (int value : shared) {
                if (maxNumber < value) {
                    maxNumber = value;
                }
            }
            finish.set(System.nanoTime());
            System.out.println("single thread1: " + (finish.get() - start.get()));
        });
        service.shutdown();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        AtomicLong start2 = new AtomicLong(System.nanoTime());
        executorService.submit(new Exercise2(0, 100000));
        executorService.submit(new Exercise2(100000, 200000));
        executorService.submit(new Exercise2(200000, 300000));
        executorService.submit(new Exercise2(300000, 400000));
        executorService.submit(new Exercise2(400000, 500000));
        executorService.submit(new Exercise2(500000, 600000));
        executorService.submit(new Exercise2(600000, 700000));
        executorService.submit(new Exercise2(700000, 800000));
        executorService.submit(new Exercise2(800000, 900000));
        executorService.submit(new Exercise2(900000, 1000000));
        executorService.shutdown();
        if(executorService.isShutdown()) {
            Exercise2.getMaxNumber();
        }
        AtomicLong finish2 = new AtomicLong(System.nanoTime());
        System.out.println("ThreadPool: " + (finish2.get()-start2.get()));
    }

    @Override
    public void run() {
        for (int j = start; j < end; j++) {
            if (maxNumber < shared[j]) {
                maxNumber = shared[j];
            }
        }
    }

    public static int getMaxNumber() {
        return maxNumber;
    }
}



