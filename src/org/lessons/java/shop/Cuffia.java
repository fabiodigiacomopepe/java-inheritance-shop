package org.lessons.java.shop;

public class Cuffia extends Prodotto {
    // ATTRIBUTI
    private String colore;
    private boolean wireless;

    // COSTRUTTORI
    public Cuffia(String nome, String descrizione, double prezzo, int iva, String colore, boolean wireless) {

        super(nome, descrizione, prezzo, iva);

        this.colore = colore;
        this.wireless = wireless;
    }

    // METODI
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        String wirelessString = wireless ? "Wireless" : "Cablata";  // Se wireless è true, wirelessString sarà "Wireless", altrimenti sarà "Cablata"

        return "Nome: " + getNome() +
                "\nDescrizione: " + getDescrizione() +
                "\nPrezzo: " + getPrezzo() + "€" +
                "\nIva: " + getIva() + "%" +
                "\nColore: " + colore +
                "\nTipologia: " + wirelessString;
    }
}
