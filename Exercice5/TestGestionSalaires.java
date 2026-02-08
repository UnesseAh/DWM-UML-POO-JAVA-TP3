package Exercice5;

public class TestGestionSalaires {
    public static void main(String[] args) {
        Ingenieur ing = new Ingenieur("Alami", "Samir", "s.alami@mail.com", "0675356575", 10000,
                "Full Stack Developper");
        Manager mgr = new Manager("Bennani", "Ahmed", "a.bennani@mail.com", "0776859464", 15000, "IT");

        ing.afficherInfos();
        mgr.afficherInfos();
    }
}
