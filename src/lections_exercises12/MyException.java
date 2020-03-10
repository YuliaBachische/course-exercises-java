package lections_exercises12;

import org.apache.log4j.Logger;

public class MyException extends Exception {
    private static Logger LOGGER = Logger.getLogger(MyException.class);

    public static int getPositiveResult(int num) throws MyException{
        if(num<0) throw new MyException();
        else return num*num;
    }

    public static void main(String[] args) {
        try {
            MyException.getPositiveResult(-8);
        } catch (MyException ex){
            LOGGER.error("The result is negative");
            ex.printStackTrace();
        }
    }
}
