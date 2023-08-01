package org.Lessons.Java.Agenzia.Immobiliare;

public class Immobili {

    // ATTRIBUTI
    private String codice;
    private String indirizzo;
    private int cap;
    private String city;
    private int squaremeters;

    private int numeroPersoneInteressate;

    // COSTRUTTORI

    public Immobili(String codice, String indirizzo, int cap, String city, int squaremeters, int numeroPersoneInteressate) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.city = city;
        this.squaremeters = squaremeters;
        this.numeroPersoneInteressate = numeroPersoneInteressate;
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


    @Override
    public String toString() {
        return "Immobili{" +
                "codice='" + codice + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap=" + cap +
                ", city='" + city + '\'' +
                ", squaremeters=" + squaremeters +
                '}';
    }

    // aggiungere il metodo reimposta superfici

    // aggiungere il metodo per incremenatre il numero dell persone interessate

}
