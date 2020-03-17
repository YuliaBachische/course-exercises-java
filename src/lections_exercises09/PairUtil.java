package lections_exercises09;

public final class PairUtil {
    static  <K, V> Pair<V, K> swap(Pair<K, V> pair ){
        return new Pair<V, K>(pair.v, pair.k);
    }
}
