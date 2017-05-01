package Observer;

import java.util.Random;

/**
 * Created by hadoop on 17-5-1.
 * 生成随机数的类
 */
public class RandomNumberGenerator extends NumberGenerate {

    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
