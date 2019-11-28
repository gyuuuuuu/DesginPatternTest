package visitor;

abstract class Element {
    abstract void dosomething();

    abstract void accept(IVisitor visitor);
}
