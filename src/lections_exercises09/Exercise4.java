/*
Из задания 5.3 реализовать класс вычислитель для вещественных и
целых типов данных, используя
параметризацию классов
*/
package lections_exercises09;

public class Exercise4<T extends Number, V extends Number>{
    public T t;
    public V v;
    public Exercise4(T t, V v) {
        this.t = t;
        this.v = v;
    }
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public V getV() {
        return v;
    }
    public void setV(V v) {
        this.v = v;
    }
    public double mulValuesDouble(){
        return t.doubleValue()*v.doubleValue();
    }
    public int mulValuesInt(){
        return t.intValue()*v.intValue();
    }
    public double plusValuesDouble(){
       return t.doubleValue()+v.doubleValue();
    }
    public int plusValuesInt(){
        return t.intValue()+v.intValue();
    }
    public double minusValuesDouble(){
        return t.doubleValue()-v.doubleValue();
    }
    public int minusValuesInt(){
        return t.intValue()-v.intValue();
    }
    public double divValuesDouble(){
        return t.doubleValue()/v.doubleValue();
    }
    public int divValuesInt(){
        return t.intValue()/v.intValue();
    }

    public static void main(String[] args) {
        Exercise4<Integer, Integer> f = new Exercise4<>(4, 4);
        System.out.println(f.plusValuesDouble());
        System.out.println(f.plusValuesInt());
        System.out.println(f.divValuesDouble());
        System.out.println(f.divValuesInt());
        System.out.println(f.minusValuesDouble());
        System.out.println(f.minusValuesInt());
        System.out.println(f.mulValuesDouble());
        System.out.println(f.mulValuesInt());
    }
}
