package ga2.projetzoofantastique.models.threads;

import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.vivipares.Licorne;
import ga2.projetzoofantastique.models.creatures.vivipares.Lycanthrope;
import ga2.projetzoofantastique.models.creatures.vivipares.Nymphe;

import java.text.DecimalFormat;
import java.util.Random;

public class Naissance extends Thread {
    private int tempsAvantNaissance;
    private Creature creature;
    public Naissance(int tempsAvantNaissance, Creature creature) {
        this.tempsAvantNaissance = tempsAvantNaissance;
        this.creature = creature;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000 *tempsAvantNaissance);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Random random = new Random();
        int valeurSexe = random.nextInt(2);
        String sexe;
        if (valeurSexe == 0) {
            sexe = "male";
        }
        else {
            sexe = "femelle";
        }

        if (creature instanceof Licorne) {
            double poids = Math.round(random.nextDouble(50, 100) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(1, 2) * 100.0) / 100.0;
            Creature creature = new Licorne("Licorne" + Licorne.getNombreTotal()+1, sexe, poids, taille, null);
        }
        else if (creature instanceof Lycanthrope) {
            double poids = Math.round(random.nextDouble(50, 100) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(1, 2) * 100.0) / 100.0;
            Creature creature = new Lycanthrope("Lycanthrope" + Lycanthrope.getNombreTotal()+1, sexe, poids, taille, null);
        }
        else if (creature instanceof Nymphe) {
            // CONTINUER
        }
    }

    public static void main(String[] args) {
        Creature licorne = new Licorne("Licorne", "male", 20, 20,null);
        Naissance naissance = new Naissance(1, licorne);
        naissance.start();
    }
}
