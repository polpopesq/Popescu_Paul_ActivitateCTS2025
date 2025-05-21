package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler operator = new OperatorCallCenter();
        Handler coordonator = new CoordonatorRelatiiClienti();
        Handler manager = new ManagerAgentie();
        Handler avocat = new AvocatAgentie();

        operator.setNextHandler(coordonator);
        coordonator.setNextHandler(manager);
        manager.setNextHandler(avocat);

        TipReclamatie reclamatie1 = TipReclamatie.MINORA;
        TipReclamatie reclamatie2 = TipReclamatie.GRAVA;
        TipReclamatie reclamatie3 = TipReclamatie.DESPAGUBIRE;
        TipReclamatie reclamatie4 = TipReclamatie.DUMNEZEU;

        operator.handle(reclamatie1);//operator call center
        operator.handle(reclamatie2);//manager
        operator.handle(reclamatie3);//avocat
        operator.handle(reclamatie4);//n o rezolva nimeni
    }
}