package aop;

import java.lang.reflect.InvocationHandler;

/**
 * Created by hadoop on 17-2-14.
 */
public abstract class AbstractHandler implements InvocationHandler {

    private Object targetObject;


    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object getTargetObject() {
        return targetObject;
    }
}
