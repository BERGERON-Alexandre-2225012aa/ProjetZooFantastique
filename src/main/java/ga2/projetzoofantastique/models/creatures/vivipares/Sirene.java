package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.enclos.Enclos;
import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;
import java.util.ArrayList;

/**
 * Classe Sirene, sous classe de Vivipare qui implémente l'interface Aquatique
 */
public class Sirene extends Vivipare implements Aquatique {
    /**
     * Constructeur de la classe SIrene
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param enclos
     */
    public Sirene(String nom, String sexe, double poids, double taille, Enclos enclos) {
        super(nom, sexe, poids, taille, enclos);
        this.tempsAvantNaissance = 9;
        this.porteeMinimum = 1;
        this.porteeMaximum = 3;
        this.moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(7);
        moisSaisonAmour.add(8);
        moisSaisonAmour.add(9);
        this.longevite = 100;
    }

    /**
     * Méthode pour mettre bas
     */
    @Override
    public void mettreBas() {
        //plus tard
    }

    @Override
    public void vieillir() {
        super.vieillir();
        if (this.getAge()==this.getLongevite()) {
            this.mourrir();
        }
    }
    /**
     * Methode pour nager
     */
    @Override
    public void nager() {
        System.out.println(this.getNom() + " nage");
    }
}
