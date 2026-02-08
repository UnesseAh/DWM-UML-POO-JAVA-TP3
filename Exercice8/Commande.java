package Exercice8;

public class Commande {
    private double montantTotal;
    private Paiement moyenDePaiement;

    public Commande(double montantTotal, Paiement moyenDePaiement) {
        this.montantTotal = montantTotal;
        this.moyenDePaiement = moyenDePaiement;
    }

    public void processPayment() {
        moyenDePaiement.effectuerPaiement(montantTotal);
    }
}
