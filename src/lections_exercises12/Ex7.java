/*
Написать метод, который в 50% случаев бросает исключение.
Вызвать этот метод в конструкции try-catch-finally. Протестировать
работу блока finally
 */
package lections_exercises12;

import org.apache.log4j.Logger;

import static lections_exercises12.Ex6.GenerateRandomInt;

public class Ex7 {
    private static Logger LOGGER = Logger.getLogger(Ex7.class);
    public void ThrowExceptionOrNot() throws MyRuntimeException2{
        int random = GenerateRandomInt();
        if((random%3==0)||(random%5==0)||(random%7==0)){
            throw new MyRuntimeException2("The number is not even");
        }
    }
    public static void main(String[] args) {
        Ex7 ex = new Ex7();
        try {
            ex.ThrowExceptionOrNot();
        }catch (MyRuntimeException2 exe){
            LOGGER.error("The method threw exception");
            exe.printStackTrace();
        }finally {
            LOGGER.error("Test");
        }
    }
}
