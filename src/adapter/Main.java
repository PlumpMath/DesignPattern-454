package adapter;

/**
 * Created by hadoop on 17-2-13.
 */
public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
