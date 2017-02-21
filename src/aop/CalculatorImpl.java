package aop;

/**
 * Created by hadoop on 17-2-14.
 */
public class CalculatorImpl implements Calculator {

    @Override
    public int calculator(int a, int b) {
        System.out.println("----calculator----");
        return a/b;
    }
}
