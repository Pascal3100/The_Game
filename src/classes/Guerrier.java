package classes;

import interfaces.Player;

public class Guerrier extends Personnage implements Player {

    public void attaqueBasique() {
        System.out.println("Coup d’Épée!");
    };

    public void attaqueSpeciale() {
        System.out.println("Coup de Rage!");
    };
}
