package lect_ex18;


public class GarbageDemo {
        public static void main(String[] args) throws InterruptedException {
            GarbageDump garbageDump = new GarbageDump();
            Scientist scientist = new Scientist(garbageDump);
            Fabric fabric = new Fabric(garbageDump);
            Thread t1 = new Thread(fabric);
            t1.start();
            Thread t2 = new Thread(scientist);
            t2.start();
        }
}
