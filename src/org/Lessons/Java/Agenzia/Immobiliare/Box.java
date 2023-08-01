package org.Lessons.Java.Agenzia.Immobiliare;

public class Box extends Immobili {

    // ATTRIBUTI

    private int numPostiAuto;


    // COSTRUTTORI

    public Box(String codice, String indirizzo, int cap, String city, int squaremeters, int numeroPersoneInteressate, int numPostiAuto) {
        super(codice, indirizzo, cap, city, squaremeters, numeroPersoneInteressate);
        this.numPostiAuto = numPostiAuto;
    }


    // GETTER AND SETTER

    public int getNumPostiAuto() {
        return numPostiAuto;
    }


    // METODI


    @Override
    public String toString() {
        return super.toString()+"Box" +
                "numPostiAuto=" + numPostiAuto;
    }
}
