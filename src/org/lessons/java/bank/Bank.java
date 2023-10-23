package org.lessons.java.bank;

import org.lessons.java.shop.Prodotto;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Chiedo nome a utente
        System.out.print("Inserisci il tuo nome: ");
        String userName = scan.nextLine();

        // Creo un conto e passo il nome
        Conto conto1 = new Conto("userName");

        // Inizializzo scelta utente uguale a 0
        int userChoice = 0;

        // Creo loop finchè scelta utente è uguale a 0
        while (userChoice == 0) {
            // Setto un flag di exit uguale a false
            boolean exit = false;

            // Creo loop finchè l'utente non esce
            while (!exit) {
                // Chiedo a utente cosa vuole fare
                System.out.println("Cosa vuoi fare?");
                System.out.println("1 - Versare");
                System.out.println("2 - Prelevare");
                System.out.println("3 - Uscire");
                System.out.print("Scegli un numero: ");
                String userChoiceString = scan.nextLine();
                // Cambio valore di userChoice
                userChoice = Integer.parseInt(userChoiceString);

                // Se l'utente seleziona 1
                if (userChoice == 1) {
                    // Chiedo importo
                    System.out.println("Quanti soldi vuoi versare?");
                    System.out.print("Scegli un importo: ");
                    String userChoiceImportString = scan.nextLine();
                    int userChoiceImport = Integer.parseInt(userChoiceImportString);
                    // Eseguo operazione
                    conto1.versaSoldi(userChoiceImport);
                    // Stampo nuovo
                    System.out.println("Il tuo nuovo saldo è:");
                    System.out.println(conto1.getSaldo());
                    System.out.println("---------------");
                    // Reimposto userChoice a 0 per ripetere loop
                    userChoice = 0;
                } // Se l'utente seleziona 2
                else if (userChoice == 2) {
                    // Leggo saldo attuale (1)
                    double saldoAttuale = conto1.getSaldo();
                    // Chiedo importo
                    System.out.println("Quanti soldi vuoi prelevare?");
                    System.out.print("Scegli un importo: ");
                    String userChoice1ImportString = scan.nextLine();
                    int userChoice1Import = Integer.parseInt(userChoice1ImportString);
                    // Se importo inserito è minore/uguale a 0
                    if (userChoice1Import <= 0) {
                        // Restituisco errore
                        System.out.println("Inserire un numero valido");
                    } else {
                        // Altrimenti eseguo operazione
                        conto1.prelevaSoldi(userChoice1Import);
                    }
                    // Leggo saldo attuale (2)
                    double saldoDopoPrelievo = conto1.getSaldo();
                    // Se saldo attuale (1) è uguale a saldo attuale (2) - quindi non è cambiato
                    // C'è un errore: o si è inserito come valore 0 o si è andati sotto zero.
                    if (saldoAttuale == saldoDopoPrelievo) {
                        System.out.println("Errore.");
                        System.out.println("Il tuo nuovo saldo è:");
                        System.out.println(saldoDopoPrelievo);
                    } // Altrimenti stampo valore del saldo attuale (2)
                    else {
                        System.out.println("Il tuo nuovo saldo è:");
                        System.out.println(saldoDopoPrelievo);
                    }
                    System.out.println("---------------");
                    // Reimposto userChoice a 0 per ripetere loop
                    userChoice = 0;
                } // Se l'utente seleziona 3
                else if (userChoice == 3) {
                    // Stampo messaggio e segno flag a true per uscire dal loop
                    System.out.println("Sei uscito corretamente.");
                    exit = true;
                }
            }
        }

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}
