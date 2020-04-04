package lect_ex19.mad_scientist;

public class GarbageDemo {
        public static void main(String[] args){
            GarbageDump garbageDump = new GarbageDump();
            Scientist scientistDan = new Scientist(garbageDump, "Dan");
            Scientist scientistJerry = new Scientist(garbageDump, "Jerry");
            Factory fabric = new Factory(garbageDump);
            Thread t1 = new Thread(fabric);
            t1.start();
            Thread t2 = new Thread(scientistDan);
            t2.start();
            Thread t3 = new Thread(scientistJerry);
            t3.start();
        }
}
