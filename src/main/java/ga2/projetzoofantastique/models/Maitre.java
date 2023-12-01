package ga2.projetzoofantastique.models;

import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.enclos.Enclos;

/**
 * Classe Maitre de zoo fantastique
 */
public class Maitre {
    /**
     * Nom du maitre de zoo fantastique
     */
    private String nom;
    /**
     * Sexe du maitre
     */
    private String sexe;
    /**
     * Age du maitre
     */
    private int age;

    /**
     * Constructeur de la classe Maitre
     * @param nom
     * @param sexe
     */
    public Maitre(String nom, String sexe) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = 0;
    }

    /**
     * Getter du nom du maitre de zoo fantastique
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter du sexe du maitre de zoo fantastique
     * @return
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Getter de l'âge du maitre de zoo fantastique
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter de l'âge du maitre de zoo fantastique
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Afficher les caractéristiques d'un enclos choisi
     * @param enclos
     * @return
     */
    public String examinerEnclos(Enclos enclos) {
        return enclos.afficherCaracteristiques();
    }

    /**
     * Nettoyer un enclos choisi
     * @param enclos
     */
    public void nettoyerEnclos(Enclos enclos) {
        enclos.nettoyer();
    }

    /**
     * Nourrir les créatures d'un enclos choisi
     * @param enclos
     */
    public void nourrirEnclos(Enclos enclos) {
        enclos.nourrirCreatures();
    }

    /**
     * Transférer une créature vers un autre enclos
     * @param creature
     * @param enclos
     */
    public void transfererCreature(Creature creature, Enclos enclos) {
        if (enclos.getNombreDeCreatures() < enclos.getCapacite()) {
            creature.getEnclos().retirerCreature(creature);
            enclos.ajouterCreature(creature);
        }
        else {
            System.out.println("L'enclos est plein ! Impossible de transférer la créature...");
        }
    }

    /**
     * Fais vieillir le maitre d'un an
     */
    public void vieillir() {
        this.setAge(this.getAge()+1);
    }
}
