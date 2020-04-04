package lect_exs18_correct;


public class GarbageDemo {
        public static void main(String[] args){
            GarbageDump garbageDump = new GarbageDump();
            Scientist scientist = new Scientist(garbageDump);
            Factory fabric = new Factory(garbageDump);
            Thread t1 = new Thread(fabric);
            t1.start();
            Thread t2 = new Thread(scientist);
            t2.start();
        }
}
