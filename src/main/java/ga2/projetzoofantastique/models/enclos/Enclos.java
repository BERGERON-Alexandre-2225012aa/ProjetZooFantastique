package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.colonies.Meute;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;

import java.util.ArrayList;

/**
 * Classe Enclos
 */
public class Enclos {
    //Attributs
    /**
     * Nom de l'enclos
     */
    private String nom;
    /**
     * Superficie de l'enclos
     */
    private double superficie;
    /**
     * Capacité maximale de l'enclos
     */
    private int capacite;
    /**
     * Nombre de créatures contenues actuellement dans l'enclos
     */
    private int nombreDeCreatures;
    /**
     * Liste de toutes les créatures contenues dans l'enclos
     */
    private ArrayList<Creature> creatures;
    /**
     * Indicateur de propreté de l'enclos
     */
    private int proprete;
    /**
     * Zoo fantastique dans lequel l'enclos est situé
     */
    private ZooFantastique zooFantastique;
    /**
     * Si enclos de lycanthropes, meute correspondante à l'enclos
     */
    private Meute meute;

    /**
     * Constructeur de la classe Enclos
     * @param nom
     * @param superficie
     * @param capacite
     * @param zooFantastique
     */
    public Enclos(String nom, double superficie, int capacite, ZooFantastique zooFantastique) {
        this.nom = nom;
        this.superficie = superficie;
        this.capacite = capacite;
        this.nombreDeCreatures = 0;
        this.creatures = new ArrayList<>();
        this.proprete = 2;
        this.zooFantastique = zooFantastique;
        this.meute = null;
    }
    // Getters

    /**
     * Getter du nom de l'enclos
     * @return
     */
    public String getNom() {
        return nom;
    }
    /**
     * Getter de la superficie de l'enclos
     * @return
     */
    public double getSuperficie() {
        return superficie;
    }
    /**
     * Getter de la capacité maximale de l'enclos
     * @return
     */
    public int getCapacite() {
        return capacite;
    }
    /**
     * Getter du nombre de créatures contenues dans l'enclos
     * @return
     */
    public int getNombreDeCreatures() {
        return nombreDeCreatures;
    }

    /**
     * Getter de la liste des créatures de l'enclos
     * @return
     */
    public ArrayList<Creature> getCreatures() {
        return creatures;
    }
    /**
     * Getter de l'indicateur de propreté de l'enclos
     * @return
     */
    public int getProprete() {
        return proprete;
    }
    /**
     * Getter du zoo fantastique dans lequel l'enclos est situé.
     * @return
     */
    public ZooFantastique getZooFantastique() {
        return zooFantastique;
    }

    /**
     * Getter de la meute de l'enclos
     * @return
     */
    public Meute getMeute() {
        return meute;
    }

    // Setters

    /**
     * Setter du nombre de créatures contenues dans l'enclos
     * @param nombreDeCreatures
     */
    public void setNombreDeCreatures(int nombreDeCreatures) {
        this.nombreDeCreatures = nombreDeCreatures;
    }

    /**
     * Setter de la liste de créatures de l'enclos
     * @param creatures
     */
    public void setCreatures(ArrayList<Creature> creatures) {
        this.creatures = creatures;
    }

    /**
     * Setter de l'indicateur de propreté de l'enclos
     * @param proprete
     */
    public void setProprete(int proprete) {
        this.proprete = proprete;
    }

    /**
     * Setter de la meute de l'enclos
     * @param meute
     */
    public void setMeute(Meute meute) {
        this.meute = meute;
    }

    /**
     * Pour afficher les caractéristiques de l'enclos
     * @return
     */
    public String afficherCaracteristiques() {
        return (this.getNom() + " :" +
                "\n Superficie : " + this.getSuperficie() +
                "\n Capacité : " + this.getCapacite() +
                "\n Nombre de créatures : " + this.getNombreDeCreatures() +
                "\n Propreté : " + this.getProprete());
    }
}
