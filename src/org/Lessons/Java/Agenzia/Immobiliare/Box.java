package org.Lessons.Java.Agenzia.Immobiliare;

public class Box extends Immobili {

    // ATTRIBUTI

    private int numPostiAuto;


    // COSTRUTTORI

    public Box(String codice, String indirizzo, int cap, String city, int squaremeters, int numPostiAuto) {
        super(codice, indirizzo, cap, city, squaremeters);
        this.numPostiAuto = numPostiAuto;
    }


    // GETTER AND SETTER

    // METODI


}
