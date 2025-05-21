package clase;

import java.util.ArrayList;
import java.util.List;

public class Subcategorie implements Component{
    private String name;
    private List<Component> copii;

    public Subcategorie(String name) {
        this.name = name;
        this.copii = new ArrayList<>();
    }

    @Override
    public void adaugaComponent(Component component) {
        copii.add(component);
    }

    @Override
    public void stergeComponent(Component component) {
        copii.remove(component);
    }

    @Override
    public Component getComponent(int index) {
        return copii.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Subcategorie " + name);
        copii.forEach(Component::descriere);
    }
}
