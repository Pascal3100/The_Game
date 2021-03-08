import classes.Personnage;
import classes.Screen;
import interfaces.Player;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        // demarrage du jeu
        Map<Integer, Personnage> dictPlayers = new HashMap<>();
        int character;
        final String[] cars = {"level", "force", "agilite", "intelligence"};
        Map<String, Integer> dictCaracs = new HashMap<>();
        dictCaracs.put("level", 1);
        dictCaracs.put("force", 0);
        dictCaracs.put("agilite", 0);
        dictCaracs.put("intelligence", 0);

        Screen.clearScreen();
        Screen.printCastle();

        // attend que le joueur appuie sur la touche enter
        Screen.getStringInput();

        // lance la phase de creation des personnages
        for (int i = 1; i < 3; i++ ) {
            do {
                Screen.clearScreen();
                Screen.printClouds();
                Screen.showText("--> Player " + i + " select your character");
                Screen.showText("    1 --> Warrior");
                Screen.showText("    2 --> Ranger");
                Screen.showText("    3 --> Mage");
                character = Screen.getIntInput();
            } while (character == 0 || character > 3);

            // Creation du Personnage selon le choix de l'utilisateur
            dictPlayers.put(i,new Personnage());
            dictPlayers.get(i).setPlayerNumber(i);
            dictPlayers.get(i).setCharacter(character);

            // Affectation des propriétés du Personnage selon les choix de l'utilisateur
            Screen.clearScreen();
            Screen.printClouds();
            Screen.showText("(@Player " + i + ") " +"Hello proud " + dictPlayers.get(i).getPlayerType());



        }


    }
}