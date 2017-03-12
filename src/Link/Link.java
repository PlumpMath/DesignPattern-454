package Link;

/**
 * Created by hadoop on 17-3-12.
 * 单链表简单实现
 */
public class Link {

    private int size = 0;
    private Node first;
    private Node last;

    public Link() {

    }

    public void addLast(int data) {
        if (size == 0) {
            first = new Node(data);
            last = first;
        } else {
            Node node = new Node(data);
            last.setNext(node);
            last = node;
        }
        size++;
    }

    public void addFirst(int data) {
        if (size == 0) {
            first = new Node(data);
            last = first;
        } else {
            Node node = new Node(data);
            node.setNext(first);
            first = node;
        }
        size++;
    }

    public void fillStart(int data) {
        first = new Node(data);
        last = first;
    }

    public void add(int data, int index) {
        if (size > index) {
            if (size == 0) {
                fillStart(data);
                size++;
            } else if (index == 0) {
                addFirst(data);
            } else if (size == index+1) {
                addLast(data);
            } else {
                Node temp = get(index);
                Node node = new Node(data);
                node.setNext(temp.getNext());
                temp.setNext(node);
                size++;
            }
        } else {
            throw new IndexOutOfBoundsException("链表没有那么长!");
        }
    }

    public void removeFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("链表没有元素!");
        } else if (size == 1) {
            clear();
        } else {
            Node temp = first;
            first = temp.getNext();
            temp = null;
            size--;
        }
    }

    public void removeLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("链表没有元素!");
        } else if (size == 1) {
            clear();
        } else {
            Node temp = get(size-2);
            temp.setNext(null);
            size--;
        }
    }

    public void removeMiddle(int index) {
        if (size == 0) {
            throw new IndexOutOfBoundsException("链表没有元素!");
        } else if (size == 1) {
            clear();
        } else {
            if (index == 0) {
                removeFirst();
            } else if (size == index -1) {
                removeLast();
            } else {
                Node temp = get(index - 1);
                Node next = temp.getNext();
                temp.setNext(next.getNext());
                next = null;
                size--;
            }
        }
    }

    public Node get(int index) {
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void printAll() {
        Node temp = first;
        System.out.println("链表中所有元素: ");
        System.out.print(temp.getData() + " ");
        for (int i = 0; i < size -1; i++) {
            temp = temp.getNext();
            System.out.print(temp.getData() + " ");
        }
        System.out.println();
    }
}
