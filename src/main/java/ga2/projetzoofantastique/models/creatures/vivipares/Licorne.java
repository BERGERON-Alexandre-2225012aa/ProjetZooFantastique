package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.enclos.Enclos;
import ga2.projetzoofantastique.models.creatures.interfaces.Terrestre;
import ga2.projetzoofantastique.models.threads.Naissance;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe Licorne, sous classe de Vivipare qui implémente l'interface Terrestre
 */
public class Licorne extends Vivipare implements Terrestre {
    /**
     * Nombre total de licornes
     */
    public static int nombreTotal;
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
        this.longevite = 60;
        nombreTotal += 1;
    }

    /**
     * Getter du nombre total de licornes
     * @return
     */
    public static int getNombreTotal() {
        return nombreTotal;
    }

    /**
     * Méthode pour mettre bas, seules les femelles peuvent mettre pas d'un nombre de petits compris dans l'intervalle [porteeMinimum ; porteeMaximum]
     */
    @Override
    public void mettreBas() {

        if (this.getSexe() == "femelle") {
            Random random = new Random();
            int nombrePetits = random.nextInt(this.getPorteeMaximum());

            for (int i = 0 ; i < nombrePetits ; ++i) {
                Naissance naissance = new Naissance(this.getTempsAvantNaissance(), this);
                Thread thread = new Thread(naissance);
                thread.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
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
            this.mourrir();
        }
    }
    @Override
    public void emettreSon() {
        System.out.println(this.getNom() + " crie : UHHHHHHHHUHUHUHUUHUHH! ");
    }

}
