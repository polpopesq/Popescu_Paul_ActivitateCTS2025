package clase.decorator;

import clase.Bilet;

public class BiletPrioritate extends DecoratorBilet{
    public BiletPrioritate(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void descriere() {
        bilet.descriere();
        System.out.println("Contine si prioritate");
    }

    public void acordaPrioritate() {
        System.out.println("Prioritate");
    }
}
