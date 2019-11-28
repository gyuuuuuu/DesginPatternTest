package observer;

class ConcreteSubject extends Subject {

    void doSomething() {
        //...

        super.notifyAllObservers();
    }
}
