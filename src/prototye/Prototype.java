package prototye;

public class Prototype implements Cloneable {

    @Override
    public Prototype clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            //
        }
        return prototype;
    }

}
