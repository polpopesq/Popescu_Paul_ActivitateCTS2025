package ro.ase.SingletonRegistry;

public class Autorizatie {
    private int numar;
    private String detinator;
    private String data;

    Autorizatie(int numar, String detinator, String data) {
        this.numar = numar;
        this.detinator = detinator;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Autorizatie{" +
                "numar=" + numar +
                ", detinator='" + detinator + '\'' +
                ", data='" + data + '\'' +
                '}';
    }


}
