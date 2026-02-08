package Exercice3;

public class TestBibliothequeApp {
    public static void main(String[] args) {
        Adherent ad = new Adherent("AHASLA", "Youness", "youness.ahasla@mail.com", "0682937569", 27, 101);
        Auteur aut = new Auteur("Naguib", "Mahfouz", "Naguib.Mahfouz@gmail.com", "0756474536", 70, 501);
        Livre livre = new Livre(12345, "The Cairo Trilogy ", aut);

        System.out.println(ad.toString());
        System.out.println(livre.toString());
    }
}
