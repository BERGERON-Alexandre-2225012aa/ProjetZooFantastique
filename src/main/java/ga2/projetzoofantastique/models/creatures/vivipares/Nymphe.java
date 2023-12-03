package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.creatures.interfaces.Immortel;
import ga2.projetzoofantastique.models.enclos.Enclos;
import ga2.projetzoofantastique.models.threads.Naissance;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe Nymphe, sous classe de Vivipare qui implémente l'interface Immortel
 */
public class Nymphe extends Vivipare implements Immortel {
    /**
     * Nombre total de nymphes
     */
    public static int nombreTotal;
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
        nombreTotal += 1;
    }


    /**
     * Getter du nombre total de nymphes
     * @return
     */
    public static int getNombreTotal() {
        return nombreTotal;
    }

    /**
     * Méthode pour mettre bas
     */
    @Override
    public void mettreBas() {
        if (this.getSexe() == "femelle") {
            Random random = new Random();
            int nombrePetits = random.nextInt(this.getPorteeMinimum(), this.getPorteeMaximum());

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
    public void emettreSon() {
        System.out.println(this.getNom() + " crie : HMMMMMMMMMMMMMM! ");
    }
}
