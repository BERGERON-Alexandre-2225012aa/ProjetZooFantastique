package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.interfaces.Aerien;
import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;

import java.util.ArrayList;

public class Voliere extends Enclos {
    //Attributs
    /**
     * Hauteur en mètres de la volière
     */
    private double hauteur;
    /**
     * Indicateur de propreté du toit de la volière
     */
    private int propreteToit;

    /**
     * Constructeur de la classe Voliere
     * @param nom
     * @param superficie
     * @param capacite
     * @param zooFantastique
     * @param hauteur
     */
    public Voliere(String nom, double superficie, int capacite, ZooFantastique zooFantastique, double hauteur) {
        super(nom, superficie, capacite, zooFantastique);
        this.hauteur = hauteur;
        this.propreteToit = 2;
    }

    //Getters

    /**
     * Getter de la hauteur de la volière
     * @return
     */
    public double getHauteur() {
        return hauteur;
    }

    /**
     * Getter de l'indicateur de propreté du toit de la volière
     * @return
     */
    public int getPropreteToit() {
        return propreteToit;
    }
    //Setters

    /**
     * Setter de l'indiateur de propreté du toit de la volière
     * @param propreteToit
     */
    public void setPropreteToit(int propreteToit) {
        this.propreteToit = propreteToit;
    }

    /**
     * Retourne l'état de propreté du toit de l'enclos en fonction de l'indicateur de propreté du toit de la volière
     * @return
     */
    public String etatPropreteToit() {
        if (this.getPropreteToit()==2) {
            return "propre";
        } else if (this.getPropreteToit()==1) {
            return "sale";
        } else {
            return "très sale";
        }
    }

    @Override
    public void ajouterCreature(Creature creature) {
        if (!(creature instanceof Aerien)) {
            System.out.println("La créature doit être aérienne !");
        }
        else {
            creature.setEnclos(this);
            this.creatures.add(creature);
            this.setNombreDeCreatures(this.getNombreDeCreatures()+1);
        }
    }

    @Override
    public String afficherCaracteristiques() {
        return super.afficherCaracteristiques() +
                "\n Hauteur : " + this.getHauteur() + "m" +
                "\n Propreté du toit : " + this.etatPropreteToit();
    }
}
