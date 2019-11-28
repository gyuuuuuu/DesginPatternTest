package visitor;

class Visitor implements IVisitor {


    @Override
    public void visit(ConcreteElement1 e) {
        e.dosomething();
    }

    @Override
    public void visit(ConcreteElement2 e) {
        e.dosomething();
    }
}
