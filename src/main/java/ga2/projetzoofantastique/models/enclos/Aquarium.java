package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.ZooFantastique;

/**
 * Classe Aquarium pour contenir des créatures aquatiques
 */
public class Aquarium extends Enclos {
    //Attributs
    /**
     * Profondeur de l'aquarium en mètres
     */
    private double profondeur;
    /**
     * Indicateur de salinité de l'eau de l'aquarium
     */
    private int salinite;
    /**
     * Indicateur de propreté du fond de l'aquarium
     */
    private int propreteFond;

    /**
     * Constructeur de la classe Aquarium
     * @param nom
     * @param superficie
     * @param capacite
     * @param zooFantastique
     * @param profondeur
     */
    public Aquarium(String nom, double superficie, int capacite, ZooFantastique zooFantastique, double profondeur) {
        super(nom, superficie, capacite, zooFantastique);
        this.profondeur = profondeur;
        this.salinite = 2;
        this.propreteFond = 2;
    }

    //Getters

    /**
     * Getter de la profondeur de l'Aquarium
     * @return
     */
    public double getProfondeur() {
        return profondeur;
    }

    /**
     * Getter de l'indicateur de salinité de l'eau de l'aquarium
     * @return
     */
    public int getSalinite() {
        return salinite;
    }

    /**
     * Getter de l'indicateur de propreté du fond de l'aquarium
     * @return
     */
    public int getPropreteFond() {
        return propreteFond;
    }

    // Setters

    /**
     * Setter de l'indicateur de salinité de l'eau de l'aquarium
     * @param salinite
     */
    public void setSalinite(int salinite) {
        this.salinite = salinite;
    }

    /**
     * Setter de l'indicateur de propreté du fond de l'aquarium
     * @param propreteFond
     */
    public void setPropreteFond(int propreteFond) {
        this.propreteFond = propreteFond;
    }
}
