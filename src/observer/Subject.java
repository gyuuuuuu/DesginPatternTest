package observer;

import java.util.Vector;

abstract class Subject {
    private Vector<Observer> obsVector = new Vector<>();

    void addObserver(Observer o) {
        this.obsVector.add(o);
    }

    void removeObserver(Observer o) {
        this.obsVector.remove(o);
    }

    void notifyAllObservers() {
        for (Observer o : obsVector) {
            o.update();
        }
    }

}
