package state;

abstract class State {

    Context context;

    void setContext(Context context) {
        this.context = context;
    }

    abstract void handle1();
    abstract void handle2();
}
