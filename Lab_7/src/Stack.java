import java.util.Arrays;

public class Stack<T> {
    private T[] data;
    private int size;
    public Stack(int capacity) {
        System.out.println("-");
        data = (T[]) new Object[capacity];
        size = 0;
    }
    public void push(T element) {
        System.out.println("-");
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }

        size += 1;
        data[size] = element;

    }
    public T pop() {
        System.out.println("-");
        if (size == 0) {
            return null;
        }

        size -= 1;
        return data[size + 1];
    }
    public T peek() {
        System.out.println("-");
        if (size == 0) {
            return null;
        }

        return data[size];
    }
}
