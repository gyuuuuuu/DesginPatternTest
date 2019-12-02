package state;

class Context {

    final static State STATE1 = new ConceteState1();
    final static State STATE2 = new ConceteState2();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    void setCurrentState(State currentState) {
        this.currentState = currentState;
        //switch states
        this.currentState.setContext(this);
    }

    void handle1() {
        this.currentState.handle1();
    }

    void handle2() {
        this.currentState.handle2();
    }

}
