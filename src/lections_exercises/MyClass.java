package lections_exercises;
import java.math.BigDecimal;

public class MyClass {
    int a;
    int b;
    BigDecimal s;
    BigDecimal t;
    public double MyClass(int a, int b){
        this.a = a;
        this.b = b;
        double mul = a * b;
        return mul;
    }
    public BigDecimal MyClass(BigDecimal s, BigDecimal t){
        this.s = s;
        this.t = t;
        BigDecimal mul = s.multiply(t);
        return mul;
    }
    public static void main(String[] args) {
        MyClass d = new MyClass();
        System.out.println(d.MyClass(3,5));
    }
}

