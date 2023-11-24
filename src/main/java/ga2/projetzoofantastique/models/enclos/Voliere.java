package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.ZooFantastique;

public class Voliere extends Enclos {
    //Attributs
    /**
     * Hauteur en mètres de la volière
     */
    private double hauteur;
    /**
     * Indicateur de propreté du toit de la volière
     */
    private int propreteToit;

    /**
     * Constructeur de la classe Voliere
     * @param nom
     * @param superficie
     * @param capacite
     * @param zooFantastique
     * @param hauteur
     */
    public Voliere(String nom, double superficie, int capacite, ZooFantastique zooFantastique, double hauteur) {
        super(nom, superficie, capacite, zooFantastique);
        this.hauteur = hauteur;
        this.propreteToit = 2;
    }

    //Getters

    /**
     * Getter de la hauteur de la volière
     * @return
     */
    public double getHauteur() {
        return hauteur;
    }

    /**
     * Getter de l'indicateur de propreté du toit de la volière
     * @return
     */
    public int getPropreteToit() {
        return propreteToit;
    }
    //Setters

    /**
     * Setter de l'indiateur de propreté du toit de la volière
     * @param propreteToit
     */
    public void setPropreteToit(int propreteToit) {
        this.propreteToit = propreteToit;
    }
}
