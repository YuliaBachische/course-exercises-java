/*
Написать
программу, выполняющую поиск в строке всех тегов
абзацев, в т.ч. тех, у которых есть параметры, например
<p id="p1">,
и замену их на простые теги абзацев
<p>
*/
package lections_exercises14;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {
    private static Logger LOGGER = Logger.getLogger(Exercise3.class);
    public static void main(String[] args) {
        String str = "sfs <p id = p1> fef <p id = p1> seller <p> kks";
        Pattern p=Pattern.compile("<[^<>]+>");
        Matcher m=p.matcher(str);
        while (m.find()){
           LOGGER.setLevel(Level.INFO);
           LOGGER.info(m.start() + " " + m.end());
           str = str.replaceAll(p.pattern(), "<p>");
           LOGGER.info(str);
        }
    }
}

