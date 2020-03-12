/*
 Написать функцию, принимающую на вход целое число, возвращающую
строку из 10 символов, дополненных слева нулями.
Если число выходит за размер 10
символов вернуть все нули.
Пример getString(22)-> 0000000022
Найти 3 способа решения задачи и определить наиболее быстрый способ
 */
package lections_exercises13;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Exercise7 {
    private static Logger LOGGER = Logger.getLogger(Exercise7.class);
    long num;
    static String toString(long num) {
        return "" + num;
    }
    public Exercise7(long num) {
        this.num = num;
    }
    public  StringBuilder getSymbolsFirstMethod(){   //первый способ
        StringBuilder res = new StringBuilder();
        int length =10 - toString(num).toCharArray().length;
        char [] chars = new char[length];
        if(length<10){
            for(int i = 0; i < length; i++){
                chars[i] = '0';
                res.append(chars[i]);
            }
           res.append(toString(num));
            return res;
        } else{
            res.append("0000000000");
            return res;
        }
    }
    public String getSymbolsSecondMethod(){          //второй способ
        int length =10 - toString(num).toCharArray().length;
        if (length>=0) {
            return String.format("%1$010d", num);
        }
        return "0000000000";
    }
    public String getSymbolsThirdMethod(){            //третий способ
        String str = "";
        int length =10 - toString(num).toCharArray().length;
        char [] chars = new char[length];
        if(length<10){
            for(int i = 0; i < length; i++){
                chars[i] = '0';
                str += chars[i];
            }
            str+=toString(num);
            return str;
        }
        return "0000000000";
    }
    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);

        long startTime = System.currentTimeMillis();
        Exercise7 ex = new Exercise7(6);
        LOGGER.info(ex.getSymbolsFirstMethod());
        long processTime = System.currentTimeMillis() - startTime;
        LOGGER.info(processTime + " ms");

        long startTime2 = System.currentTimeMillis(); //второй способ самый быстрый
        Exercise7 ex2 = new Exercise7(6);
        LOGGER.info(ex2.getSymbolsSecondMethod());
        long processTime2 = System.currentTimeMillis()-startTime2;
        LOGGER.info(processTime2 + " ms");

        long startTime3 = System.currentTimeMillis();
        Exercise7 ex3 = new Exercise7(6);
        LOGGER.info(ex3.getSymbolsThirdMethod());
        long processTime3 = System.currentTimeMillis()-startTime3;
        LOGGER.info(processTime3 + " ms");
    }
}
