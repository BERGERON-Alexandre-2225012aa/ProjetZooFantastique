package ga2.projetzoofantastique.models.colonies;

import java.util.ArrayList;

/**
 * Classe Colonie
 */
public class Colonie {
    /**
     * Liste des meutes de la colonie
     */
    private ArrayList<Meute> meutes;

    /**
     * Constructeur de la classe Colonie
     */
    public Colonie() {
        this.meutes = new ArrayList<>();
    }

    /**
     * Getter de liste des meutes de la colonie
     * @return
     */
    public ArrayList<Meute> getMeutes() {
        return meutes;
    }

    /**
     * Setter de la liste des meutes de la colonie
     * @param meutes
     */
    public void setMeutes(ArrayList<Meute> meutes) {
        this.meutes = meutes;
    }
}
