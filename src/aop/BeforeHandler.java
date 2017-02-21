package aop;

import java.lang.reflect.Method;

/**
 * Created by hadoop on 17-2-14.
 */
public abstract class BeforeHandler extends AbstractHandler {

    public abstract void handleBefore(Object proxy, Method method, Object[] args);

    /* (non-Javadoc)
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        handleBefore(proxy, method, args);
        return method.invoke(getTargetObject(), args);
    }
}
