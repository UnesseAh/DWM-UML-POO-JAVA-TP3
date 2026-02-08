package Exercice2;

public class MachineProduction {
    private int id;
    private int nombreProduits;

    private static int prochainId = 1;
    private static int totalProduits = 0;
    private static int plafondProduction = 0;

    public MachineProduction() {
        this.id = prochainId++;
        this.nombreProduits = 0;
    }

    public static void setPlafondProduction(int plafond) {
        plafondProduction = plafond;
    }

    public boolean produire(int quantite) {
        if (totalProduits + quantite <= plafondProduction) {
            this.nombreProduits += quantite;
            totalProduits += quantite;
            System.out.println("Machine " + id + " a produit " + quantite + " objets.");
            return true;
        } else {
            System.out.println("Plafond de production atteint pour la machine " + id);
            return false;
        }
    }

    public static int getTotalProduits() {
        return totalProduits;
    }
}
