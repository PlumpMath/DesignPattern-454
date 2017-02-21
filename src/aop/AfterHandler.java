package aop;

import java.lang.reflect.Method;

/**
 * Created by hadoop on 17-2-14.
 */
public abstract class AfterHandler extends AbstractHandler {

    public abstract void handleAfter(Object proxy, Method method, Object[] args);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(getTargetObject(), args);
        handleAfter(proxy, method, args);
        return result;
    }
}
