package abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        AbstractProductA productA = factory1.createA();
        AbstractProductB productB = factory1.createB();
        productA.doSomething();
        productB.doSomething();

    }
}
