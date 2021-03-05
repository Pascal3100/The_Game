package classes;

import interfaces.Sorts;

public class Mage extends Personnage implements Sorts {

    public void attaqueBasique() {
        System.out.println("Boule de Feu!");
    };

    public void attaqueSpeciale() {
        System.out.println("Soin...");
    };


}
