package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    // COSTRUTTORI
    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        // Assegno ai miei attributi il valore dei parametri in ingresso del costruttore
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

        // Creo numero random e lo assegno al codice
        Random randomGenerator = new Random();
        this.codice = randomGenerator.nextInt(0, 99999); // origin compreso, bound escluso
    }

    // METODI

    // Codice
    public int getCodice() {
        return codice;
    }

    // Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Codice + Nome
    public String getCodiceNome() {
        return codice + "-" + nome;
    }

    // Descrizione
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    // Prezzo
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    // Prezzo con Iva inclusa
    public double getPrezzoConIva() {
        return prezzo + ((prezzo * iva)/100);
    }

    // Iva
    public int getIva() {
        return iva;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }

    // Codice con pad left di 0 per arrivare a 8 caratteri
    public String getCodiceWithPad() {
        String codiceString = String.valueOf(codice);
        String paddedCodice = String.format("%08d", codice);
        return paddedCodice;
    }
}
