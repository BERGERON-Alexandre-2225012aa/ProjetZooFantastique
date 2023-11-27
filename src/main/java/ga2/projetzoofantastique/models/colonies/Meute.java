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

    /**
     * Constructeur de la classe Meute
     * @param enclos
     */
    public Meute(Enclos enclos) {
        this.coupleAlpha = new CoupleAlpha();
        this.lycanthropes = new ArrayList<>();
        this.enclos = enclos;
    }

    /**
     * Getter de l'enclos correspondant à la meute
     * @return
     */
    public Enclos getEnclos() {
        return enclos;
    }

    /**
     * Getter de la liste des lycanthropes de la meute
     * @return
     */
    public ArrayList<Lycanthrope> getLycanthropes() {
        return lycanthropes;
    }

    /**
     * Getter du couple alpha de la meute
     * @return
     */
    public CoupleAlpha getCoupleAlpha() {
        return coupleAlpha;
    }

    /**
     * Setter de la liste de lycanthropes
     * @param lycanthropes
     */
    public void setLycanthropes(ArrayList<Lycanthrope> lycanthropes) {
        this.lycanthropes = lycanthropes;
    }
}
