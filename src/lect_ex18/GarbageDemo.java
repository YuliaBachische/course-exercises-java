package lect_ex18;

public class GarbageDemo {
    public static void main(String[] args) {
        Thread garbage = new Thread(new Garbage());
        Thread servant = new Thread(new Garbage.MyThread2());
        garbage.start();
        try {
            servant.join();
        }catch (InterruptedException ex){
            System.err.println(ex);
        }
    }
}
