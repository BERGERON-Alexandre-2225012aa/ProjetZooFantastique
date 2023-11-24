package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.enclos.Enclos;
import ga2.projetzoofantastique.models.creatures.Creature;

/**
 * Classe abstraite Ovipare
 */
public abstract class Ovipare extends Creature {
    /**
     * Constructeur de la classe Ovipare
     */
    public Ovipare(String nom, String sexe, double poids, double taille, Enclos enclos) {
        super(nom, sexe, poids, taille, enclos);
    }

    /**
     * Méthode abstraite pondre qui permet aux ovipares de pondre
     */
    public abstract void pondre();
}
