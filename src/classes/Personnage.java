package classes;

import java.util.Map;

public class Personnage {

    // Caractéristiques du personnage
    int niveau = 0;
    int vitalite = 0;
    int force = 0;
    int agilite = 0;
    int intelligence = 0;


    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
        this.setVitalite(5*this.niveau);
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
