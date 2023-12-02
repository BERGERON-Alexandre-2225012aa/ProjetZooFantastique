package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.colonies.Meute;
import ga2.projetzoofantastique.models.creatures.interfaces.Terrestre;
import ga2.projetzoofantastique.models.enclos.Enclos;
import ga2.projetzoofantastique.models.threads.Naissance;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe Lycanthrope, sous classe de Vivipare qui implémente l'interface Terrestre
 */
public class Lycanthrope extends Vivipare implements Terrestre {
    /**
     * Nombre total de lycanthropes
     */
    public static int nombreTotal;
    /**
     * Force du Lycanthrope
     */
    private int force;
    /**
     * Facteur de domination du lycanthrope
     */
    private int facteurDomination;
    /**
     * Rang du lycanthrope, initialisé à ω
     */
    private char rang;
    /**
     * Impétuosité du lycanthrope
     */
    private int impetuosite;
    /**
     * Meute à laquelle appartient le lycanthrope, peut être égal à null
     */
    private Meute meute;
    /**
     * Si le lycanthrope s'est transformé en humain, son apparence humaine
     */
    private Maitre apparenceHumaine;

    /**
     * Constructeur de la classe Lycanthrope
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param enclos
     */
    public Lycanthrope(String nom, String sexe, double poids, double taille, Enclos enclos) {
        super(nom, sexe, poids, taille, enclos);
        Random random = new Random();
        this.moisSaisonAmour = new ArrayList<>();
        this.moisSaisonAmour.add(4);
        this.moisSaisonAmour.add(5);
        this.moisSaisonAmour.add(6);
        this.porteeMinimum = 1;
        this.porteeMaximum = 7;
        this.tempsAvantNaissance = 9;
        this.force = random.nextInt(10);
        this.facteurDomination = 0;
        this.rang = 'γ';
        this.impetuosite = 0;
        this.meute = null;
        this.apparenceHumaine = null;
        nombreTotal += 1;
    }

    /**
     * Getter du nombre total de lycanthropes
     * @return
     */
    public static int getNombreTotal() {
        return nombreTotal;
    }

    /**
     * Getter du rang du lycanthrope
     * @return
     */
    public char getRang() {
        return rang;
    }

    /**
     * Getter du facteur de domination du lycanthrope
     * @return
     */
    public int getFacteurDomination() {
        return facteurDomination;
    }

    /**
     * Getter de l'indicateur de force du lycanthrope
     * @return
     */
    public int getForce() {
        return force;
    }

    /**
     * Getter de l'indicateur d'impétuosité du lycanthrope
     * @return
     */
    public int getImpetuosite() {
        return impetuosite;
    }

    /**
     * Getter de l'apparence du lycanthrope, s'il en a une
     * @return
     */
    public Maitre getApparenceHumaine() {
        return apparenceHumaine;
    }

    /**
     * Getter de la meute du lycanthrope, s'il en a une
     * @return
     */
    public Meute getMeute() {
        return meute;
    }

    /**
     * Setter du facteur de domination du lycanthrope
     * @param facteurDomination
     */
    public void setFacteurDomination(int facteurDomination) {
        this.facteurDomination = facteurDomination;
    }

    /**
     * Setter de l'indicateur de force du lycanthrope
     * @param force
     */
    public void setForce(int force) {
        this.force = force;
    }

    /**
     * Setter de l'indicateur d'impétuosité du lycanthrope
     * @param impetuosite
     */
    public void setImpetuosite(int impetuosite) {
        this.impetuosite = impetuosite;
    }

    /**
     * Setter de la meute du lycanthrope
     * @param meute
     */
    public void setMeute(Meute meute) {
        this.meute = meute;
        this.longevite = 25;
    }

    /**
     * Setter du rang du lycanthrope
     * @param rang
     */
    public void setRang(char rang) {
        this.rang = rang;
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

    /**
     * Rejoindre une meute
     * @param meute
     */
    public void rejoindreMeute(Meute meute) {
        meute.ajouterLycanthrope(this);
    }

    /**
     * Quitter une meute
     */
    public void quitterMeute() {
        this.getMeute().retirerLycanthrope(this);
    }

    /**
     * Devenir humain, revient à la disparition du lycanthrope
     */
    public void devenirHumain() {
        this.mourrir();
    }

    /**
     * Mourrir fait quitter la meute si le lycanthrope en a une
     */
    @Override
    public void mourrir() {
        super.mourrir();
        if (!(this.getMeute() == null)) {
            this.getMeute().retirerLycanthrope(this);
        }
    }
}
