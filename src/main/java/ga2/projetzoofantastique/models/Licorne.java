package ga2.projetzoofantastique.models;

public class Licorne extends Vivipare implements Terrestre {
    //Attributs

    /**
     * Constructeur de la classe Licorne
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param enclos
     * @param tempsAvantNaissance
     */
    public Licorne(String nom, String sexe, double poids, double taille, Enclos enclos, int tempsAvantNaissance) {
        super(nom, sexe, poids, taille, enclos);
    }

    /**
     * Méthode pour accouher
     */
    @Override
    public void mettreBas() {
        //plus tard
    }

    /**
     * Methode pour courir
     */
    @Override
    public void courir() {
        System.out.println(this.getNom() + " court");
    }
}
