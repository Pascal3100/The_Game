package classes;

import interfaces.Sorts;

public class Guerrier extends Personnage implements Sorts {

    @overide
    public void attaqueBasique() {
        System.out.println("Coup d’Épée!");

    };

    @overide
    public void attaqueSpeciale() {
        System.out.println("Coup de Rage!");
    };
}
