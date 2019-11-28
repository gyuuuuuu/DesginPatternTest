package proxy;

public class StaticProxy implements Subject {
    private Subject realSubject = null;

    public StaticProxy() {}

    public StaticProxy(Subject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
