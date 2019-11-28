package mediator;

class ColleagueA extends Colleague {

    ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    void selfMethod() {
        System.out.println("ColleagueA self method");
    }

    @Override
    void dependMethod() {
        //depend on mediator
        //...
        super.mediator.doSomething();

    }

}
