package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;

/**
 * Classe Aquarium pour contenir des créatures aquatiques
 */
public class Aquarium extends Enclos {
    //Attributs
    /**
     * Profondeur de l'aquarium en mètres
     */
    private double profondeur;
    /**
     * Indicateur de salinité de l'eau de l'aquarium
     */
    private int salinite;
    /**
     * Indicateur de propreté du fond de l'aquarium
     */
    private int propreteFond;

    /**
     * Constructeur de la classe Aquarium
     * @param nom
     * @param superficie
     * @param capacite
     * @param profondeur
     */
    public Aquarium(String nom, double superficie, int capacite, double profondeur) {
        super(nom, superficie, capacite);
        this.profondeur = profondeur;
        this.salinite = 2;
        this.propreteFond = 2;
    }

    //Getters

    /**
     * Getter de la profondeur de l'Aquarium
     * @return
     */
    public double getProfondeur() {
        return profondeur;
    }

    /**
     * Getter de l'indicateur de salinité de l'eau de l'aquarium
     * @return
     */
    public int getSalinite() {
        return salinite;
    }

    /**
     * Getter de l'indicateur de propreté du fond de l'aquarium
     * @return
     */
    public int getPropreteFond() {
        return propreteFond;
    }

    // Setters

    /**
     * Setter de l'indicateur de salinité de l'eau de l'aquarium
     * @param salinite
     */
    public void setSalinite(int salinite) {
        this.salinite = salinite;
    }

    /**
     * Setter de l'indicateur de propreté du fond de l'aquarium
     * @param propreteFond
     */
    public void setPropreteFond(int propreteFond) {
        this.propreteFond = propreteFond;
    }

    /**
     * Etat de salinité en fonction de l'indicateur de salinité
     * @return
     */
    public String etatSalinite() {
        if (this.getSalinite() == 2) {
            return "correcte";
        } else if (this.getSalinite() == 1) {
            return "manque de sel";
        } else {
            return "insuffisante";
        }
    }

    /**
     * Etat de propreté du fond de l'aquarium en fonction de l'indicateur de propreté du fond
     * @return
     */
    public String etatPropreteFond() {
        if (this.getPropreteFond() == 2) {
            return "propre";
        } else if (this.getPropreteFond() == 1) {
            return "sale";
        } else {
            return "très sale";
        }
    }

    /**
     * Ajouter une créature dans l'aquarium, seulement si elle est aquatique
     * @param creature
     */
    @Override
    public void ajouterCreature(Creature creature) {
        if (!(creature instanceof Aquatique)) {
            System.out.println("La créature doit être aquatique !");
        }
        else {
            creature.setEnclos(this);
            this.creatures.add(creature);
            this.setNombreDeCreatures(this.getNombreDeCreatures()+1);
        }
    }

    /**
     * Afficher les caractéristiques de l'enclos
     * @return
     */
    @Override
    public String afficherCaracteristiques() {
        return (this.getNom() + " :" +
                "\n Superficie : " + this.getSuperficie() + "m²" +
                "\n Profondeur : " + this.getProfondeur() + "m" +
                "\n Capacité : " + this.getCapacite() + " créatures" +
                "\n Nombre de créatures : " + this.getNombreDeCreatures() +
                "\n " +
                "\n Propreté : " + this.etatProprete() +
                "\n Propreté du fond : " + this.etatPropreteFond() +
                "\n " +
                "\n Salinité : " + this.etatSalinite() +
                "\n " +
                "\n Nombre de créatures affamées : " + this.compterCreaturesAffamees() +
                "\n Nombre de créatures très affamées : " + this.compterCreaturesTresAffamees() +
                "\n " +
                "\n Nombre de créatures malades : " + compterCreaturesMalades() +
                "\n Nombre de créatures très malades : " + compterCreaturesTresMalades());
    }

    /**
     * Nettoyer l'aquarium, mets les indicateurs de propreté à 2 (fond et normal)
     */
    @Override
    public void nettoyer() {
        super.nettoyer();
        this.setPropreteFond(2);
    }

    /**
     * Salinise correctement l'aquarium, mets l'indicateur de salinité à 2
     */
    public void saliniser() {
        this.setSalinite(2);
    }

    @Override
    public void salir() {
        if (!(this.getProprete() == 0)) {
            this.setProprete(this.getProprete()-1);
            this.setPropreteFond(this.getPropreteFond()-1);
        }
        else {
            for (int i = 0 ; i < this.getNombreDeCreatures(); ++i) {
                this.getCreatures().get(i).empoisonner();
            }
        }
    }

    /**
     * Desalinise de 1 cran et empoisonne si = 0
     */
    public void desaliniser() {
        if (!(this.getSalinite() == 0)) {
            this.setSalinite(this.getSalinite()-1);
        }
        else {
            for (int i = 0 ; i < this.getNombreDeCreatures(); ++i) {
                this.getCreatures().get(i).empoisonner();
            }
        }
    }
}
