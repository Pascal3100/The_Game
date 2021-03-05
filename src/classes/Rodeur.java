package classes;

import interfaces.Sorts;

public class Rodeur extends Personnage implements Sorts {

    public void attaqueBasique() {
        System.out.println("Tir à l’Arc!");
    };

    public void attaqueSpeciale() {
        System.out.println("Concentration...");
    };
}
