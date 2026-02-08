package Exercice8;

public abstract class Paiement {
    protected double montant;
    protected int numeroTransaction;

    public Paiement(double montant, int numeroTransaction) {
        this.montant = montant;
        this.numeroTransaction = numeroTransaction;
    }

    public abstract void effectuerPaiement(double montant);
}
