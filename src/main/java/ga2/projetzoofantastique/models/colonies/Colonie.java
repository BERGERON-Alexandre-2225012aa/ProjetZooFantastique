package ga2.projetzoofantastique.models.colonies;

import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.vivipares.Lycanthrope;
import ga2.projetzoofantastique.models.threads.LycanthropesSimulation;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe Colonie
 */
public class Colonie {
    /**
     * Mois de l'année
     */
    private int mois;
    /**
     * Liste des meutes de la colonie
     */
    private ArrayList<Meute> meutes;

    /**
     * Constructeur de la classe Colonie
     */
    public Colonie() {
        this.meutes = new ArrayList<>();
        this.mois = 0;
    }

    /**
     * Getter de liste des meutes de la colonie
     * @return
     */
    public ArrayList<Meute> getMeutes() {
        return meutes;
    }

    /**
     * Setter de la liste des meutes de la colonie
     * @param meutes
     */
    public void setMeutes(ArrayList<Meute> meutes) {
        this.meutes = meutes;
    }

    /**
     * Ajouter une meute à la colonie
     * @param meute
     */
    public void ajouterMeute(Meute meute) {
        this.meutes.add(meute);
    }

    /**
     * Retourne la liste de tous les lycanthropes de la colonie
     * @return
     */
    public ArrayList<Lycanthrope> afficherLycanthropes() {
        ArrayList<Lycanthrope> lycanthropes = new ArrayList<>();
        for (int i = 0 ; i < this.getMeutes().size() ; ++i) {
            for (int j = 0 ; j < this.getMeutes().get(i).getLycanthropes().size() ; ++j) {
                lycanthropes.add(this.getMeutes().get(i).getLycanthropes().get(j));
            }
        }
        return lycanthropes;
    }

    /**
     * Crée de nouvelles hiérarchies à travers toute la colonie
     */
    public void faireEvoluerHierarchies() {
        for (int i = 0 ; i < this.getMeutes().size() ; ++i) {
            this.getMeutes().get(i).creerNouvelleHierarchie();
        }
    }

    /**
     * Transforme certains lycanthropes de la colonie en humains (1 chance sur 50)
     */
    public void transformerCertainsLycanthropes() {
        Random random = new Random();
        int randomNombre = 0;
        for (int i = 0 ; i < this.getMeutes().size() ; ++i) {
            for (int j = 0 ; j < this.getMeutes().get(i).getLycanthropes().size() ; ++j) {
                if (!(this.getMeutes().get(i).getLycanthropes().get(j) == this.getMeutes().get(i).getCoupleAlpha().getLycanthropeMale() ||
                        this.getMeutes().get(i).getLycanthropes().get(j) == this.getMeutes().get(i).getCoupleAlpha().getLycanthropeFemelle())) {
                    randomNombre = random.nextInt(50);
                    if (randomNombre == 0) {
                        this.getMeutes().get(i).getLycanthropes().get(j).devenirHumain();
                    }
                }

            }
        }
    }

    /**
     * Enlève certains lycanthropes omega de leurs meutes (1 chance sur 25)
     */
    public void faireQuitterCertainsLycanthropesOmega() {
        Random random = new Random();
        int randomNombre = 0;
        for (int i = 0 ; i < this.getMeutes().size() ; ++i) {
            for (int j = 0 ; j < this.getMeutes().get(i).getLycanthropes().size() ; ++j) {
                if (this.getMeutes().get(i).getLycanthropes().get(j).getRang() == 'ω') {
                    randomNombre = random.nextInt(25);
                    if (randomNombre == 0) {
                        this.getMeutes().get(i).getLycanthropes().get(j).quitterMeute();
                    }
                }
            }
        }
    }

    /**
     * Fais vieillir tous les lycanthropes de 1 an
     */
    public void faireVieillirLycanthropes() {
        for (int i = 0 ; i < this.getMeutes().size() ; ++i) {
            for (int j = 0 ; j < this.getMeutes().get(i).getLycanthropes().size() ; ++j) {
                Lycanthrope lycanthrope = this.getMeutes().get(i).getLycanthropes().get(j);
                lycanthrope.setAge(lycanthrope.getAge() + 1);
            }
        }
    }

    /**
     * Ajoute un mois à la date
     */
    public void ajouterMois() {
        if (this.mois == 12) {
            this.mois = 0;
        }
        else {
            this.mois += 1;
        }
    }

    /**
     * Vérifie si c'est la saison des amours : si c'est le cas, reproduction.
     */
    public void verifierSiSaisonAmour() {
        for (int i = 0 ; i < Lycanthrope.moisSaisonAmour.size() ; ++i) {
            if (Lycanthrope.moisSaisonAmour.get(i) == this.mois) {
                for (int j = 0 ; j < this.getMeutes().size(); ++j) {
                    this.getMeutes().get(j).lancerReproduction();
                }
            }
        }
    }

    /**
     * Génère aléatoirement des hurlements à travers les meutes (1 chance sur 12 d'émettre un hurlement de domination et 1 chance sur 12 d'émettre un hurlement d'appartenance)
     */
    public void genererHurlements() {
        Random random = new Random();
        int randomNombre = 0;
        for (int i = 0 ; i < this.getMeutes().size() ; ++i) {
            for (int j = 0 ; j < this.getMeutes().get(i).getLycanthropes().size() ; ++j) {
                randomNombre = random.nextInt(12);
                if (randomNombre == 0) {
                    this.getMeutes().get(i).getLycanthropes().get(j).emettreSon(new Hurlement("domination", this.getMeutes().get(i)));
                }
                else if (randomNombre == 1) {
                    this.getMeutes().get(i).getLycanthropes().get(j).emettreSon(new Hurlement("appartenance", this.getMeutes().get(i)));
                }
            }
        }
    }

    /**
     * Mets tous les lycanthropes de l'enclos dans la meute si celle-ci comporte moins de 2 lycanthropes
     */
    public void verifierSiBesoinCreerMeute() {
        for (int i = 0 ; i < this.getMeutes().size() ; ++i) {
            if (this.getMeutes().get(i).getLycanthropes().size() < 2) {
                for (int j = 0 ; j < this.getMeutes().get(i).getLycanthropes().size() ; ++j) {
                    this.getMeutes().get(i).retirerLycanthrope(this.getMeutes().get(i).getLycanthropes().get(j));
                }
                for (int j = 0 ; j < this.getMeutes().get(i).getEnclos().getCreatures().size() ; ++j) {
                    this.getMeutes().get(i).ajouterLycanthrope((Lycanthrope) this.getMeutes().get(i).getEnclos().getCreatures().get(j));
                }
            }
        }
    }

    /**
     * Lance la simulation des lycanthropes
     */
    public void lancerSimulationLycanthropes() {
        LycanthropesSimulation lycanthropesSimulation = new LycanthropesSimulation(this);
        lycanthropesSimulation.start();
    }
}
