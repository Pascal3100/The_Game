import classes.Screen;

class Main {
    public static void main(String[] args) {
        // demarrage du jeu
        Screen.clearScreen();
        Screen.printCastle();

        // attend que le joueur appuie sur la touche enter
        Screen.getStringInput();

        // lance la phase de creation des personnages

        for (int i = 1; i < 3; i++ ) {
            int character;
            do {
                Screen.clearScreen();
                Screen.printClouds();
                Screen.showText("--> Player " + i + " select your character");
                Screen.showText("    1 --> Warrior");
                Screen.showText("    2 --> Ranger");
                Screen.showText("    3 --> Mage");
                character = Screen.getIntInput();
            } while (character == 0 || character > 3);

        }


    }
}