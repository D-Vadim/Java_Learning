import java.util.ArrayList;

public class CustomStack<T> {
    private int length;
    private ArrayList<T> elements;

    public CustomStack() {
        length = 0;
        elements = new ArrayList<>();
    }

    public void push(T elem) {
        elements.add(elem);
        ++length;
    }

    public T pop() throws CustomEmptyStackException{
        if (elements.isEmpty()) {
            throw new CustomEmptyStackException("Err");
        }
        --length;
        return elements.remove(length);
    }

    public T peek() throws CustomEmptyStackException{
        if (elements.isEmpty()) {
            throw new CustomEmptyStackException("Err");
        }
        return elements.get(length - 1);
    }

    public int size() {
        return length;
    }
}
