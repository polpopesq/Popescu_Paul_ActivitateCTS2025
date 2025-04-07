package adapter.clase;

public class AdaptorMedicament extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdaptorMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), "01.04.2026", true, medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
