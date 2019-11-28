package decorator;

class Decorator extends Component{

    private Component component;

    Decorator(Component component) {
        this.component = component;

    }

    private void selfMethod() {
        System.out.println("selfMethod");
    }


    @Override
    void operate() {
        this.selfMethod();
        this.component.operate();
    }
}
