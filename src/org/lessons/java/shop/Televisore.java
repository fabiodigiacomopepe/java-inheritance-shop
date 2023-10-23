package org.lessons.java.shop;

public class Televisore extends Prodotto {
    // ATTRIBUTI
    private double altezza;
    private double larghezza;
    private boolean smart;

    // COSTRUTTORI
    public Televisore(String nome, String descrizione, double prezzo, int iva, double altezza, double larghezza, boolean smart) {

        super(nome, descrizione, prezzo, iva);

        this.altezza = altezza;
        this.larghezza = larghezza;
        this.smart = smart;
    }

    // METODI
    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public boolean getSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        String smartString = smart ? "Sì" : "No";  // Se smart è true, smartString sarà "si", altrimenti sarà "no"

        return "Nome: " + getNome() +
                "\nDescrizione: " + getDescrizione() +
                "\nPrezzo: " + getPrezzo() + "€" +
                "\nIva: " + getIva() + "%" +
                "\nAltezza: " + altezza +
                "\nLarghezza: " + larghezza +
                "\nSmart: " + smartString;
    }
}
