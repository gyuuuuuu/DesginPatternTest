package state;

class ConceteState2 extends State {

    @Override
    void handle1() {
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    void handle2() {
        System.out.println("ConceteState2 handle2");
    }
}
