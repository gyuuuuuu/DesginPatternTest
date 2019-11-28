package abstractfactory;

public class Factory1 extends AbstractFactory {
    @Override
    public AbstractProductA createA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createB() {
        return new ProductB1();
    }
}
