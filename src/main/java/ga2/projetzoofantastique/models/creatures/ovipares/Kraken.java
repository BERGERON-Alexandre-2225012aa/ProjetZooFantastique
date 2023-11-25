package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import java.util.ArrayList;

/**
 * Classe Kraken, sous classe de ovipare qui implémente l'interface Aquatique
 */
public class Kraken extends Ovipare implements Aquatique {
    /**
     * Constructeur de la classe Kraken
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param aquarium
     */
    public Kraken(String nom, String sexe, double poids, double taille, Aquarium aquarium) {
        super(nom, sexe, poids, taille, aquarium);
        this.tempsAvantNaissance = 4;
        this.porteeMinimum = 1;
        this.porteeMaximum = 10;
        this.moisSaisonAmour = new ArrayList<>();
        this.moisSaisonAmour.add(1);
        this.moisSaisonAmour.add(2);
        this.moisSaisonAmour.add(3);
    }

    public void pondre() {
        // plus tard
    }

    /**
     * Méthode pour nager
     */
    public void nager() {
        System.out.println(this.getNom() + " nage");
    }
}