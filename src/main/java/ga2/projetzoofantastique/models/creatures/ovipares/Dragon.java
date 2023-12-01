package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.creatures.interfaces.Aerien;
import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;
import ga2.projetzoofantastique.models.creatures.interfaces.Immortel;
import ga2.projetzoofantastique.models.creatures.interfaces.Terrestre;
import ga2.projetzoofantastique.models.enclos.Enclos;
import java.util.ArrayList;

/**
 * Classe Dragon, sous classe de ovipare qui implémente toutes les interfaces
 */
public class Dragon extends Ovipare implements Aquatique, Aerien, Terrestre, Immortel {
    /**
     * Nombre total de dragons
     */
    public static int nombreTotal;
    /**
     * Constructeur de la classe Dragon
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param enclos
     */
    public Dragon(String nom, String sexe, double poids, double taille, Enclos enclos) {
        super(nom, sexe, poids, taille, enclos);
        this.tempsAvantNaissance = 12;
        this.porteeMinimum = 1;
        this.porteeMaximum = 2;
        this.moisSaisonAmour = new ArrayList<>();
        this.moisSaisonAmour.add(10);
        this.moisSaisonAmour.add(11);
        this.moisSaisonAmour.add(12);
        this.longevite = 100;
        nombreTotal += 1;
    }

    /**
     * Getter du nombre total de dragons
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
    /**
     * Methode pour renaître
     */
    @Override
    public void renaitre() {
        System.out.println(this.getNom() + " renaît");
        this.setAge(0);
    }
    /**
     * Méthode pour voler
     */
    public void voler() {

        System.out.println(this.getNom() + " vole");
    }
    /**
     * Methode pour courir
     */
    @Override
    public void courir() {

        System.out.println(this.getNom() + " court");
    }

    @Override
    public void vieillir() {
        super.vieillir();
        if (this.getAge()==this.getLongevite()) {
            this.renaitre();
        }
    }
}
