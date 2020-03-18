/*
Вывести учеников из списка в обратном порядке. (2 варианта решения)
 */
package lections_exercises10;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Exercise3 {
    private static Logger LOGGER = Logger.getLogger(Exercise3.class);
    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);
        String [] students = new String[10];
        for (int i = 0; i < students.length ; i++) {
            students[i] = Random();
        }
        ArrayList<String> listOfStudents = new ArrayList<>(Arrays.asList(students));
        LOGGER.info("List of students: " + listOfStudents);
        ListIterator<String> numListIter = listOfStudents.listIterator(listOfStudents.size());
        StringBuilder str1 = new StringBuilder();
        while (numListIter.hasPrevious()){                                               //first option
            str1.append(numListIter.previous()).append(" ");
        }
        LOGGER.info("The solution via method previous, cycle while and StringBuilder: " + "\n" + str1);
        StringBuilder str = new StringBuilder();
        for (int i = listOfStudents.size()-1; i >= 0; i--) {                              //second option
            str.append(listOfStudents.get(i)).append(" ");
        }
        LOGGER.info("The solution via cycle for and StringBuilder: " + "\n" + str);
    }

    public static String Random(){
        String [] names = {"josh", "jack", "hugh", "student12", "alice","marge", "helen", "lory", "larry", "jenna", "justin", "holly", "alex", "bobs"};
        return names[(int) (Math.random() * 10) +1];
    }
}
