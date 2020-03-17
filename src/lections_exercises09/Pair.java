package lections_exercises09;

import static lections_exercises09.PairUtil.swap;

public class Pair<K , V>  {
    public K k;
    public V v;
    public static void main(String[] args) {
        Pair<Integer, Integer> fsd = new Pair<>(3, 2);
        Pair<String, Integer> newPair = new Pair<>("sd",3);
        System.out.println(swap(fsd));
        System.out.println(swap(newPair));
    }
    public Pair() {
    }
    @Override
    public String toString() {
        return "Pair{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }
    public K getK() {
        return k;
    }
    public  void setK(K k) {
        this.k = k;
    }
    public V getV() {
        return v;
    }
    public void setV(V v) {
        this.v = v;
    }
}
