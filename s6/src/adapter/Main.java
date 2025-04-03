package adapter;
//adapter de obiecte

import adapter.clase.AdaptorMedicament;
import adapter.clase.MedicamentFarmacie;
import adapter.clase.MedicamentSpital;

public class Main {

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie) {
        System.out.println("Bine ati venit la farmacie!");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        //1. Farmacia noastra (main) nu are medicamente de spital
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Nurofen", "22.05.2027", true, 12.5);
        vindeMedicament(medicamentFarmacie);

        //2. Farmacia primeste medicamente de spital si folosim adapter ca sa putem apela vindeMedicament()
        MedicamentSpital medicamentSpital = new MedicamentSpital("Paracetamol", 20);
        //vindeMedicament(medicamentSpital); NU merge
        vindeMedicament(new AdaptorMedicament(medicamentSpital)); //asa se foloseste
    }
}