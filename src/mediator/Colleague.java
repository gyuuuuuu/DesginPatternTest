package mediator;

abstract class Colleague {
    Mediator mediator;
    Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void selfMethod();
    abstract void dependMethod();
}
