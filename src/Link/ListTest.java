package Link;

/**
 * Created by hadoop on 17-3-12.
 */
public class ListTest {

    public static void main(String[] args) {
        Link link = new Link();
        link.addFirst(2);
        link.addFirst(1);
        link.addLast(4);
        link.addLast(5);
        link.add(3, 1);
        link.printAll();
        link.removeFirst();
        link.removeLast();
        link.removeMiddle(1);
        link.printAll();
        link.removeFirst();
        link.removeFirst();
        System.out.println(link.size());
    }
}
