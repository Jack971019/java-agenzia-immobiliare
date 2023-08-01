package org.Lessons.Java.Agenzia.Immobiliare;

public class Main {
    public static void main(String[] args) {

        AgenziaImmobiliare agenziaImmobiliare = new AgenziaImmobiliare();

        Abitazione a1 = new Abitazione("re534tr", "piazza wagner 4", 20789, "milano", 180, 60, 6,2);
        Abitazione a2 = new Abitazione("ps029ir", "piazza wagner 4", 20789, "milano", 180, 50, 6,2);
        Abitazione a3 = new Abitazione("te378mn", "piazza wagner 4", 20789, "milano", 180, 50, 6,2);

        Villa v1 = new Villa("tr546tr", "via pallo 3", 20678, "milano", 400, 60, 8, 4, 180);
        Villa v2 = new Villa("to087po", "via pallo 3", 20678, "milano", 400, 50, 8, 4, 180);
        Villa v3 = new Villa("yr637ut", "via pallo 3", 20678, "milano", 400, 50, 8, 4, 180);

        Box b1 = new Box("te358cv", "via pinco 5", 20798, "mialno", 60, 20, 2);
        Box b2 = new Box("te378re", "via pinco 5", 20798, "mialno", 60, 20, 2);
        Box b3 = new Box("te178lh", "via pinco 5", 20798, "mialno", 60, 20, 2);

        agenziaImmobiliare.aggiungiImmobile(a1);
        agenziaImmobiliare.aggiungiImmobile(a2);
        agenziaImmobiliare.aggiungiImmobile(a3);
        agenziaImmobiliare.aggiungiImmobile(v1);
        agenziaImmobiliare.aggiungiImmobile(v2);
        agenziaImmobiliare.aggiungiImmobile(v3);
        agenziaImmobiliare.aggiungiImmobile(b1);
        agenziaImmobiliare.aggiungiImmobile(b2);
        agenziaImmobiliare.aggiungiImmobile(b3);

        agenziaImmobiliare.trovaUnImmobileConCodice("re534tr").miPiaceImmobile();


        System.out.println("hai selezionato" + agenziaImmobiliare.trovaUnImmobileConCodice("re534tr"));

        System.out.println(agenziaImmobiliare.maggiorInteresse());

    }






























    /*public static void main(String[] args) {

        Abitazione a1 = new Abitazione("fr435tr", "via pincopallo 14", 29876,"milano", 300, 100, 6, 2);
        Abitazione a2 = new Abitazione("ft568ui", "via pincopallo 14", 29876,"milano", 320, 100, 6, 2);
        Abitazione a3 = new Abitazione("fp097mg", "via pincopallo 14", 29876,"milano", 200, 100, 6, 2);

        Box b1 = new Box("gy647jf", "via pollo 3", 20876, "milano", 45, 68, 2);
        Box b2 = new Box("gj035sd", "via pollo 3", 20875, "milano", 45, 69, 2);

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




    }*/
}
