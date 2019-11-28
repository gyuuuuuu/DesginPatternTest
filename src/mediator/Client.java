package mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ColleagueA(mediator);
        Colleague colleagueB = new ColleagueB(mediator);
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        mediator.doSomething();
        colleagueA.dependMethod();
    }
}
