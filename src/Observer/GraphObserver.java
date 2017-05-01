package Observer;

/**
 * Created by hadoop on 17-5-1.
 */
public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerate generate) {
        System.out.print("GraphObserver:");
        int count = generate.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
