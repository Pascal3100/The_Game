package classes;

import java.util.Scanner;

public class Screen {
    // Create a Scanner object
    private static Scanner scan = new Scanner(System.in);

    // Efface l'ecran
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Affiche du texte à l'écran
    public static void showText(String textInput) {
        System.out.println(textInput);
    }

    // Récupère un input de type int au clavier
    public static int getIntInput() {
        try {
            return scan.nextInt();
        } catch (Exception e) {
            return 0;
        }
    }

    // Récupère un input de type string au clavier
    public static String getStringInput() {
        try {
            return scan.nextLine();
        } catch (Exception e) {
            return "";
        }
    }

    // Affiche le chateau
    public static void printCastle() {
        showText("                                  |>>>");
        showText("                                  |");
        showText("                    |>>>      _  _|_  _         |>>>");
        showText("                    |        |;| |;| |;|        |");
        showText("                _  _|_  _    \\\\.    .  /    _  _|_  _");
        showText("               |;|_|;|_|;|    \\\\:. ,  /    |;|_|;|_|;|");
        showText("               \\\\..      /    ||;   . |    \\\\.    .  /");
        showText("                \\\\.  ,  /     ||:  .  |     \\\\:  .  /");
        showText("                 ||:   |_   _ ||_ . _ | _   _||:   |");
        showText("                 ||:  .|||_|;|_|;|_|;|_|;|_|;||:.  |");
        showText("                 ||:   ||.    .     .      . ||:  .|");
        showText("                 ||: . || .     . .   .  ,   ||:   |       \\,/");
        showText("                 ||:   ||:  ,  _______   .   ||: , |            /`\\");
        showText("                 ||:   || .   /+++++++\\\\    . ||:   |");
        showText("                 ||:   ||.    |+++++++| .    ||: . |");
        showText("              __ ||: . ||: ,  |+++++++|.  . _||_   |");
        showText("     ____--`~    '--~~__|.    |+++++__|----~    ~`---,              ___");
        showText("-~--~                   ~---__|,--~'                  ~~----_____-~'   `~----~~");
        showText("                        The Gnome Castle Game");
        showText("");
        showText("                        Press Enter to start!");
        showText("");
    }

    // Affiche les nuages
    public static void printClouds() {
        showText("                _                                  ");
        showText("              (`  ).                   _           ");
        showText("             (     ).              .:(`  )`.       ");
        showText(")           _(       '`.          :(   .    )      ");
        showText("        .=(`(      .   )     .--  `.  (    ) )      ");
        showText("       ((    (..__.:'-'   .+(   )   ` _`  ) )                 ");
        showText("`.     `(       ) )       (   .  )     (   )  ._   ");
        showText("  )      ` __.:'   )     (   (   ))     `-'.-(`  ) ");
        showText(")  )  ( )       --'       `- __.'         :(      )) ");
        showText(".-'  (_.'          .')                    `(    )  ))");
        showText("                  (_  )                     ` __.:'          ");
        showText("");
    }
}