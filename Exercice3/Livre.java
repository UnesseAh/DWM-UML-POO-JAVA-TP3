package Exercice3;

public class Livre {
    private int isbn;
    private String titre;
    private Auteur auteur;

    public Livre(int isbn, String titre, Auteur auteur) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
    }

    public String toString() {
        return "Livre: " + titre + " | ISBN: " + isbn + " | ecrit par " + auteur.toString();
    }
}
