package state;

class ConceteState1 extends State {

    @Override
    void handle1() {
        System.out.println("ConceteState1 handle1");
    }

    @Override
    void handle2() {
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
