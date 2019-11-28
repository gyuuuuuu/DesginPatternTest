package factory;

public abstract class Factory {
    public abstract Product createProduct(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
