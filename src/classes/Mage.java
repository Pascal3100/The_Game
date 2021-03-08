package classes;

import interfaces.Player;

public class Mage extends Personnage implements Player {

    public void attaqueBasique() {
        System.out.println("Boule de Feu!");
    };

    public void attaqueSpeciale() {
        System.out.println("Soin...");
    };


}
