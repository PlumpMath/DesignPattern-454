package aop;

import java.lang.reflect.Method;

/**
 * Created by hadoop on 17-2-14.
 */
public class BeforeHandlerImpl extends BeforeHandler {

    @Override
    public void handleBefore(Object proxy, Method method, Object[] args) {
        //Provide your own cross cutting concern
        System.out.println("Handling before actual method execution ........");
    }
}
