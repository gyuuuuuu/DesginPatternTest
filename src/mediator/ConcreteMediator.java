package mediator;

class ConcreteMediator extends Mediator {

    @Override
    void doSomething() {
        this.colleagueA.selfMethod();
        this.colleagueB.selfMethod();
    }
}
