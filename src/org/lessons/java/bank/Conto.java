package org.lessons.java.bank;

import java.util.Random;

public class Conto {

    // ATTRIBUTI
    private int numero;
    private String nome;
    private double saldo;

    // COSTRUTTORI
    public Conto(String nome) {
        // Setto valore saldo a 0 e assegno nome
        this.saldo = 0;
        this.nome = nome;

        // Creo numero random e lo assegno al codice
        Random randomGenerator = new Random();
        this.numero = randomGenerator.nextInt(1, 1001); // origin compreso, bound escluso
    }

    // METODI

    // Numero
    public int getNumero() {
        return numero;
    }

    // Nome
    public String getProprietario() {
        return nome;
    }
    public void setProprietario(String nome) {
        this.nome = nome;
    }

    // Saldo
    public double getSaldo() {
        return saldo;
    }

    public void versaSoldi(double soldiDaVersare) {
        // Aggiungo somma da versare al saldo
        saldo += soldiDaVersare;
    }

    public double prelevaSoldi(double soldiDaPrelevare) {
        // Sottraggo al saldo i soldi da prelevare
        saldo -= soldiDaPrelevare;
        // Se il saldo va sotto 0, lo ripristino
        if (saldo < 0) {
           saldo += soldiDaPrelevare;
        }
        // ritorno il saldo
        return saldo;
    }
}
