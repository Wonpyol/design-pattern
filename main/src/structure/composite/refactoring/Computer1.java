package structure.composite.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Computer1 extends ComputerDevice {
    // 복수 개의 ComputerDevice 객체를 가리킴
    private List<ComputerDevice> components = new ArrayList<ComputerDevice>();
    public void addComponent(ComputerDevice component) {
        components.add(component);
    }
    public void removeComponent(ComputerDevice component) {
        components.remove(component);
    }

    @Override
    public int getPrice() {
        if(components.isEmpty()){
            return 0;
        }
        return components.stream().mapToInt(item -> item.getPrice()).sum();
    }

    @Override
    public int getPower() {
        if(components.isEmpty()){
            return 0;
        }
        return components.stream().mapToInt(item -> item.getPower()).sum();
    }
}
