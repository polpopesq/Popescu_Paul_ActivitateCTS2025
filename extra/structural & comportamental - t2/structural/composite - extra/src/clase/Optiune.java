package clase;

public class Optiune implements Component {
    private String nume;

    public Optiune(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaComponent(Component component) {
        System.out.println("Nu poti adauga componenta la frunza!");
    }

    @Override
    public void stergeComponent(Component component) {
        System.out.println("Nu poti sterge componenta la frunza!");
    }

    @Override
    public Component getComponent(int index) {
        System.out.println("Nu poti getui componenta la frunza!");
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("Optiunea " + nume);
    }
}
