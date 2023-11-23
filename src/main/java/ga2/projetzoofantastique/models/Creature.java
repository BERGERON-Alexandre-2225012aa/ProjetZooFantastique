package ga2.projetzoofantastique.models;

/**
 * Classe Creature
 */
public class Creature {
    // Attributs
    /**
     * Nom de la Creature
     */
    private String nom;
    /**
     * Sexe de la Creature
     */
    private String sexe;
    /**
     * Poids de la Creature
     */
    private double poids;
    /**
     * Taille de la Creature
     */
    private double taille;
    /**
     * Age de la Creature
     */
    private int age;
    /**
     * Indicateur de faim de la Creature
     */
    private int faim;
    /**
     * Indicateur de sommeil de la Creature
     */
    private boolean sommeil;
    /**
     * Indicateur de santé de la Creature
     */
    private int sante;
    /**
     * Enclos de la Creature
     */
    private Enclos enclos;

    /**
     * Constructeur de la classe Creature
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param enclos
     */
    public Creature(String nom, String sexe, double poids, double taille, Enclos enclos) {
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = 0;
        this.faim = 0;
        this.sommeil = false;
        this.sante = 2;
        this.enclos = enclos;
    }
    // Getters

    /**
     * Getter du nom de la Creature
     * @return
     */
    public String getNom() {
        return nom;
    }
    /**
     * Getter du sexe de la Creature
     * @return
     */
    public String getSexe() {
        return sexe;
    }
    /**
     * Getter du poids de la Creature
     * @return
     */
    public double getPoids() {
        return poids;
    }
    /**
     * Getter de la taille de la Creature
     * @return
     */
    public double getTaille() {
        return taille;
    }

    /**
     * Getter de l'âge de la Creature
     * @return
     */
    public int getAge() {
        return age;
    }
    /**
     * Getter de l'indicateur de faim de la Creature
     * @return
     */
    public int getFaim() {
        return faim;
    }
    /**
     * Getter de l'indicateur de sommeil de la Creature
     * @return
     */
    public boolean isSommeil() {
        return sommeil;
    }
    /**
     * Getter de l'indicateur de santé de la Creature
     * @return
     */
    public int getSante() {
        return sante;
    }
    /**
     * Getter de l'enclos de la Creature
     * @return
     */
    public Enclos getEnclos() {
        return enclos;
    }

    // Setters

    /**
     * Setter du poids de la Creature
     * @param poids
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }
    /**
     * Setter de la taille de la Creature
     * @param taille
     */
    public void setTaille(double taille) {
        this.taille = taille;
    }

    /**
     * Setter de l'âge de la Creature
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Setter de l'indicateur de faim de la Creature
     * @param faim
     */
    public void setFaim(int faim) {
        this.faim = faim;
    }

    /**
     * Setter de l'indicateur de sommeil de la Creature
     * @param sommeil
     */
    public void setSommeil(boolean sommeil) {
        this.sommeil = sommeil;
    }

    /**
     * Setter de l'indicateur de santé de la Creature
     * @param sante
     */
    public void setSante(int sante) {
        this.sante = sante;
    }

    /**
     * Setter de l'enclos de la Creature
     * @param enclos
     */
    public void setEnclos(Enclos enclos) {
        this.enclos = enclos;
    }
}
