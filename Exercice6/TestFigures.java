package Exercice6;

public class TestFigures {
    public static void main(String[] args) {
        Cercle c = new Cercle("Cercle", 5);
        Rectangle r = new Rectangle("Rectangle", 4, 6);

        c.afficherDetails();
        r.afficherDetails();
    }
}
