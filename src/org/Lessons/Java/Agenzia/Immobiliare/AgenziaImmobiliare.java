package org.Lessons.Java.Agenzia.Immobiliare;

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {

    // ATTRIBUTI

    private List<Immobili> listaImmobili;

    // COSTRUTTORI

    public AgenziaImmobiliare(){
        listaImmobili = new ArrayList<>();
    }


    // GETTER AND SETTER

    // METODI

    // aggiungere un immobile alla lista
    public  void aggiungiImmobile(Immobili immobili){
        listaImmobili.add(immobili);
    }

    // riceracre un immobile tramite il codice alfanumerico

    public Immobili trovaUnImmobileConCodice (String codice){
        boolean trovato = false;
        int contatore = 0;
        Immobili immobileCercato = null;
        while (!trovato && contatore < listaImmobili.size()){
            if (codice.equals(listaImmobili.get(contatore).getCodice())){
                immobileCercato = listaImmobili.get(contatore);
                trovato = true;
            }
            contatore ++;
        }
        return immobileCercato;
    }

    // metodo per contare tutti gli immobili


    public int contaImmobili(){
        int count = 0;
        for(Immobili immobili : listaImmobili){
            count ++;
        }
        return count;
    }



    // metodo per restituire l'immobile che ha avuto il maggior numero di persone interessate
}
