package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.creatures.interfaces.Immortel;
import ga2.projetzoofantastique.models.enclos.Enclos;
import ga2.projetzoofantastique.models.creatures.interfaces.Aerien;
import ga2.projetzoofantastique.models.threads.Naissance;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe Phenix, sous classe de ovipare qui implémente l'interface Aerien
 */
public class Phenix extends Ovipare implements Aerien, Immortel {
    /**
     * Nombre total de phénix
     */
    public static int nombreTotal;
    /**
     * Constructeur de la classe Phenix
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param enclos
     */
    public Phenix(String nom, String sexe, double poids, double taille, Enclos enclos) {
        super(nom, sexe, poids, taille, enclos);
        this.tempsAvantNaissance = 12;
        this.porteeMinimum = 1;
        this.porteeMaximum = 3;
        this.moisSaisonAmour = new ArrayList<>();
        this.moisSaisonAmour.add(4);
        this.moisSaisonAmour.add(5);
        this.moisSaisonAmour.add(6);
        this.longevite = 20;
        nombreTotal += 1;
    }

    /**
     * Getter du nombre total de phénix
     * @return
     */
    public static int getNombreTotal() {
        return nombreTotal;
    }

    /**
     * Methode pour renaître
     */
    @Override
    public void renaitre() {
        System.out.println(this.getNom() + " renaît");
        this.setAge(0);
    }

    @Override
    public void vieillir() {
        super.vieillir();
        if (this.getAge()==this.getLongevite()) {
            this.renaitre();
        }
    }

    /**
     * Méthode pour pondre
     */
    public void pondre() {
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

    /**
     * Méthode pour voler
     */
    public void voler() {
        System.out.println(this.getNom() + " vole");
    }
    public void emettreSon() {
        System.out.println(this.getNom() + " crie : AINNNNNNNNNNNNNN! ");
    }
}
