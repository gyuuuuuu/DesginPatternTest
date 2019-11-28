package composite;

import java.util.ArrayList;
import java.util.List;

class Composite extends Component {

    private List<Component> componentList = new ArrayList<>();

    void add(Component component){
        this.componentList.add(component);
    }

    void remove(Component component){
        this.componentList.remove(component);
    }

    List<Component> getChildren(){
        return this.componentList;
    }

}
