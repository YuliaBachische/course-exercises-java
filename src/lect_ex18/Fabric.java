package lect_ex18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fabric implements Runnable {
    GarbageDump dump;
    List<String> thrownDetails = Arrays.asList("Left_Hand", "Right_Leg", "Left_Leg", "Head", "Body", "HDD" , "RAM", "Right_Hand", "CPU");

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i == 0) {
                try {
                    dump.throwDetails(throwG(20));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    dump.throwDetails(throwG((int) (1 + Math.random() * 4)));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Fabric(GarbageDump dump) {
        this.dump = dump;
    }


    public List<String> throwG(int count) throws InterruptedException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(throwRandomDetail(thrownDetails));
        }
        return list;
    }

    public String throwRandomDetail(List<String> list) {
        return list.get((int) (0 + Math.random() * 9));
    }
}

