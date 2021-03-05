package classes;

import interfaces.Sorts;

public class Guerrier extends Personnage implements Sorts {

    public void attaqueBasique() {
        System.out.println("Coup d’Épée!");
    };

    public void attaqueSpeciale() {
        System.out.println("Coup de Rage!");
    };
}
