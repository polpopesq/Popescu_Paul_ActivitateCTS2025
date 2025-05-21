package program;

import clase.Pacient;
import clase.SpitalProxy;

public class Main {
    public static void main(String[] args) {
        SpitalProxy spitalProxy = new SpitalProxy(new Pacient("Mifu", true));
        spitalProxy.internare();

        SpitalProxy spitalProxy1 = new SpitalProxy(new Pacient("Gheorghe", false));
        spitalProxy1.internare();
    }
}
