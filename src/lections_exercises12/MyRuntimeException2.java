package lections_exercises12;

import org.apache.log4j.Logger;

public class MyRuntimeException2 extends Exception{
    private static Logger LOGGER = Logger.getLogger(MyRuntimeException2.class);
    String ex;

    public MyRuntimeException2(String message) {
        super(message);
    }

    public static int GetException(int num) {
        return 20/num;
    }

    public static void main(String[] args) {
        try {
            MyRuntimeException2.GetException(0);
        } catch (ArithmeticException ex){
            try {
                throw new MyRuntimeException2("ArithmeticException");
            } catch (MyRuntimeException2 ex2) {
                ex2.printStackTrace();
            }
        }
    }
}
