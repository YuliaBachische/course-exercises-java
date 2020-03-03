package lections_exercises;
import java.math.BigDecimal;

public class MyClass {
    int a;
    int b;
    BigDecimal s;
    BigDecimal t;
    public MyClass(int a, int b){
        this.a = a;
        this.b = b;
    }
    public double MyCl(){
        double mul = a * b;
        return mul;
    }
    public MyClass(BigDecimal s, BigDecimal t){
        this.s = s;
        this.t = t;
    }
    public BigDecimal MyCls(){
        BigDecimal mul = s.multiply(t);
        return mul;
    }
    public static void main(String[] args) {
        MyClass d = new MyClass(BigDecimal.valueOf(823.49), BigDecimal.valueOf(9.238));
        System.out.println(d.MyCls());
    }
}
