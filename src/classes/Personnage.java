package classes;

import interfaces.Player;

import java.util.Map;

public class Personnage {

    // Caractéristiques du personnage
    int niveau = 0;
    int vitalite = 0;
    int force = 0;
    int agilite = 0;
    int intelligence = 0;
    int playerNumber = 0;
    String playerType = "";
    Player characterClass = null;

    public void setCharacter(int type) {
        switch (type) {
            case 1 :
                characterClass = new Guerrier();
                playerType = "Warrior";
                break;
            case 2 :
                characterClass = new Rodeur();
                playerType = "Ranger";
                break;
            case 3 :
                characterClass = new Mage();
                playerType = "Mage";
                break;
        }
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
        this.setVitalite(5*this.niveau);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int number) {
        this.playerNumber = number;
    }

    public int getVitalite() {
        return vitalite;
    }

    private void setVitalite(int vitalite) {
        this.vitalite = vitalite;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getPlayerType() {
        return playerType;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

}
