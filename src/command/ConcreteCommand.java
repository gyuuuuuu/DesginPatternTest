package command;

class ConcreteCommand extends Command {

    private Reciever reciever;

    ConcreteCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    void excute() {
        this.reciever.doSomething();
    }
}
