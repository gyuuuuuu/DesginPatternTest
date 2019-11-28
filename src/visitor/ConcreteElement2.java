package visitor;

class ConcreteElement2 extends Element {

    @Override
    void dosomething() {
        System.out.println("ConcreteElement2 do");
    }

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
