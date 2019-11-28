package composite;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();

        Composite branch = new Composite();
        branch.add(new Leafs());
        root.add(branch);

        display(root);

    }

    private static void display(Composite root) {
        for (Component c: root.getChildren()) {
            if (c instanceof Leafs) {
                c.doSomething();
            } else {
                display((Composite) c);
            }
        }
    }
}
