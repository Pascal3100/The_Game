package classes;

public class Rodeur extends Personnage {

    public int attaqueBasique() {
        System.out.println("Tir à l’Arc!");
        return this.agilite;
    };

    public int attaqueSpeciale() {
        System.out.println("Concentration...");
        this.agilite = this.agilite + this.niveau / 2;
        return 0;
    };
}
