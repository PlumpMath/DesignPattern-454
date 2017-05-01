package Observer;

/**
 * Created by hadoop on 17-5-1.
 */
public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerate generate) {
        System.out.println("DigitObserver:" + generate.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
