package Exercice4;

public class TestVehicules {
    public static void main(String[] args) {
        Voiture v = new Voiture("Dacia", 150000, "Logan", 2020);
        Moto m = new Moto("Docker", 80000, "C90", 200);
        Avion a = new Avion("Ryanair", 100000000, "Royal Air Maroc", 900);

        v.emettreSon();
        v.afficherInformations();

        m.emettreSon();
        m.afficherInformations();

        a.emettreSon();
        a.afficherInformations();
    }
}
