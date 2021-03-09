package classes;

public class Guerrier extends Personnage {

    public int attaqueBasique() {
        System.out.println("Coup d’Épée!");
        return this.force;
    };

    public int attaqueSpeciale() {
        System.out.println("Coup de Rage!");
        if (this.vitalite == 1) {
            this.receiveDammages(1);
        } else {
            this.receiveDammages(this.force / 2);
        }
        return this.force * 2;
    };
}
