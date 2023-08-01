package org.Lessons.Java.Agenzia.Immobiliare;

public class Immobili {

    // ATTRIBUTI
    private String codice;
    private String indirizzo;
    private int cap;
    private String city;
    private int squaremeters;

    // COSTRUTTORI

    public Immobili(String codice, String indirizzo, int cap, String city, int squaremeters) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.city = city;
        this.squaremeters = squaremeters;
    }


    // GETTER AND SETTER

    public String getCodice() {
        return codice;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getCap() {
        return cap;
    }

    public String getCity() {
        return city;
    }

    public int getSquaremeters() {
        return squaremeters;
    }


    // METODI

}
