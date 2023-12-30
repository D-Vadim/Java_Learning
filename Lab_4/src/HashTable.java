import java.util.LinkedList;

public class HashTable<K, V> {
    private final int capacity;
    private int size;
    private LinkedList<Item<K, V>>[] table;

    HashTable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table = new LinkedList[capacity];
    }

    public V get(K key) {
        int index = key.hashCode() % this.capacity;
        LinkedList<Item<K, V>> item = this.table[index];

        for (Item<K, V> i : this.table[index]) {
            if (i.getKey().equals(key)) {
                return i.getVal();
            }
        }

        return null;
    }

    public void put(K key, V value) {
        int index = key.hashCode() % this.capacity;

        if (this.table[index] == null) {
            this.table[index] = new LinkedList<>();
        }

        for (Item<K, V> item : this.table[index]) {
            if (item.getKey().equals(key)) {
                item.setVal(value);
                return;
            }
        }

        this.table[index].add(new Item<K, V>(key, value));
        this.size += 1;
    }

    public void remove(K key) {
        int index = key.hashCode() % this.capacity;

        for (Item<K, V> i : this.table[index]) {
            if (i.getKey().equals(key)) {
                this.table[index].remove(i);
                // i.setVal(null);
                this.size -= 1;
                return;
            }
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}
