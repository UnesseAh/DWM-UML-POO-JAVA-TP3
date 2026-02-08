package Exercice2;

public class TestMachine {
    public static void main(String[] args) {
        MachineProduction.setPlafondProduction(100);

        MachineProduction m1 = new MachineProduction();
        MachineProduction m2 = new MachineProduction();

        m1.produire(30);
        m2.produire(50);
        m1.produire(40);

        System.out.println("Total produits : " + MachineProduction.getTotalProduits());
    }
}
