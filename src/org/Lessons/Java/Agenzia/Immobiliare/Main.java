package org.Lessons.Java.Agenzia.Immobiliare;

public class Main {
    public static void main(String[] args) {

        Abitazione a1 = new Abitazione("fr435tr", "via pincopallo 14", 29876,"milano", 300, 100, 6, 2);
        Abitazione a2 = new Abitazione("ft568ui", "via pincopallo 14", 29876,"milano", 300, 100, 6, 2);
        Abitazione a3 = new Abitazione("fp097mg", "via pincopallo 14", 29876,"milano", 300, 100, 6, 2);

        Box b1 = new Box("gy647jf", "via pollo 3", 20876, "milano", 45, 68, 2);
        Box b2 = new Box("gj035sd", "via pollo 3", 20876, "milano", 45, 68, 2);

        Villa v1 = new Villa("by730lz", "piazza roma 5", 20788, "milano", 500, 200, 8, 4, 250);


        AgenziaImmobiliare agenziaImmobiliare = new AgenziaImmobiliare();

        agenziaImmobiliare.aggiungiImmobile(a1);
        agenziaImmobiliare.aggiungiImmobile(a2);
        agenziaImmobiliare.aggiungiImmobile(a3);
        agenziaImmobiliare.aggiungiImmobile(b1);
        agenziaImmobiliare.aggiungiImmobile(b2);
        agenziaImmobiliare.aggiungiImmobile(v1);

        System.out.println("Sono presenti" + "\s" + agenziaImmobiliare.contaImmobili()+ "\s" + "immobili nel sistema");
        System.out.println("hai selezionato" + "\s" + agenziaImmobiliare.trovaUnImmobileConCodice("by730lz"));


    }
}
