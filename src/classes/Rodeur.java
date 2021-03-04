package classes;

import interfaces.Sorts;

public class Rodeur extends Personnage implements Sorts {

    @overide
    public void attaqueBasique() {
        System.out.println("Tir à l’Arc!");

    };

    @overide
    public void attaqueSpeciale() {
        System.out.println("Concentration...");
    };
}
