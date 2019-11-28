package command;

class Invoker {

    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void action() {
        this.command.excute();
    }

}
