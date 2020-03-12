/*
Написать функцию, принимающую в качестве параметров имя, фамилию и
отчество и возвращающую
инициалы
в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
регистре, а результирующая строка должна быть в верхнем
 */
package lections_exercises13;

public class Exercise4 {
    public String getShortenName( String surname,String name, String fatherName){
        String res = surname.toUpperCase().substring(0,1);
        res += "." + name.toUpperCase().substring(0,1);
        res += "." + fatherName.toUpperCase().substring(0,1);
        return res;
    }
    public static void main(String[] args) {
        Exercise4 ex = new Exercise4();
        System.out.println(ex.getShortenName("Бачище", "Юлия", "Андреевна"));
    }

}
