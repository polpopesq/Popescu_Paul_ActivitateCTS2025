package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String nume;
    private List<Structura> lista;
    private int nrAngajati;

    public Departament(String nume, int nrAngajati) {
        this.nume = nume;
        this.lista = new ArrayList<>();
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        lista.add(structura);
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        lista.remove(structura);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departamentul " + nume + " cu " + nrAngajati + " angajati. Sectii:");
        lista.forEach(Structura::afiseazaDescriere);
    }

    @Override
    public Structura getStructura(int index) throws Exception {
        return lista.get(index);
    }
}
