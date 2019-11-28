package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new StaticProxy(new RealSubject());
        subject.request();

        Subject real = new RealSubject();
        InvocationHandler handler = new DynamicProxy(real);
        Subject proxy = (Subject) Proxy.newProxyInstance(real.getClass().getClassLoader(), new Class[]{Subject.class}, handler);
        proxy.request();
    }
}
