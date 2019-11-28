package memento;

class Originator {

    private String state;

    String getState() {
        return state;
    }

    void setState(String state) {
        this.state = state;
    }

    //create a memento
    Memento createMemento(){
        return new Memento(this.state);
    }

    //recover from a memento
    void restore(Memento memento) {
        this.setState(memento.getState());
    }
}
