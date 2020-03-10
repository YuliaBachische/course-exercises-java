package lections_exercises12;

import org.apache.log4j.Logger;

public class MyRuntimeException extends Exception {
    private static Logger LOGGER = Logger.getLogger(MyRuntimeException.class);

    int num;

    public MyRuntimeException(int num, String message) {
        super(message);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static int getPositiveResult(int num) throws MyRuntimeException {
        if (num < 0) throw new MyRuntimeException(num, "The number is incorrect");
        else return num * num;
    }

    public static void main(String[] args) {
        try {
            MyRuntimeException.getPositiveResult(-8);
        } catch (MyRuntimeException ex) {
            LOGGER.error("The result is negative");
            ex.printStackTrace();
        }
    }
}