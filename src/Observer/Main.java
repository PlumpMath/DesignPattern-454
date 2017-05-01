package Observer;

/**
 * Created by hadoop on 17-5-1.
 * 测试观察者模式
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerate generate = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generate.addObserver(observer1);
        generate.addObserver(observer2);
        generate.execute();
    }
}
