package Exercice7;

public class GestionBibliothequeApp {
    public static void main(String[] args) {
        Livre l1 = new Livre("Livre", "auteur");
        DVD d1 = new DVD("Movie", "realisateur");
        Utilisateur user = new Utilisateur("Alice");

        user.emprunterObjet(l1);
        user.emprunterObjet(d1);

        l1.retourner();
    }
}
