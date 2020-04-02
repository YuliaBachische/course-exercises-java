/*
Создать поток, который будет в цикле итерироваться от
1 до 10000000 и суммировать каждый четный элемент
кратный 3. На каждой итерации, кратной 1 000000, поток
должен заснуть на 10 мс.
Вместе с суммирующим потоком
запустить поток демон, который каждую пятую
миллисекунду выводит в консоль текущее значение
просуммированных элементов
*/
package lect_ex18;

public class MyThread extends Thread{
    public static long sum = 0;

    @Override
    public void run() {
        for(int i = 1; i < 10000000; i++){
            if((i%2==0)&&(i%3==0)){
                sum += i;
            } else if(i%1000000==0){
                try {
                    Thread.sleep(10);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
    public static long getSum() {
        return sum;
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        Thread daemonThread = new Thread(()->    {
            for(int i = 1; i < 10000000; i++){
                System.out.println(MyThread.getSum());
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        daemonThread.setDaemon(true);
        thread.start();
        daemonThread.start();
    }
}
