package Stack;

import java.util.Arrays;

/**
 * Created by hadoop on 17-4-23.
 * Stack栈
 */
@SuppressWarnings("never used")
public class Stack<E> {
    private int size = 0;
    private Object[] array;

    public Stack() {
        this(10);
    }

    public Stack(int initCapacity) {
        if (initCapacity <= 0) {
            throw new RuntimeException("初始化栈空间错误!");
        }
        array = new Object[initCapacity];
    }

    public E push(E item) {
        synchronized (Stack.class) {
            ensureCapacity(size + 1);
            array[size++] = item;
        }
        return item;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("栈已经空!");
        }
        return (E) array[size-1];
    }

    public E pop() {
        E item;
        synchronized (Stack.class) {
            item = peek();
            size--;
        }
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            grow();
        }
    }

    private void grow() {
        int oldCapacity = array.length;
        int newCapacity = oldCapacity*2;
        if (newCapacity < oldCapacity) {
            throw new OutOfMemoryError();
        } else {
            array = Arrays.copyOf(array, newCapacity);
        }
    }
}
