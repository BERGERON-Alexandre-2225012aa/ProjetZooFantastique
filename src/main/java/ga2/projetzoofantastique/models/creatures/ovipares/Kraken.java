package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import ga2.projetzoofantastique.models.threads.Naissance;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe Kraken, sous classe de ovipare qui implémente l'interface Aquatique
 */
public class Kraken extends Ovipare implements Aquatique {
    /**
     * Nombre total de krakens
     */
    public static int nombreTotal;
    /**
     * Constructeur de la classe Kraken
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param aquarium
     */
    public Kraken(String nom, String sexe, double poids, double taille, Aquarium aquarium) {
        super(nom, sexe, poids, taille, aquarium);
        this.tempsAvantNaissance = 4;
        this.porteeMinimum = 1;
        this.porteeMaximum = 10;
        this.moisSaisonAmour = new ArrayList<>();
        this.moisSaisonAmour.add(1);
        this.moisSaisonAmour.add(2);
        this.moisSaisonAmour.add(3);
        this.longevite = 50;
        nombreTotal += 1;
    }

    /**
     * Getter du nombre total de krakens
     * @return
     */
    public static int getNombreTotal() {
        return nombreTotal;
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
     * Méthode pour nager
     */
    public void nager() {
        System.out.println(this.getNom() + " nage");
    }
    @Override
    public void vieillir() {
        super.vieillir();
        if (this.getAge()==this.getLongevite()) {
            this.mourrir();
        }
    }
    public void emettreSon() {
        System.out.println(this.getNom() + " crie : Glouglouglou! ");
    }
}
