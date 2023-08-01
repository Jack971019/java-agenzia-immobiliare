package org.Lessons.Java.Agenzia.Immobiliare;

public class Villa extends Abitazione {

    // ATTRIBUTI

    private int metriQuadriGiardino;


    // COSTRUTTORI

    public Villa(String codice, String indirizzo, int cap, String city, int squaremeters, int numeroPersoneInteressate, int numeroDiVani, int numeroDiBagni, int metriQuadriGiardino) {
        super(codice, indirizzo, cap, city, squaremeters, numeroPersoneInteressate, numeroDiVani, numeroDiBagni);
        this.metriQuadriGiardino = metriQuadriGiardino;
    }


    // GETTER AND SETTER

    public int getMetriQuadriGiardino() {
        return metriQuadriGiardino;
    }



    // METODI

    @Override
    public String toString() {
        return super.toString()+"Villa{" +
                "metriQuadriGiardino=" + metriQuadriGiardino +
                '}';
    }


    // aggiungere l'overload del metodo per aggiungere superfici dell classe immibili
}
