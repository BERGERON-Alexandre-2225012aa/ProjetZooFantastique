package ga2.projetzoofantastique.models;

public class Sirene extends Vivipare implements Aquatique {
    /**
     * Constructeur de la classe SIrene
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param enclos
     */
    public Sirene(String nom, String sexe, double poids, double taille, Enclos enclos) {
        super(nom, sexe, poids, taille, enclos);
        this.tempsAvantNaissance = 9;
        this.porteeMinimum = 1;
        this.porteeMaximum = 3;
    }

    /**
     * Méthode pour mettre bas
     */
    @Override
    public void mettreBas() {
        //plus tard
    }

    /**
     * Methode pour nager
     */
    @Override
    public void nager() {
        System.out.println(this.getNom() + " nage");
    }
}
