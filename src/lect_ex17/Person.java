package lect_ex17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jack", "Smith", 34);
        Person person2 = new Person("Lydia", "Watson", 20);
        Person person3 = new Person("Jeremy", "James", 54);
        Person person4 = new Person("Madison", "Green", 28);
        Person person5 = new Person("Jeremy", "Piers", 25);
        Person person6 = new Person("Donatello", "Williams", 58);
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);
        String res = list.stream()
                .filter(person -> (person.firstName.length() + person.lastName.length())<15)
                .max (Comparator.comparingInt(a -> a.age)).map(person -> person.firstName + " " + person.lastName).orElse("");
        System.out.println(res);
        }
}
