package ga2.projetzoofantastique.models.colonies;

import ga2.projetzoofantastique.models.creatures.vivipares.Lycanthrope;
import ga2.projetzoofantastique.models.enclos.Enclos;

import java.util.ArrayList;

/**
 * Classe Meute de lycanthropes
 */
public class Meute {
    /**
     * Couple alpha de la meute
     */
    private CoupleAlpha coupleAlpha;
    /**
     * Liste des lycanthropes de la meute
     */
    private ArrayList<Lycanthrope> lycanthropes;
    /**
     * Enclos correspondant à la meute
     */
    private Enclos enclos;

    public Meute() {

    }
}
