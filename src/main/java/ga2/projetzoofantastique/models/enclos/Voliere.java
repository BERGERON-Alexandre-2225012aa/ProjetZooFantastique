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
     * @param hauteur
     */
    public Voliere(String nom, double superficie, int capacite, double hauteur) {
        super(nom, superficie, capacite);
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

    /**
     * Ajouter une créature dans la volière
     * @param creature
     */
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

    /**
     * Afficher les caractéristiques de la volière.
     * @return
     */
    @Override
    public String afficherCaracteristiques() {
        return (this.getNom() + " :" +
                "\n Superficie : " + this.getSuperficie() + "m²" +
                "\n Hauteur : " + this.getHauteur() + "m" +
                "\n Capacité : " + this.getCapacite() + " créatures" +
                "\n Nombre de créatures : " + this.getNombreDeCreatures() +
                "\n " +
                "\n Propreté : " + this.etatProprete() +
                "\n Propreté du toit : " + this.etatPropreteToit() +
                "\n " +
                "\n Nombre de créatures affamés : " + this.compterCreaturesAffamees() +
                "\n Nombre de créatures très affamées : " + this.compterCreaturesTresAffamees() +
                "\n " +
                "\n Nombre de créatures malades : " + compterCreaturesMalades() +
                "\n Nombre de créatures très malades : " + compterCreaturesTresMalades());
    }

    /**
     * Nettoyer la volière, mets les indicateurs de propreté à 2 (toit et normal)
     */
    @Override
    public void nettoyer() {
        super.nettoyer();
        this.setPropreteToit(2);
    }

    @Override
    public void salir() {
        if (!(this.getProprete() == 0)) {
            this.setProprete(this.getProprete()-1);
            this.setPropreteToit(this.getPropreteToit()-1);
        }
        else {
            for (int i = 0 ; i < this.getNombreDeCreatures(); ++i) {
                this.getCreatures().get(i).empoisonner();
            }
        }
    }
}
