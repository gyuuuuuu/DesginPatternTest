package memento;

public class Client {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("1");
        System.out.println(originator.getState());

        Memento memento = originator.createMemento();
        caretaker.setMemento(memento);
        originator.setState("2");
        System.out.println(originator.getState());

        originator.restore(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
