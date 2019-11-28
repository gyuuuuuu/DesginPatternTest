package templateMethod;

public abstract class AbstractClass {
    abstract void doSomething();
    abstract void doAnything();

    public void templateMethod(){
        System.out.println("This is template");
        this.doSomething();
        this.doAnything();
    }
}
