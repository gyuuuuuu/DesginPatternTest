package strategy;

public class Context {

    private Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    void doAnything() {
        this.strategy.doSomething();
    }
}
