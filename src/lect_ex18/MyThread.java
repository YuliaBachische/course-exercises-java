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
                    System.out.println("The thread is interrupted");
                }
            }
        }
    }
    public long getSum() {
        return sum;
    }
    static class Daemon extends MyThread{
        @Override
        public void run() {
            MyThread thread = new MyThread();
            for(int i = 1; i < 10000000; i++){
                System.out.println(thread.getSum());
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    System.out.println("The daemon thread was interrupted");
                }
            }
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        Thread daemonThread = new Thread(new MyThread.Daemon());
        daemonThread.setDaemon(true);
        thread.start();
        daemonThread.start();
    }
}
