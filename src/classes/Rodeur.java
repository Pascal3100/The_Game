package classes;

import interfaces.Player;

public class Rodeur extends Personnage implements Player {

    public void attaqueBasique() {
        System.out.println("Tir à l’Arc!");
    };

    public void attaqueSpeciale() {
        System.out.println("Concentration...");
    };
}
