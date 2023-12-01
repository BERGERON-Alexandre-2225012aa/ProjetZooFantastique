package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.creatures.interfaces.Immortel;
import ga2.projetzoofantastique.models.enclos.Enclos;
import java.util.ArrayList;

/**
 * Classe Nymphe, sous classe de Vivipare qui implémente l'interface Immortel
 */
public class Nymphe extends Vivipare implements Immortel {
    /**
     * Constructeur de la classe Nymphe
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param aucun
     */
    public Nymphe(String nom, String sexe, double poids, double taille, Enclos aucun) {
        super(nom, sexe, poids, taille, aucun);
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
            this.renaitre();
        }
    }

    /**
     * Methode pour renaître
     */
    @Override
    public void renaitre() {
        System.out.println(this.getNom() + " renaît");
        this.setAge(0);
    }
}
