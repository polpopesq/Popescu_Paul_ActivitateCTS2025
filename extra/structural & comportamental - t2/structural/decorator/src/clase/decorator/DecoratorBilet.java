package clase.decorator;

import clase.Bilet;

public abstract class DecoratorBilet implements Bilet {
    Bilet bilet;

    public DecoratorBilet(Bilet bilet) {
        this.bilet = bilet;
    }
}
