package ga2.projetzoofantastique.models;

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

    public String examinerEnclos(Enclos enclos) {
        return enclos.afficherCaracteristiques() +
                "\n " +
                "\n ";
    }
}
