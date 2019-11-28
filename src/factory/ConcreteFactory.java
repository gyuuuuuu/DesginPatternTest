package factory;

public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Product)Class.forName(c.getName()).newInstance();
    }
}
