package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.creatures.interfaces.Immortel;
import ga2.projetzoofantastique.models.enclos.Enclos;
import ga2.projetzoofantastique.models.creatures.interfaces.Aerien;
import java.util.ArrayList;

/**
 * Classe Phenix, sous classe de ovipare qui implémente l'interface Aerien
 */
public class Phenix extends Ovipare implements Aerien, Immortel {
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
        this.longevite = 20;
    }

    /**
     * Methode pour renaître
     */
    @Override
    public void renaitre() {
        System.out.println(this.getNom() + " renaît");
        this.setAge(0);
    }

    @Override
    public void vieillir() {
        super.vieillir();
        if (this.getAge()==this.getLongevite()) {
            this.renaitre();
        }
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
