package clase;

public interface Component {
    void adaugaComponent(Component component);
    void stergeComponent(Component component);
    Component getComponent(int index);
    void descriere();
}
