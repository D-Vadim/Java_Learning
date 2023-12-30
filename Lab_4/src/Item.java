public class Item<K, V> {

    private K key;
    private V val;

    Item(K k, V v) {
        this.key = k;
        this.val = v;
    }

    public K getKey() {
        return this.key;
    }

    public V getVal() {
        return this.val;
    }

    public void setVal(V v) {
        this.val = v;
    }
}
