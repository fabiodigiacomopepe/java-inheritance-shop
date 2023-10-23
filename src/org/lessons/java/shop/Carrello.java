package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Chiedo se utente ha carta fedeltà
        boolean userCard = false;
        System.out.println("Si possiede una carta fedeltà?");
        System.out.println("1 - Sì");
        System.out.println("2 - No");
        System.out.print("Seleziona un numero: ");
        String stringCarta = scan.nextLine();
        int booleanCarta = Integer.parseInt(stringCarta);

        // Inizializzo exitCarta a false
        boolean exitCarta = false;
        // Creo ciclo finchè exitCarta non diventa true
        while (!exitCarta) {
            // Se è stato inserito un numero compreso fra 1 e 2, setto exitCarta a true
            if ((booleanCarta > 0) && (booleanCarta < 3)) {
                exitCarta = true;
            } // Altrimenti chiedo di nuovo
            else {
                System.out.println("Inserisci un numero valido.");
                System.out.print("Seleziona un numero: ");
                stringCarta = scan.nextLine();
                booleanCarta = Integer.parseInt(stringCarta);
            }
        }

        // Se numero utente ha carta fedeltà
        if (booleanCarta == 1) {
            userCard = true;
        } // Altrimenti
        else if (booleanCarta == 2) {
            userCard = false;
        }

        System.out.println("Quanti elementi vuoi aggiungere?");
        System.out.print("Inserisci un numero: ");
        String productNumberString = scan.nextLine();
        int productNumber = Integer.parseInt(productNumberString);

        // Inizializzo valore numero prodotti a false
        boolean productNumberValue = false;

        // Creo loop finchè valore numero prodotti non diventa true
        while (!productNumberValue) {
            // Se è stato inserito un numero maggiore di 0, setto valore numero prodotti a true
            if (productNumber > 0) {
                productNumberValue = true;
            } // Altrimenti chiedo di nuovo
            else {
                System.out.println("Inserisci un numero valido.");
                System.out.print("Seleziona un numero: ");
                productNumberString = scan.nextLine();
                productNumber = Integer.parseInt(productNumberString);
            }
        }

        Prodotto[] prodotti = new Prodotto[productNumber];

        for (int i = 0; i < prodotti.length; i++) {
            // Chiedo tipo prodotto a utente
            System.out.println("Che tipo di prodotto stai inserendo?");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Televisore");
            System.out.println("3 - Cuffia");
            System.out.print("Seleziona un numero: ");
            String productTipoString = scan.nextLine();
            int productTipo = Integer.parseInt(productTipoString);

            // Inizializzo numero valido a false
            boolean numeroValido = false;

            // Chiedo nome prodotto a utente
            System.out.print("Inserisci il nome del prodotto: ");
            String productNome = scan.nextLine();

            // Chiedo descrizione prodotto a utente
            System.out.print("Inserisci la descrizione del prodotto: ");
            String productDescrizione = scan.nextLine();

            // Chiedo prezzo prodotto a utente
            System.out.print("Inserisci il prezzo del prodotto: ");
            String productPrezzoString = scan.nextLine();
            double productPrezzo = Double.parseDouble(productPrezzoString);

            // Chiedo iva prodotto a utente
            System.out.print("Inserisci l'iva del prodotto: ");
            String productIvaString = scan.nextLine();
            int productIva = Integer.parseInt(productIvaString);

            // Creo loop finchè numero valido non diventa true
            while (!numeroValido) {
                // Se è stato inserito un numero compreso fra 1 e 3, setto numero valido a true
                if ((productTipo > 0) && (productTipo < 4)) {
                    numeroValido = true;
                } // Altrimenti chiedo di nuovo
                else {
                    System.out.println("Inserisci un numero valido.");
                    System.out.print("Seleziona un numero: ");
                    productTipoString = scan.nextLine();
                    productTipo = Integer.parseInt(productTipoString);
                }
            }

            // Se tipo di prodotto è uguale a 1, allora SMARTPHONE
            if (productTipo == 1) {
                // Chiedo IMEI
                System.out.print("Inserisci codice IMEI: ");
                String stringImei = scan.nextLine();
                long productImei = Long.parseLong(stringImei);

                // Chiedo taglio memoria in GB
                System.out.print("Inserisci taglio memoria (GB): ");
                String stringMemoria = scan.nextLine();
                int productMemoria = Integer.parseInt(stringMemoria);
                double prezzoFinale = productPrezzo;

                if (userCard) {
                    prezzoFinale = 0;
                    if (productMemoria < 32) {
                        double sconto = (productPrezzo / 100) * 5;
                        prezzoFinale = productPrezzo - sconto;
                    } else {
                        double sconto = (productPrezzo / 100) * 2;
                        prezzoFinale = productPrezzo - sconto;
                    }
                }

                // Creo un nuovo oggetto smartphone
                Smartphone smartphone = new Smartphone(productNome, productDescrizione, prezzoFinale, productIva, productImei, productMemoria);
                prodotti[i] = smartphone;
            }  // Se tipo di prodotto è uguale a 2, allora TELEVISORE
            else if (productTipo == 2) {
                // Chiedo altezza
                System.out.print("Inserisci altezza: ");
                String stringAltezza = scan.nextLine();
                double productAltezza = Double.parseDouble(stringAltezza);

                // Chiedo larghezza
                System.out.print("Inserisci larghezza: ");
                String stringLarghezza = scan.nextLine();
                double productLarghezza = Double.parseDouble(stringLarghezza);

                // Chiedo se la TV è smart
                boolean productSmart = false;
                System.out.println("La TV è smart?");
                System.out.println("1 - Sì");
                System.out.println("2 - No");
                System.out.print("Seleziona un numero: ");
                String stringSmart = scan.nextLine();
                int booleanSmart = Integer.parseInt(stringSmart);
                // Inizializzo numero inserito da utente a false
                boolean numeroTVValido = false;
                // Creo ciclo finchè numero inserito da utente a false non diventa true
                while (!numeroTVValido) {
                    // Se è stato inserito un numero compreso fra 1 e 2, setto numero inserito da utente a true
                    if ((booleanSmart > 0) && (booleanSmart < 3)) {
                        numeroTVValido = true;
                    } // Altrimenti chiedo di nuovo
                    else {
                        System.out.println("Inserisci un numero valido.");
                        System.out.print("Seleziona un numero: ");
                        stringSmart = scan.nextLine();
                        booleanSmart = Integer.parseInt(stringSmart);
                    }
                }
                // Se numero inserito da utente è true
                if (booleanSmart == 1) {
                    productSmart = true;
                } // Altrimenti
                else if (booleanSmart == 2) {
                    productSmart = false;
                }

                double prezzoFinale = productPrezzo;
                if (userCard) {
                    prezzoFinale = 0;
                    if (!productSmart) {
                        double sconto = (productPrezzo / 100) * 10;
                        prezzoFinale = productPrezzo - sconto;
                    } else {
                        double sconto = (productPrezzo / 100) * 2;
                        prezzoFinale = productPrezzo - sconto;
                    }
                }

                // Creo un nuovo oggetto televisore
                Televisore televisore = new Televisore(productNome, productDescrizione, prezzoFinale, productIva, productAltezza, productLarghezza, productSmart);
                prodotti[i] = televisore;
            }  // Se tipo di prodotto è uguale a 3, allora CUFFIA
            else if (productTipo == 3) {
                // Chiedo colore
                System.out.print("Inserisci colore: ");
                String productColore = scan.nextLine();
                boolean productWireless = false;
                System.out.println("La cuffia è wireless o calbata?");
                System.out.println("1 - Wireless");
                System.out.println("2 - Cablata");
                System.out.print("Seleziona un numero: ");
                String stringWireless = scan.nextLine();
                int booleanWireless = Integer.parseInt(stringWireless);
                // Inizializzo numero inserito da utente a false
                boolean numeroCuffiaValido = false;
                // Creo ciclo finchè numero inserito da utente a false non diventa true
                while (!numeroCuffiaValido) {
                    // Se è stato inserito un numero compreso fra 1 e 2, setto numero inserito da utente a true
                    if ((booleanWireless > 0) && (booleanWireless < 3)) {
                        numeroCuffiaValido = true;
                    } // Altrimenti chiedo di nuovo
                    else {
                        System.out.println("Inserisci un numero valido.");
                        System.out.print("Seleziona un numero: ");
                        stringWireless = scan.nextLine();
                        booleanWireless = Integer.parseInt(stringWireless);
                    }
                }
                // Se numero inserito da utente è true
                if (booleanWireless == 1) {
                    productWireless = true;
                } // Altrimenti
                else if (booleanWireless == 2) {
                    productWireless = false;
                }

                double prezzoFinale = productPrezzo;
                if (userCard) {
                    prezzoFinale = 0;
                    if (!productWireless) {
                        double sconto = (productPrezzo / 100) * 7;
                        prezzoFinale = productPrezzo - sconto;
                    } else {
                        double sconto = (productPrezzo / 100) * 2;
                        prezzoFinale = productPrezzo - sconto;
                    }
                }

                // Creo un nuovo oggetto cuffia
                Cuffia cuffia = new Cuffia(productNome, productDescrizione, prezzoFinale, productIva, productColore, productWireless);
                prodotti[i] = cuffia;
            }
        }

        // Chiudo lo scanner da tastiera
        scan.close();

        // Inizializzo somma a 0
        double sommaPrezzo = 0;
        // System.out.println(prodotti);

        //Stampo info ogni prodotto
        for (int i = 0; i < prodotti.length; i++) {
            System.out.println(prodotti[i]);
            double prezzoProdotto = prodotti[i].getPrezzoConIva();
            System.out.println("-------------");
            sommaPrezzo += prezzoProdotto;
        }

        // Stampo somma totale
        System.out.println("Prezzo finale: " + String.format("%.2f", sommaPrezzo) + "€");
    }
}
