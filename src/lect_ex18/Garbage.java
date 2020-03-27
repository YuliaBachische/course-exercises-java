package lect_ex18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garbage implements Runnable {
    static List<String> garbage = new ArrayList<>();
    static Map<String, Integer> map = new HashMap<>();
    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            if (i == 0) {
                for (int j = 0; j < 20; j++) {
                    garbage.add(randomDetail());
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                else {
                for (int j = 0; j < 4; j++) {
                    garbage.add(randomDetail());
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public String randomDetail(){
        List <String>  details = new ArrayList<>(){
            {add("Head");add("Body");add("Left hand"); add("Right hand"); add("Left leg"); add("Right leg");
                add("CPU"); add("RAM"); add("HDD");add("Broken head"); add("SSD"); add("SSD"); add("SSD"); add("SSD");
                add("SSD");add("SSD");add("SSD");add("Broken leg");add("SSD");;add("SSD");add("SSD");add("SSD");;add("SSD");
                add("SSD");add("SSD");add("SSD");add("SSD");}
        };
        return details.get((int)(Math.random()*27-0));
    }

    static class  MyThread2 extends Garbage {

        List<String> requiredDetails = new ArrayList<>() {
            {
                add("Head");
                add("Body");
                add("Left hand");
                add("Right hand");
                add("Left leg");
                add("Right leg");
                add("CPU");
                add("RAM");
                add("HDD");
            }
        };

        @Override
        public void run(){

            Map<String, Integer> robots = new HashMap<>();
            for (int i = 0; i < 50; i++) {
                int count = 0;

                for (String s : requiredDetails) {
                        for (String g : garbage) {
                            if (g.equals(s)) {
                                    if (robots.containsKey(s)) {
                                        robots.put(s, robots.get(s) + 1);
                                        count++;
                                    } else {
                                        robots.put(s, 1);
                                        count++;
                                    }
                                    System.out.println(robots);

                                }
                                }
                            }
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                int min = 1000;
                for (String map1: robots.keySet()) {
                    if(robots.get(map1) <min){
                        min = robots.get(map1);
                    }
                }
                if(robots.size() == requiredDetails.size()) {
                    System.out.println("Quantity of created robots: " + min);
                    System.out.println(robots);
                }

                }
            }

}


