package Exercice8;

public class GestionPaiementApp {
    public static void main(String[] args) {
        Paiement carte = new CarteCredit(0, 101, "123456789012");
        Commande cmd1 = new Commande(500.0, carte);

        Paiement paypal = new PayPal(0, 102, "youness.ahasla@gmail.com");
        Commande cmd2 = new Commande(200.0, paypal);

        cmd1.processPayment();
        cmd2.processPayment();
    }
}
