package Exercice3;

public class Personne {
    protected String nom;
    protected String prenom;
    protected String email;
    protected String tel;
    protected int age;

    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String toString() {
        return nom + " " + prenom + " " + email;
    }
}
