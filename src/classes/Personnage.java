package classes;

public abstract class Personnage {

    // Caractéristiques du personnage
    String nom = "";
    int niveau = 1;
    int vitalite = 0;
    int force = 0;
    int agilite = 0;
    int intelligence = 0;
    int playerNumber = 0;
    String playerType = "";

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
        this.setVitalite(5*this.niveau);
    }

    public int getLeftPoints() {
        return this.niveau - this.force - this.agilite - this.intelligence;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int number) {
        this.playerNumber = number;
        this.setNom();
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
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
        this.setNom();
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

    public abstract int attaqueBasique();

    public abstract int attaqueSpeciale();


    public String getResume() {
        return this.nom + "Your actual skills : Level: " + this.niveau + " - Vitalite: " + this.vitalite + " - Force: " + this.force + " - Intelligence: " + this.intelligence + " - Agilite: " + this.agilite;
    }
    public String getCurStatus() {
        return this.nom + "Level of vitality : " + this.vitalite;
    }
    public String getNom() {
        return this.nom;
    }

    private void setNom() {
        this.nom = "(@" + this.playerType + "_" + this.playerNumber + ") ";
    }
    public void receiveDammages(int dammages) {
        if (dammages > this.vitalite) {
            this.vitalite = 0;
        } else {
            this.vitalite = this.vitalite - dammages;
        }
    }
}
