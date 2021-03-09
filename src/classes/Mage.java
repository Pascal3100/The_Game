package classes;

public class Mage extends Personnage {

    public int attaqueBasique() {
        System.out.println("Boule de Feu!");
        return this.intelligence;
    };

    public int attaqueSpeciale() {
        System.out.println("Soin...");
        this.vitalite = this.vitalite + this.intelligence * 2;
        if (this.vitalite > 5 * this.niveau) {
            this.vitalite = 5 * this.niveau;
        }
        return 0;
    };
}
