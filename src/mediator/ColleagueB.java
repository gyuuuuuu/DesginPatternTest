package mediator;

class ColleagueB extends Colleague {
    ColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    void selfMethod() {
        System.out.println("ColleagueB self method");
    }

    @Override
    void dependMethod() {
        //depend on mediator
        //...
        super.mediator.doSomething();
    }

}
