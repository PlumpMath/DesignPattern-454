package aop;

import java.lang.reflect.Method;

/**
 * Created by hadoop on 17-2-14.
 */
public class AfterHandlerImpl extends AfterHandler {

    @Override
    public void handleAfter(Object proxy, Method method, Object[] args) {
        //Provide your own cross cutting concern
        System.out.println("Handling after actual method execution ........");
    }
}
