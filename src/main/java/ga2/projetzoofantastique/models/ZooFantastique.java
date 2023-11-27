package ga2.projetzoofantastique.models;

import ga2.projetzoofantastique.models.colonies.Colonie;
import ga2.projetzoofantastique.models.enclos.Enclos;

import java.util.ArrayList;

/**
 * Classe ZooFantastique
 */
public class ZooFantastique {
    /**
     * Nom du Zoo Fantastique
     */
    private String nom;
    /**
     * Maître du Zoo Fantastique
     */
    private Maitre maitre;
    /**
     * Nombre maximum d'enclos que peut contenir le zoo fantastique
     */
    private int nombreMaxEnclos;
    /**
     * Liste des enclos contenus dans le zoo fantastique
     */
    private ArrayList<Enclos> enclos;
    /**
     * Colonie de lycanthropes correspondante au zoo fantastique
     */
    private Colonie colonie;

    /**
     * Constructeur de la classe ZooFantastique
     * @param nom
     * @param maitre
     * @param nombreMaxEnclos
     */
    public ZooFantastique(String nom, Maitre maitre, int nombreMaxEnclos) {
        this.nom = nom;
        this.maitre = maitre;
        this.nombreMaxEnclos = nombreMaxEnclos;
        this.enclos = new ArrayList<>();
        this.colonie = new Colonie();
    }

    /**
     * Getter du nom du zoo fantastique
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter de la liste des enclos du zoo fantastique
     * @return
     */
    public ArrayList<Enclos> getEnclos() {
        return enclos;
    }

    /**
     * Getter de la colonie correspondante au zoo fantastique
     * @return
     */
    public Colonie getColonie() {
        return colonie;
    }

    /**
     * Getter du nombre max d'enclos dans le zoo fantastique
     * @return
     */
    public int getNombreMaxEnclos() {
        return nombreMaxEnclos;
    }

    /**
     * Getter du maître du zoo fantastique
     * @return
     */
    public Maitre getMaitre() {
        return maitre;
    }

    /**
     * Setter du maître du zoo fantastique
     * @param maitre
     */
    public void setMaitre(Maitre maitre) {
        this.maitre = maitre;
    }

    /**
     * Setter de la liste d'enclos du zoo fantastique
     * @param enclos
     */
    public void setEnclos(ArrayList<Enclos> enclos) {
        this.enclos = enclos;
    }

    /**
     * Setter du nombre maximum d'enclos du zoo fantastique
     * @param nombreMaxEnclos
     */
    public void setNombreMaxEnclos(int nombreMaxEnclos) {
        this.nombreMaxEnclos = nombreMaxEnclos;
    }
}
