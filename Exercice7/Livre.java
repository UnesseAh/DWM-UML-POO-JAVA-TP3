package Exercice7;

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean estEmprunte;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.estEmprunte = false;
    }

    @Override
    public void emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println("Livre '" + titre + "' a ete emprunte.");
        } else {
            System.out.println("Le livre est deja emprunte.");
        }
    }

    @Override
    public void retourner() {
        estEmprunte = false;
        System.out.println("Livre '" + titre + "' a ete retourne.");
    }
}
