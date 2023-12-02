package ga2.projetzoofantastique.models.colonies;

import ga2.projetzoofantastique.models.creatures.vivipares.Lycanthrope;
import ga2.projetzoofantastique.models.enclos.Enclos;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe Meute de lycanthropes
 */
public class Meute {
    /**
     * Rangs possibles pour un lycanthrope
     */
    public static String rangsPossibles = "αβγδεζηθικλμνξοπρστυφχψω";
    /**
     * Couple alpha de la meute
     */
    private CoupleAlpha coupleAlpha;
    /**
     * Liste des lycanthropes de la meute
     */
    private ArrayList<Lycanthrope> lycanthropes;
    /**
     * Enclos correspondant à la meute
     */
    private Enclos enclos;

    /**
     * Constructeur de la classe Meute
     * @param enclos
     */
    public Meute(Enclos enclos) {
        this.coupleAlpha = new CoupleAlpha();
        this.lycanthropes = new ArrayList<>();
        this.enclos = enclos;
        enclos.setMeute(this);
    }

    /**
     * Getter de l'enclos correspondant à la meute
     * @return
     */
    public Enclos getEnclos() {
        return enclos;
    }

    /**
     * Getter de la liste des lycanthropes de la meute
     * @return
     */
    public ArrayList<Lycanthrope> getLycanthropes() {
        return lycanthropes;
    }

    /**
     * Getter du couple alpha de la meute
     * @return
     */
    public CoupleAlpha getCoupleAlpha() {
        return coupleAlpha;
    }

    /**
     * Setter de la liste de lycanthropes
     * @param lycanthropes
     */
    public void setLycanthropes(ArrayList<Lycanthrope> lycanthropes) {
        this.lycanthropes = lycanthropes;
    }

    /**
     * Setter du couple alpha de la meute
     * @param coupleAlpha
     */
    public void setCoupleAlpha(CoupleAlpha coupleAlpha) {
        this.coupleAlpha = coupleAlpha;
    }

    /**
     * Ajouter un lycanthrope dans la meute
     * @param lycanthrope
     */
    public void ajouterLycanthrope(Lycanthrope lycanthrope) {
        this.lycanthropes.add(lycanthrope);
        lycanthrope.setMeute(this);
    }

    /**
     * Retirer un lycanthrope de la meute
     * @param lycanthrope
     */
    public void retirerLycanthrope(Lycanthrope lycanthrope) {
        this.lycanthropes.remove(lycanthrope);
        lycanthrope.setMeute(null);
    }

    /**
     * Affiche les caractéristiques de la meute
     * @return
     */
    public String afficherCaracteristiques() {
        return ("Meute de " + this.getEnclos().getNom() + " :" +
                "\n Couple alpha : " + this.getCoupleAlpha().getLycanthropeMale().getNom() + ", " + this.getCoupleAlpha().getLycanthropeFemelle().getNom());
    }

    /**
     * Affiche la liste des loups de la meute et leurs rangs
     * @return
     */
    public String afficherCaracteristiquesLycanthropes() {
        String nomsLycanthropes = "";
        for (int i = 0 ; i < this.getLycanthropes().size() ; i++) {
            nomsLycanthropes += this.getLycanthropes().get(i).getNom() + " (" + this.getLycanthropes().get(i).getRang() + ")\n";
        }
        return nomsLycanthropes;
    }

    /**
     * Renvoie le lycanthrope male le plus puissant de la meute
     * @return
     */
    public Lycanthrope lycanthropeMaleLePlusPuissant() {
        int indicateurMax = 0;
        int indicateur;
        Lycanthrope male = null;
        for (int i = 0 ; i < this.getLycanthropes().size() ; ++i) {
            if (this.getLycanthropes().get(i).getSexe() == "male") {
                indicateur = this.getLycanthropes().get(i).getForce() + this.getLycanthropes().get(i).getImpetuosite() + this.getLycanthropes().get(i).getFacteurDomination();
                if (indicateur > indicateurMax) {
                    indicateurMax = indicateur;
                    male = this.getLycanthropes().get(i);
                }
            }
        }
        if (indicateurMax == 0) {
            for (int i = 0 ; i < this.getLycanthropes().size() ; ++i) {
                if (this.getLycanthropes().get(i).getSexe() == "male") {
                    male = this.getLycanthropes().get(i);
                    return male;
                }
            }
        }
        return male;
    }

    /**
     * Renvoie le lycanthrope femelle le plus puissant de la meute
     * @return
     */
    public Lycanthrope lycanthropeFemelleLePlusPuissant() {
        int indicateurMax = 0;
        int indicateur;
        Lycanthrope femelle = null;
        for (int i = 0 ; i < this.getLycanthropes().size() ; ++i) {
            if (this.getLycanthropes().get(i).getSexe() == "femelle") {
                indicateur = this.getLycanthropes().get(i).getForce() + this.getLycanthropes().get(i).getImpetuosite() + this.getLycanthropes().get(i).getFacteurDomination();
                if (indicateur > indicateurMax) {
                    indicateurMax = indicateur;
                    femelle = this.getLycanthropes().get(i);
                }
            }
        }
        if (indicateurMax == 0) {
            for (int i = 0 ; i < this.getLycanthropes().size() ; ++i) {
                if (this.getLycanthropes().get(i).getSexe() == "femelle") {
                    femelle = this.getLycanthropes().get(i);
                    return femelle;
                }
            }
        }
        return femelle;
    }

    /**
     * Constituer le couple alpha de la meute
     */
    public void constituerCoupleAlpha() {
        Lycanthrope male = this.lycanthropeMaleLePlusPuissant();
        Lycanthrope femelle = this.lycanthropeFemelleLePlusPuissant();
        male.setRang('α');
        femelle.setRang('α');
        this.coupleAlpha.setLycanthropeMale(male);
        this.coupleAlpha.setLycanthropeFemelle(femelle);
    }

    /**
     * Créer une nouvelle hiérarchie
     */
    public void creerNouvelleHierarchie() {
        Random random = new Random();
        for (int i = 0 ; i < this.getLycanthropes().size() ; ++i) {
            int randomNombre = random.nextInt(Meute.rangsPossibles.length());
            this.getLycanthropes().get(i).setRang(Meute.rangsPossibles.charAt(randomNombre));
            this.getLycanthropes().get(i).setImpetuosite(randomNombre);
        }
        constituerCoupleAlpha();
    }

    /**
     * Lancer une reproduction dans la meute
     */
    public void lancerReproduction() {
        this.getCoupleAlpha().getLycanthropeFemelle().mettreBas();
    }

    /**
     * Equilibrer les rangs de la meute
     */
    public void decroitreRangs() {
        for (int i = 0 ; i < this.getLycanthropes().size() ; ++i) {
            if (this.getLycanthropes().get(i).getFacteurDomination() > 24) {
                this.getLycanthropes().get(i).setRang('α');
            }
            else {
                this.getLycanthropes().get(i).setRang(Meute.rangsPossibles.charAt((Meute.rangsPossibles.length()-this.getLycanthropes().get(i).getFacteurDomination())));
            }
        }
        declarerLycanthropesOmega();
        constituerCoupleAlpha();
    }

    /**
     * Déclare les lycanthropes dont la somme des indicateurs est inférieure ou égale à 10 comme lycanthropes ω
     */
    public void declarerLycanthropesOmega() {
        for (int i = 0 ; i < this.getLycanthropes().size() ; ++i) {
            Lycanthrope lycanthrope = this.getLycanthropes().get(i);
            int indicateur = lycanthrope.getImpetuosite() + lycanthrope.getForce() + lycanthrope.getFacteurDomination();
            if (indicateur <= 10) {
                lycanthrope.setRang('ω');
            }
        }
    }
}
