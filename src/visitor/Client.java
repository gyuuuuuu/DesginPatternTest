package visitor;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element e = ObjectStruture.createElement();
            e.accept(new Visitor());

        }
    }
}
