package factory;

public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProduct.class);
        product.method1();
        product.method2();
    }
}
