package ga2.projetzoofantastique.models;

/**
 * Classe abstraite Vivipare
 */
public abstract class Vivipare extends Creature {

    /**
     * Constructeur de la classe vivipare
     */
    public Vivipare(String nom, String sexe, double poids, double taille, Enclos enclos) {
        super(nom, sexe, poids, taille, enclos);
    }

    /**
     * Méthode mettre bas qui permet aux vivipares d'accoucher
     */
    public abstract void mettreBas();
}
