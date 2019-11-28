package decorator;

class ConcreteComponent extends Component {

    @Override
    void operate() {
        System.out.println("Concrete Component do something");
    }
}
