package ga2.projetzoofantastique.models;

import java.util.ArrayList;

/**
 * Classe Phenix, sous classe de ovipare qui implémente l'interface Aerien
 */
public class Phenix extends Ovipare implements Aerien {
    /**
     * Constructeur de la classe Phenix
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param enclos
     */
    public Phenix(String nom, String sexe, double poids, double taille, Enclos enclos) {
        super(nom, sexe, poids, taille, enclos);
        this.tempsAvantNaissance = 12;
        this.porteeMinimum = 1;
        this.porteeMaximum = 3;
        this.moisSaisonAmour = new ArrayList<>();
        this.moisSaisonAmour.add(4);
        this.moisSaisonAmour.add(5);
        this.moisSaisonAmour.add(6);
    }

    public void pondre() {
        // plus tard
    }

    /**
     * Méthode pour voler
     */
    public void voler() {
        System.out.println(this.getNom() + " vole");
    }
}
