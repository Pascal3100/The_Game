package classes;

import interfaces.Sorts;

public class Mage extends Personnage implements Sorts {

    @overide
    public void attaqueBasique() {
        System.out.println("Boule de Feu!");

    };

    @overide
    public void attaqueSpeciale() {
        System.out.println("Soin...");
    };


}
