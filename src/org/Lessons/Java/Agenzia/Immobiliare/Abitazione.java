package org.Lessons.Java.Agenzia.Immobiliare;

public class Abitazione extends Immobili{

    // ATTRIBUTI

    private int numeroDiVani;

    private int numeroDiBagni;

    // COSTRUTTORI

    public Abitazione(String codice, String indirizzo, int cap, String city, int squaremeters, int numeroDiVani, int numeroDiBagni) {
        super(codice, indirizzo, cap, city, squaremeters);
        this.numeroDiVani = numeroDiVani;
        this.numeroDiBagni = numeroDiBagni;
    }


    // GETTER AND SETTER

    // METODI
}
