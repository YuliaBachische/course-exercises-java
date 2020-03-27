/*
Создать объект LocalDate,
представляющий собой сегодняшнюю
дату.Преобразовать дату в строку вида "05.05.2017".
Вывести эту строку в консоль
*/
package lect_exs30;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise3 {
    private static Logger LOGGER = Logger.getLogger(Exercise3.class);
    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        LocalDate localDate = LocalDate.now();
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(exercise3.getDate(localDate));
    }
    @Test
    public String getDate(LocalDate localDate){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return localDate.format(dateTimeFormatter);
    }
}
