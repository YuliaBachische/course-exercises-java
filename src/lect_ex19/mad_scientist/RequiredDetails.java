package lect_ex19.mad_scientist;

import java.util.List;
import java.util.Random;

public enum  RequiredDetails {
    RIGHT_LEG,
    HEAD,
    BODY,
    LEFT_LEG,
    RIGHT_HAND,
    LEFT_HAND,
    CPU,
    RAM,
    HDD;
    private static final List<RequiredDetails> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static RequiredDetails randomDetail()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
