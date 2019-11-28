package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    Subject realSubject = null;

    public DynamicProxy() {}

    public DynamicProxy(Subject realSubject){
        this.realSubject = realSubject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.realSubject, args);
        return result;
    }
}
