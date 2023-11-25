package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import java.util.ArrayList;

/**
 * Classe Megalodon, sous classe de ovipare qui implémente l'interface Aquatique
 */
public class Megalodon extends Ovipare implements Aquatique {
    /**
     * Constructeur de la classe Megalodon
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param aquarium
     */
    public Megalodon(String nom, String sexe, double poids, double taille, Aquarium aquarium) {
        super(nom, sexe, poids, taille, aquarium);
        this.tempsAvantNaissance = 5;
        this.porteeMinimum = 1;
        this.porteeMaximum = 4;
        this.moisSaisonAmour = new ArrayList<>();
        this.moisSaisonAmour.add(4);
        this.moisSaisonAmour.add(5);
        this.moisSaisonAmour.add(6);
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
