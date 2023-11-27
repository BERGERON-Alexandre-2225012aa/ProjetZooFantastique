package ga2.projetzoofantastique.models.colonies;

import java.util.ArrayList;

/**
 * Classe Hurlement
 */
public class Hurlement {
    /**
     * Type du hurlement
     */
    private String type;
    /**
     * Si hurlement d'appartenance, meute à laquelle il réfère
     */
    private Meute meute;

    /**
     * Constructeur de la classe Hurlement
     * @param type
     * @param meute
     */
    public Hurlement(String type, Meute meute) {
        this.type = type;
        this.meute = meute;
    }

    /**
     * Getter de la meute à laquelle le hurlement réfère, null s'il n'en a pas
     * @return
     */
    public Meute getMeute() {
        return meute;
    }

    /**
     * Getter du type de hurlement
     * @return
     */
    public String getType() {
        return type;
    }

    public void afficherCaracteristiques() {
        if (this.meute == null) {
            System.out.println("Hurlement :" +
                    "\n Type : " + this.getType());
        }
        else {
            System.out.println("Hurlement :" +
                    "\n Type : " + this.getType() +
                    "\n Meute : " + this.getMeute().getEnclos().getNom());
        }
    }
}
