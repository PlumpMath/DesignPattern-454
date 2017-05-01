package Stack;

import java.util.Arrays;

/**
 * Created by hadoop on 17-3-12.
 * 栈的数组方式简易实现
 */
public class StackI {

    private int mSize = 0;
    private int[] array;

    public StackI() {
        this(10);
    }

    public StackI(int size) {
        if (size <= 0) {
            size = 10;
        }
        array = new int[size];
    }

    /**
     * 入栈操作
     * @param item
     */
    public void push(int item) {
        if (mSize == array.length) {
            array = Arrays.copyOf(array, mSize*2);
        }
        array[mSize++] = item;
    }

    public int peek() {
        if (mSize == 0) {
            throw new IndexOutOfBoundsException("栈已经空");
        }
        return array[mSize-1];
    }

    public int pop() {
        int item = peek();
        mSize--;
        return item;
    }

    public boolean isFull() {
        return mSize == array.length;
    }

    public boolean isEmpty() {
        return mSize == 0;
    }

    public int size() {
        return mSize;
    }
}
