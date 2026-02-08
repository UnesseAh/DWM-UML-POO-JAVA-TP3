package Exercice8;

public class CarteCredit extends Paiement {
    private String numeroCarte;

    public CarteCredit(double montant, int numeroTransaction, String numeroCarte) {
        super(montant, numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " effectue par Carte de Credit No: " + numeroCarte);
    }
}
