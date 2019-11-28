package builder;

class ConcreteBuilder extends Builder {

    private Product product = new Product();

    @Override
    void setPart() {
        //
        //
    }

    @Override
    Product buildPart() {
        return product;
    }
}
