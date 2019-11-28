package mediator;

public abstract class Mediator {
    Colleague colleagueA;
    Colleague colleagueB;

    public Colleague getColleagueA() {
        return colleagueA;
    }

    void setColleagueA(Colleague colleagueA) {
        this.colleagueA = colleagueA;
    }

    public Colleague getColleagueB() {
        return colleagueB;
    }

    void setColleagueB(Colleague colleagueB) {
        this.colleagueB = colleagueB;
    }

    abstract void doSomething();
}
