package org.lessons.java.shop;

public class Smartphone extends Prodotto {
    // ATTRIBUTI
    private long imei;
    private int memoria;

    // COSTRUTTORI
    public Smartphone(String nome, String descrizione, double prezzo, int iva, long imei, int memoria) {

        super(nome, descrizione, prezzo, iva);

        this.imei = imei;
        this.memoria = memoria;
    }

    // METODI

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nDescrizione: " + getDescrizione() +
                "\nPrezzo: " + getPrezzo() + "€" +
                "\nIva: " + getIva() + "%" +
                "\nCodice IMEI: " + imei +
                "\nMemoria: " + memoria;
    }
}
