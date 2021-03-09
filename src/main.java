import classes.*;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        // demarrage du jeu
        Personnage player;
        Map<Integer, Personnage> dictPlayers = new HashMap<>();
        int character;
        final String[] caracs = {"level", "force", "agilite", "intelligence"};
        final int[] minMaxLevel = {1,100};
        final int[] minMaxOthers = {0,100};
        Map<String, int[]> dictCaracsMinMax = new HashMap<>();
        Map<String, Integer> dictCaracs = new HashMap<>();

        dictCaracs.put("level", 1);
        dictCaracs.put("force", 0);
        dictCaracs.put("agilite", 0);
        dictCaracs.put("intelligence", 0);

        dictCaracsMinMax.put("level", minMaxLevel);
        dictCaracsMinMax.put("force", minMaxOthers);
        dictCaracsMinMax.put("agilite", minMaxOthers);
        dictCaracsMinMax.put("intelligence", minMaxOthers);

        Screen.clearScreen();
        Screen.printCastle();

        // attend que le joueur appuie sur la touche enter
        Screen.getStringInput();

        // lance la phase de creation des personnages
        for (int i = 1; i < 3; i++ ) {
            // initialisation
            player = null;
            dictCaracs.put("level", 1);
            dictCaracs.put("force", 0);
            dictCaracs.put("agilite", 0);
            dictCaracs.put("intelligence", 0);

            do {
                Screen.clearScreen();
                Screen.printClouds();
                Screen.showText("--> Player " + i + " select your character");
                Screen.showText("    1 --> Warrior");
                Screen.showText("    2 --> Ranger");
                Screen.showText("    3 --> Mage");
                character = Screen.getIntInput();
            } while (character == 0 || character > 3);

            // creation du personnage selon la classe choisi par le joueur
            switch (character) {
                case 1 :
                    player = new Guerrier();
                    player.setPlayerType("Warrior");
                    break;
                case 2 :
                    player = new Rodeur();
                    player.setPlayerType("Ranger");
                    break;
                case 3 :
                    player = new Mage();
                    player.setPlayerType("Mage");
                    break;
            }

            dictPlayers.put(i, player);
            player.setPlayerNumber(i);
            Screen.clearScreen();
            Screen.printClouds();
            Screen.showText(player.getNom() + "Hello proud " + player.getPlayerType() + "! Please set your skills.");

            // Set du level
            Screen.showText(player.getResume());
            Screen.showTextNoReturn("");
            do {
                Screen.UpdateTextNoRetun("   -- Please enter your " + caracs[0] + " (" + dictCaracsMinMax.get(caracs[0])[0] + "-" + dictCaracsMinMax.get(caracs[0])[1] + ") :");
                dictCaracs.put(caracs[0], Screen.getIntInput());
            } while (dictCaracs.get(caracs[0]) < dictCaracsMinMax.get(caracs[0])[0] || dictCaracs.get(caracs[0]) > dictCaracsMinMax.get(caracs[0])[1]);
            player.setNiveau(dictCaracs.get(caracs[0]));

            Screen.clearScreen();
            Screen.printClouds();
            Screen.showText(player.getNom() + "Hello proud " + player.getPlayerType() + "! Please set your skills.");
            Screen.showText(player.getResume());
            Screen.showTextNoReturn("");

            // Set des caractéristiques
            for (int j = 1; j < caracs.length; j++) {
                do {
                    Screen.UpdateTextNoRetun("   -- Please enter your " + caracs[j] + " (" + dictCaracsMinMax.get(caracs[j])[0] + "-" + player.getLeftPoints() + ") : ");
                    dictCaracs.put(caracs[j], Screen.getIntInput());
                } while (dictCaracs.get(caracs[j]) < dictCaracsMinMax.get(caracs[j])[0] || dictCaracs.get(caracs[j]) > player.getLeftPoints());
                switch (caracs[j]) {
                    case "force":
                        player.setForce(dictCaracs.get(caracs[j]));
                        break;
                    case "intelligence":
                        player.setIntelligence(dictCaracs.get(caracs[j]));
                        break;
                    case "agilite":
                        player.setAgilite(dictCaracs.get(caracs[j]));
                        break;
                }

                // Condition de sortie prématurée (le joueur met tous ses points dans une seule caractéristique
                if (player.getLeftPoints() == 0) {
                    break;
                }
            }
            // Lancement de la bataille!
            Screen.clearScreen();
            Screen.printSwords();


        }


    }
}