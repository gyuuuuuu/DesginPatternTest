package visitor;

class ConcreteElement1 extends Element{

    @Override
    void dosomething() {
        System.out.println("ConcreteElement1 do");
    }

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
