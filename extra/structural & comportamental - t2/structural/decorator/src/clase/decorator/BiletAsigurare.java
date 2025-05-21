package clase.decorator;

import clase.Bilet;

public class BiletAsigurare extends DecoratorBilet{
    public BiletAsigurare(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void descriere() {
        bilet.descriere();
        System.out.println("Contine si asigurare.");
    }
}
