package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import java.util.ArrayList;

/**
 * Classe Megalodon, sous classe de ovipare qui implémente l'interface Aquatique
 */
public class Megalodon extends Ovipare implements Aquatique {
    /**
     * Nombre total de mégalodons
     */
    public static int nombreTotal;
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
        this.longevite = 50;
        nombreTotal += 1;
    }

    /**
     * Getter du nombre total de mégalodons
     * @return
     */
    public static int getNombreTotal() {
        return nombreTotal;
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
    @Override
    public void vieillir() {
        super.vieillir();
        if (this.getAge()==this.getLongevite()) {
            this.mourrir();
        }
    }
}
