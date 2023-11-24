package ga2.projetzoofantastique.models;

import java.util.ArrayList;

public class Licorne extends Vivipare implements Terrestre {
    /**
     * Constructeur de la classe Licorne
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param enclos
     */
    public Licorne(String nom, String sexe, double poids, double taille, Enclos enclos) {
        super(nom, sexe, poids, taille, enclos);
        this.tempsAvantNaissance = 11;
        this.porteeMinimum = 1;
        this.porteeMaximum = 1;
        this.moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(4);
        moisSaisonAmour.add(5);
        moisSaisonAmour.add(6);
    }

    /**
     * Méthode pour mettre bas
     */
    @Override
    public void mettreBas() {
        //plus tard
    }

    /**
     * Methode pour courir
     */
    @Override
    public void courir() {
        System.out.println(this.getNom() + " court");
    }
}
