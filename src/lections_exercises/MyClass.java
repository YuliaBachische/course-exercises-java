/*
Определить класс, который при инициализации принимает на
вход 2 аргумента целого или вещественного типа. Задать
перегруженные методы
возвращающие результат арифметических
операций над заданными полями и полями типа
BigDecimal
 */
package lections_exercises;
import java.math.BigDecimal;

public class MyClass {
    int a;
    int b;
    double a1;
    double b1;
    BigDecimal s;
    BigDecimal t;
    public double MyClass(double a1, double b1){
        this.a1 = a1;
        this.b1 = b1;
        double mul = a1 * b1;
        return mul;
    }
    public int MyClass(int a, int b){
        this.a = a;
        this.b = b;
        int mul = a * b;
        return mul;
    }
    public BigDecimal MyClass(BigDecimal s, BigDecimal t){
        BigDecimal mul = s.multiply(t);
        return mul;
    }
    public static void main(String[] args) {
        MyClass d = new MyClass();
        System.out.println(d.MyClass(3,5));
    }
}
