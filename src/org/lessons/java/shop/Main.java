package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        // Creo 3 prodotti
        Prodotto prodotto1 = new Prodotto("Latte", "Pregiatissimo latte parzialmente scremato.", 1.50, 4);
        Prodotto prodotto2 = new Prodotto("Pasta", "Buonissima pasta corta rigata", 2.10, 4);
        Prodotto prodotto3 = new Prodotto("Mestolo", "Bellissimo mestolo in acciao inox", 3.50, 22);

        // Stampo Codice-Nome e Prezzo con Iva del prodotto 1
        System.out.println(prodotto1.getCodiceNome());
        System.out.println(prodotto1.getPrezzoConIva());
        System.out.println(prodotto1.getCodiceWithPad());

        // Stampo Codice-Nome e Prezzo con Iva del prodotto 2
        System.out.println(prodotto2.getCodiceNome());
        System.out.println(prodotto2.getPrezzoConIva());
        System.out.println(prodotto2.getCodiceWithPad());

        // Stampo Codice-Nome e Prezzo con Iva del prodotto 3
        System.out.println(prodotto3.getCodiceNome());
        System.out.println(prodotto3.getPrezzoConIva());
        System.out.println(prodotto3.getCodiceWithPad());
    }
}
