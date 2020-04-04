package lect_ex19.shop;

import java.util.concurrent.Semaphore;

public class Cashbox{
    public final int MAX_AVAILABLE = 3;
    public final Semaphore available = new Semaphore(MAX_AVAILABLE, true);
}
