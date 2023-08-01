package org.Lessons.Java.Agenzia.Immobiliare;

import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        AgenziaImmobiliare agenziaImmobiliare = new AgenziaImmobiliare();

        boolean keepGoing = true;

        while (keepGoing) {

            System.out.println("Vuoi aggiungere un immobile? Y/N");
            String answer = scan.nextLine();

            if(answer.equalsIgnoreCase("y")){
                System.out.println("Vuoi aggiungere un,abitazione una villa o un box? A/V/B");
                String userAnswer = scan.nextLine();

                System.out.println("inserisci il codice");
                String code = scan.nextLine();
                System.out.println("inserisci l'indirizzo");
                String indirizzo = scan.nextLine();
                System.out.println("inserisci il cap");
                int cap = Integer.parseInt(scan.nextLine());
                System.out.println("inserisci la città");
                String city = scan.nextLine();
                System.out.println("inserisci il numero di metri quadri");
                int metriquadri = Integer.parseInt(scan.nextLine());
                System.out.println("inserisci il numero di persone interessate");
                int personeInteressate = Integer.parseInt(scan.nextLine());

                if(userAnswer.equalsIgnoreCase("A")){
                    System.out.println("inserisci numero di vani");
                    int numeroVani = Integer.parseInt(scan.nextLine());
                    System.out.println("inserisci numero di bagni");
                    int numeroBagni = Integer.parseInt(scan.nextLine());
                    Abitazione abitazione = new Abitazione(code,indirizzo,cap,city,metriquadri,personeInteressate, numeroVani,numeroBagni);
                    agenziaImmobiliare.aggiungiImmobile(abitazione);

                } else if (userAnswer.equalsIgnoreCase("V")) {
                    System.out.println("inserisci numero di vani");
                    int numeroVani = Integer.parseInt(scan.nextLine());
                    System.out.println("inserisci numero di bagni");
                    int numeroBagni = Integer.parseInt(scan.nextLine());
                    System.out.println("inserisci metri quadri giardino");
                    int metriQuadriGiardino = Integer.parseInt(scan.nextLine());
                    Villa villa = new Villa(code, indirizzo, cap, city, metriquadri, personeInteressate,numeroVani, numeroBagni, metriQuadriGiardino );
                    agenziaImmobiliare.aggiungiImmobile(villa);


                } else if (userAnswer.equalsIgnoreCase("B")) {
                    System.out.println("Inserisci numero posti auto");
                    int numPostiAuto = Integer.parseInt(scan.nextLine());
                    Box box = new Box(code, indirizzo, cap, city, metriquadri, personeInteressate, numPostiAuto);
                    agenziaImmobiliare.aggiungiImmobile(box);

                } else {
                    System.out.println("scelta non valida prego riprovare");
                }

            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("grazie per essert rivolto a noi, a presto!");
                break;

            } else {
                System.out.println("scelta non valida prego riprovare");

            }

        }

        System.out.println("l'immobile che hai cercato è:" + agenziaImmobiliare.trovaUnImmobileConCodice("re123re"));

        System.out.println("ci sono" + agenziaImmobiliare.contaImmobili() + "immobili");

        System.out.println("l'immobile con maggior interesse è:" + agenziaImmobiliare.maggiorInteresse());



    }
}
