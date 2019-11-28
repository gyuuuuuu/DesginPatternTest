package observer;

class ConcreteObserver extends Observer{

    @Override
    void update() {
        System.out.println("update!");
    }
}
