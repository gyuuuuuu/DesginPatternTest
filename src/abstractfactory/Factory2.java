package abstractfactory;

public class Factory2 extends AbstractFactory {
    @Override
    public AbstractProductA createA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createB() {
        return new ProductB2();
    }
}
