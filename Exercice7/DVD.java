package Exercice7;

public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean estEmprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.estEmprunte = false;
    }

    @Override
    public void emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println("DVD '" + titre + "' a ete emprunte.");
        } else {
            System.out.println("Le DVD est deja emprunte.");
        }
    }

    @Override
    public void retourner() {
        estEmprunte = false;
        System.out.println("DVD '" + titre + "' a ete retourne.");
    }
}
