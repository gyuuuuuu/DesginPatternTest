package state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConceteState1());
        context.handle1();
        context.handle2();
    }
}
