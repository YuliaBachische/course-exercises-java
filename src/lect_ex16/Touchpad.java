package lect_ex16;

import java.io.Serializable;

public class Touchpad implements Serializable {
    boolean multiTouchpad;
    String type;

    public Touchpad(boolean multiTouchpad, String type) {
        this.multiTouchpad = multiTouchpad;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Touchpad{" +
                "multiTouchpad=" + multiTouchpad +
                ", type='" + type + '\'' +
                '}';
    }
}
