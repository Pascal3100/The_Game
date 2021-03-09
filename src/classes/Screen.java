package classes;

import java.io.IOException;
import java.util.Scanner;

public class Screen {
    // Create a Scanner object
    private static Scanner scan = new Scanner(System.in);

    // Efface l'ecran
    public static void clearScreen() {
        for (int i = 0; i < 40; i++) {
            System.out.println("\b");
        }
    }

    // Affiche du texte à l'écran
    public static void showText(String textInput) {
        System.out.println(textInput);
    }

    // Affiche du texte à l'écran sans retour à la ligne
    public static void showTextNoReturn(String textInput) {
        System.out.print(textInput);
    }

    // Mise à jour de la ligne courante
    public static void UpdateTextNoRetun(String textInput) {
        System.out.print("\r");
        System.out.print(textInput);
        System.out.flush();
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

    // Affiche les nuages
    public static void printSwords() {
        showText("           /\\                                                 /\\");
        showText(" _         )( ______________________   ______________________ )(         _");
        showText("(_)///////(**)______________________> <______________________(**)\\\\\\\\\\\\\\(_)");
        showText("           )(                                                 )(");
        showText("           \\/                                                 \\/");
        showText("");
    }

    // Affiche les nuages
    public static void printWinFrame() {
        showText("      _,.");
        showText("    ,` -.)");
        showText("   ( _/-\\\\-._");
        showText("  /,|`--._,-^|            ,");
        showText("  \\_| |`-._/||          ,'|");
        showText("    |  `-, / |         /  /");
        showText("    |     || |        /  /");
        showText("     `r-._||/   __   /  /");
        showText(" __,-<_     )`-/  `./  /");
        showText("'  \\   `---'   \\   /  /");
        showText("    |           |./  /");
        showText("    /           //  /");
        showText("\\_/' \\         |/  /");
        showText(" |    |   _,^-'/  /");
        showText(" |    , ``  (\\/  /_");
        showText("  \\,.->._    \\X-=/^");
        showText("  (  /   `-._//^`");
        showText("   `Y-.____(__}");
        showText("    |     {__)");
        showText("          ()");
        showText("");
    }
}