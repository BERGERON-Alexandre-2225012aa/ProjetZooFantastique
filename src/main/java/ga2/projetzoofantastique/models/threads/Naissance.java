package ga2.projetzoofantastique.models.threads;

import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.ovipares.Dragon;
import ga2.projetzoofantastique.models.creatures.ovipares.Kraken;
import ga2.projetzoofantastique.models.creatures.ovipares.Megalodon;
import ga2.projetzoofantastique.models.creatures.ovipares.Phenix;
import ga2.projetzoofantastique.models.creatures.vivipares.Licorne;
import ga2.projetzoofantastique.models.creatures.vivipares.Lycanthrope;
import ga2.projetzoofantastique.models.creatures.vivipares.Nymphe;
import ga2.projetzoofantastique.models.creatures.vivipares.Sirene;

import java.text.DecimalFormat;
import java.util.Random;

public class Naissance extends Thread {
    private int tempsAvantNaissance;
    private Creature creatureParent;
    public Naissance(int tempsAvantNaissance, Creature creatureParent) {
        this.tempsAvantNaissance = tempsAvantNaissance;
        this.creatureParent = creatureParent;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000 *tempsAvantNaissance);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Creature creature = null;

        Random random = new Random();
        int valeurSexe = random.nextInt(2);
        String sexe;
        if (valeurSexe == 0) {
            sexe = "male";
        }
        else {
            sexe = "femelle";
        }

        if (creatureParent instanceof Licorne) {
            double poids = Math.round(random.nextDouble(50, 100) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(1, 2) * 100.0) / 100.0;
            creature = new Licorne("Licorne" + Licorne.getNombreTotal(), sexe, poids, taille, null);
        }
        else if (creatureParent instanceof Lycanthrope) {
            double poids = Math.round(random.nextDouble(50, 100) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(1, 2) * 100.0) / 100.0;
            creature = new Lycanthrope("Lycanthrope" + Lycanthrope.getNombreTotal(), sexe, poids, taille, null);
        }
        else if (creatureParent instanceof Nymphe) {
            double poids = Math.round(random.nextDouble(30, 50) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(0.50, 1.50) * 100.0) / 100.0;
            creature = new Nymphe("Nymphe" + Nymphe.getNombreTotal(), sexe, poids, taille, null);
        }
        else if (creatureParent instanceof Sirene) {
            double poids = Math.round(random.nextDouble(50, 80) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(0.50, 1.50) * 100.0) / 100.0;
            creature = new Sirene("Sirène" + Sirene.getNombreTotal(), sexe, poids, taille, null);
        }
        else if (creatureParent instanceof Dragon) {
            double poids = Math.round(random.nextDouble(100, 400) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(3, 9) * 100.0) / 100.0;
            creature = new Dragon("Dragon" + Dragon.getNombreTotal(), sexe, poids, taille, null);
        }
        else if (creatureParent instanceof Kraken) {
            double poids = Math.round(random.nextDouble(150, 300) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(5, 15) * 100.0) / 100.0;
            creature = new Kraken("Kraken" + Kraken.getNombreTotal(), sexe, poids, taille, null);
        }
        else if (creatureParent instanceof Megalodon) {
            double poids = Math.round(random.nextDouble(150, 200) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(5, 7) * 100.0) / 100.0;
            creature = new Megalodon("Megalodon" + Megalodon.getNombreTotal(), sexe, poids, taille, null);
        }
        else if (creatureParent instanceof Phenix) {
            double poids = Math.round(random.nextDouble(40, 60) * 100.0) / 100.0;
            double taille = Math.round(random.nextDouble(2, 5) * 100.0) / 100.0;
            creature = new Phenix("Phenix" + Phenix.getNombreTotal(), sexe, poids, taille, null);
        }

        if (creatureParent.getEnclos().getNombreDeCreatures() < creatureParent.getEnclos().getCapacite()) {
            creatureParent.getEnclos().ajouterCreature(creature);
        }
        else {
            creature.mourrir();
        }
    }
}
