package aop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hadoop on 17-2-14.
 * main function
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("AOP Example");

        CalculatorImpl calcImpl = new CalculatorImpl();
        BeforeHandler before = new BeforeHandlerImpl();
        AfterHandler after = new AfterHandlerImpl();
        List<AbstractHandler> handlers = new ArrayList<>();
        handlers.add(before);
        handlers.add(after);
        Calculator proxy = (Calculator) ProxyFactory.getProxy(calcImpl, handlers);
        int result = proxy.calculator(20, 10);
        System.out.println("Result: " + result);
    }
}
