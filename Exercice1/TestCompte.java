package Exercice1;

public class TestCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte();
        c1.setNumero("C100");
        c1.deposer(5000);

        Compte c2 = new Compte();
        c2.setNumero("C200");
        c2.deposer(2000);
        c2.retirer(3000);

        c1.afficherCompteInfo();
        c2.afficherCompteInfo();

        Compte.afficherNbComptes();
    }
}