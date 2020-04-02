package lect_ex18;

import java.util.*;

public class GarbageDump {
    List<String> list = new ArrayList<>();
    private boolean available = false;

    @Override
    public String toString() {
        return "GarbageDump{" +
                "list=" + list +
                '}';
    }

    public synchronized void throwDetails(List<String> det){
        while (available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.addAll(det);
        System.out.println(det + " were thrown");
        available = true;
        notify();
    }
    
    public synchronized void collectDetails(Map<String, Integer> map) {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notify();
        if(!map.isEmpty()) {
            System.out.println("In overall the servant brought to the Scientist: ");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            int res = map.entrySet().stream()
                    .min(Comparator.comparingInt(Map.Entry::getValue))
                    .map(Map.Entry::getValue).orElse(0);
            if (map.size() == 9) {
                System.out.println("In overall the Scientist made " + res + " robots");
            }
        }
    }
}


