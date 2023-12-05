package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.colonies.Meute;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.interfaces.Aerien;
import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;
import ga2.projetzoofantastique.models.creatures.ovipares.Dragon;

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
    protected ArrayList<Creature> creatures;
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
     */
    public Enclos(String nom, double superficie, int capacite) {
        this.nom = nom;
        this.superficie = superficie;
        this.capacite = capacite;
        this.nombreDeCreatures = 0;
        this.creatures = new ArrayList<>();
        this.proprete = 2;
        this.zooFantastique = null;
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
     * Setter du zoo fantastique de l'enclos
     * @param zooFantastique
     */
    public void setZooFantastique(ZooFantastique zooFantastique) {
        this.zooFantastique = zooFantastique;
    }

    /**
     * Donne l'état de propreté en fonction de l'indicateur de propreté
     * @return
     */
    public String etatProprete() {
        if (this.getProprete() == 2) {
            return "propre";
        } else if (this.getProprete() == 1) {
            return "sale";
        }
        else {
            return "très sale";
        }
    }

    /**
     * Ajouter une créature dans l'enclos, sauf si elle est aquatique ou aérienne (hors dragons)
     * @param creature
     */
    public void ajouterCreature(Creature creature) {
        if (creature instanceof Dragon) {
            creature.setEnclos(this);
            this.creatures.add(creature);
            this.setNombreDeCreatures(this.getNombreDeCreatures()+1);
        }
        else if (creature instanceof Aerien) {
            System.out.println("Un enclos ne peut pas recevoir de créatures aériennes !");
        }
        else if (creature instanceof Aquatique) {
            System.out.println("Un enclos ne peut pas recevoir de créatures aquatiques !");
        }
        else {
            creature.setEnclos(this);
            this.creatures.add(creature);
            this.setNombreDeCreatures(this.getNombreDeCreatures()+1);
        }
    }

    /**
     * Retirer une créature de l'enclos
     * @param creature
     */
    public void retirerCreature(Creature creature) {
        creature.setEnclos(null);
        this.creatures.remove(creature);
        this.setNombreDeCreatures(this.getNombreDeCreatures()-1);
    }

    public int compterCreaturesAffamees() {
        int compteur = 0;
        for (int i = 0 ; i < this.getNombreDeCreatures() ; ++i) {
            if (this.getCreatures().get(i).getFaim() == 1) {
                ++compteur;
            }
        }
        return compteur;
    }

    public int compterCreaturesTresAffamees() {
        int compteur = 0;
        for (int i = 0 ; i < this.getNombreDeCreatures() ; ++i) {
            if (this.getCreatures().get(i).getFaim() == 2) {
                ++compteur;
            }
        }
        return compteur;
    }

    public int compterCreaturesMalades() {
        int compteur = 0;
        for (int i = 0 ; i < this.getNombreDeCreatures() ; ++i) {
            if (this.getCreatures().get(i).getSante() == 1) {
                ++compteur;
            }
        }
        return compteur;
    }

    public int compterCreaturesTresMalades() {
        int compteur = 0;
        for (int i = 0 ; i < this.getNombreDeCreatures() ; ++i) {
            if (this.getCreatures().get(i).getSante() == 0) {
                ++compteur;
            }
        }
        return compteur;
    }

    /**
     * Pour afficher les caractéristiques de l'enclos
     * @return
     */
    public String afficherCaracteristiques() {
        return (this.getNom() + " :" +
                "\n Superficie : " + this.getSuperficie() + "m²" +
                "\n Capacité : " + this.getCapacite() + " créatures" +
                "\n Nombre de créatures : " + this.getNombreDeCreatures() +
                "\n " +
                "\n Propreté : " + this.etatProprete() +
                "\n " +
                "\n Nombre de créatures affamées : " + this.compterCreaturesAffamees() +
                "\n Nombre de créatures très affamées : " + this.compterCreaturesTresAffamees() +
                "\n " +
                "\n Nombre de créatures malades : " + compterCreaturesMalades() +
                "\n Nombre de créatures très malades : " + compterCreaturesTresMalades());
    }

    /**
     * Pour afficher les caractéristiques de toutes les créatures d'un enclos
     * @return
     */
    public ArrayList<String> afficherCaracteristiquesCreatures() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0 ; i < this.getNombreDeCreatures() ; ++i) {
            list.add(this.getCreatures().get(i).afficherCaracteristiques());
        }
        return list;
    }

    /**
     * Nourrir les créatures de l'enclos, mets leurs indicateurs de faim à 0
     */
    public void nourrirCreatures() {
        for (int i = 0 ; i < nombreDeCreatures ; ++i) {
            creatures.get(i).manger();
        }
    }

    /**
     * Nettoyer l'enclos, mets son indice de propreté à 2 (valeur de propreté max)
     */
    public void nettoyer() {
        this.setProprete(2);
    }

    /**
     * Salir l'enclos, baisse l'indice de propreté et empoisonne si = 0
     */
    public void salir() {
        if (!(this.getProprete() == 0)) {
            this.setProprete(this.getProprete()-1);
        }
        else {
            for (int i = 0 ; i < this.getNombreDeCreatures(); ++i) {
                this.getCreatures().get(i).empoisonner();
            }
        }
    }

    /**
     * Soigner les créatures de l'enclos
     */
    public void soigner() {
        for (int i = 0 ; i < nombreDeCreatures ; ++i) {
            creatures.get(i).soigner();
        }
    }
}
