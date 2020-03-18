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
    static long num;
    static String toString(long num) {
        return "" + num;
    }
    public  Exercise7(long num) {
        Exercise7.num = num;
    }

    public  static StringBuilder getSymbolsFirstMethod(){   //первый способ
        StringBuilder res = new StringBuilder();
        int length =10 - toString(num).length();
        if(length<10){
            res.append("0".repeat(Math.max(0, length)));
           res.append(num);
        } else{
            res.append("0000000000");
        }
        return res;
    }
    public static String getSymbolsSecondMethod(){          //второй способ
        int length =10 - toString(num).toCharArray().length;
        if (length>=0) {
            return String.format("%1$010d", num);
        }
        return "0000000000";
    }
    public static String getSymbolsThirdMethod(){            //третий способ
        String str = "";
        int length =10 - toString(num).length();
        if(length<10){
            for(int i = 0; i < length; i++){
                str += "0";
            }
            str+=toString(num);
            return str;
        }
        return "0000000000";
    }
    public static StringBuffer getSymbolsFourthMethod(){            //третий способ
        StringBuffer stringBuffer = new StringBuffer();
        int length =10 - toString(num).length();
        if(length<10){
            stringBuffer.append("0".repeat(Math.max(0, length))) ;
            stringBuffer.append(num);
            return stringBuffer;
        } else {
            return stringBuffer.append("0000000000");
        }
    }
    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            Exercise7.getSymbolsFirstMethod();
        }
        long processTime = System.currentTimeMillis() - startTime;
        LOGGER.info(processTime + " ms");

        long startTime2 = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            Exercise7.getSymbolsSecondMethod();
        }
        long processTime2 = System.currentTimeMillis()-startTime2;
        LOGGER.info(processTime2 + " ms");

        long startTime3 = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            Exercise7.getSymbolsThirdMethod();
        }
        long processTime3 = System.currentTimeMillis()-startTime3;
        LOGGER.info(processTime3 + " ms");

        long startTime4 = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            Exercise7.getSymbolsFourthMethod();   // 4 способ самый быстрый
        }
        long processTime4 = System.currentTimeMillis()-startTime4;
        LOGGER.info(processTime4 + " ms");
    }
}
