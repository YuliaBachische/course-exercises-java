/*
Задан массив случайных целых чисел (от 1 до 300) случайной длины (1 млн элементов).
Найти максимальный элемент в массиве двумя способами: в
одном потоке и используя 10 потоков.
Сравнить затраченное в обоих случаях время
*/
package lect_exs20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Exercise2 implements Runnable {
    int start;
    int end;
    int maxNumber;
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
        List<Exercise2> list = new ArrayList<>();
        Exercise2 zero;
        Exercise2 one;
        Exercise2 two;
        Exercise2 three;
        Exercise2 four;
        Exercise2 five;
        Exercise2 six;
        Exercise2 seven;
        Exercise2 eight;
        Exercise2 nine;
        Exercise2 ten;
        AtomicLong start2 = new AtomicLong(System.nanoTime());
        executorService.submit(zero = new Exercise2(0, 100000));
        executorService.submit(one = new Exercise2(100000, 200000));
        executorService.submit(two = new Exercise2(200000, 300000));
        executorService.submit(three =new Exercise2(300000, 400000));
        executorService.submit(four = new Exercise2(400000, 500000));
        executorService.submit(five = new Exercise2(500000, 600000));
        executorService.submit(six = new Exercise2(600000, 700000));
        executorService.submit(seven = new Exercise2(700000, 800000));
        executorService.submit(eight = new Exercise2(800000, 900000));
        executorService.submit(nine = new Exercise2(900000, 1000000));
        executorService.submit(ten = new Exercise2(900000, 1000000));;
        list.add(zero);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);
        list.add(seven);
        list.add(eight);
        list.add(nine);
        list.add(ten);
        int max = 0;
        for (Exercise2 exercise2 : list) {
            if (exercise2.getMaxNumber() > max) {
                max = exercise2.getMaxNumber();
            }
        }
        AtomicLong finish2 = new AtomicLong(System.nanoTime());
        executorService.shutdown();
        System.out.println("ThreadPool: " + (finish2.get()-start2.get()));
    }

    @Override
    public void run() {
        int maxNumber = 0;
        for (int j = start; j < end; j++) {
            if (maxNumber < shared[j]) {
                this.maxNumber = shared[j];
            }
        }
    }

    public int getMaxNumber() {
        return maxNumber;
    }
}


