package Exercice7;

public class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable objet) {
        System.out.print(nom + " demande un emprunt: ");
        objet.emprunter();
    }
}
