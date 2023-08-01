package org.Lessons.Java.Agenzia.Immobiliare;

public class Abitazione extends Immobili{

    // ATTRIBUTI

    private int numeroDiVani;

    private int numeroDiBagni;

    // COSTRUTTORI

    public Abitazione(String codice, String indirizzo, int cap, String city, int squaremeters, int numeroPersoneInteressate, int numeroDiVani, int numeroDiBagni) {
        super(codice, indirizzo, cap, city, squaremeters, numeroPersoneInteressate);
        this.numeroDiVani = numeroDiVani;
        this.numeroDiBagni = numeroDiBagni;
    }


    // GETTER AND SETTER

    public int getNumeroDiVani() {
        return numeroDiVani;
    }

    public int getNumeroDiBagni() {
        return numeroDiBagni;
    }


    // METODI


    @Override
    public String toString() {
        return super.toString()+ "\s"+"Abitazione" + "\s" +
                "numeroDiVani=" + "\s" + numeroDiVani + "\s"+
                ", numeroDiBagni=" + "\s" + numeroDiBagni;
    }
}
