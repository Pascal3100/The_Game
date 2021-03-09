package classes;

import java.util.Random;

public class Turn {
    private static int turn = 1;
    private static int nextTurn = 2;
    private static int maxTurn = 2;

    public static void switchTurn() {
        if (turn < maxTurn) {
            turn++;
        } else if (turn == maxTurn) {
            turn = 1;
        }

        if (nextTurn < maxTurn) {
            nextTurn++;
        } else {
            nextTurn = 1;
        }

    }
    public static void setRandomStartTurn() {
        Random rand = new Random();
        turn = rand.nextInt(maxTurn) + 1;
    }

    public static void setMaxTurn(int t) {
        maxTurn = t;
    }

    public static int getNextTurn() {
        return nextTurn;
    }
    public static int getCurrentTurn() {
        return turn;
    }
}
