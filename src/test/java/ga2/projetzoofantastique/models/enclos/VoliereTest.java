package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.ovipares.Dragon;
import ga2.projetzoofantastique.models.creatures.ovipares.Kraken;
import ga2.projetzoofantastique.models.creatures.ovipares.Phenix;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VoliereTest {

    /**
     * Méthode de test du constructeur de la classe Voliere
     */
    @Test
    public void testConstructor() {
        //On crée la volière.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Voliere voliere = new Voliere("Voliere1", 200, 20, 10);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Voliere1";
        double superficie = 200;
        int capacite = 20;
        int nombreDeCreatures = 0;
        ArrayList<Creature> creatures = new ArrayList<>();
        int proprete = 2;
        double hauteur = 10;
        int propreteToit = 2;

        // Les tests
        assertEquals(nom, voliere.getNom());
        assertEquals(superficie, voliere.getSuperficie());
        assertEquals(capacite, voliere.getCapacite());
        assertEquals(nombreDeCreatures, voliere.getNombreDeCreatures());
        assertEquals(creatures, voliere.getCreatures());
        assertEquals(proprete, voliere.getProprete());
        assertNull(voliere.getZooFantastique());
        assertNull(voliere.getMeute());
        assertEquals(hauteur, voliere.getHauteur());
        assertEquals(propreteToit, voliere.getPropreteToit());
    }
    /**
     * Méthode de test du constructeur de la classe Voliere
     */
    @Test
    public void testGetters() {
        //On crée la volière.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Voliere voliere = new Voliere("Voliere1", 200, 20, 10);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Voliere1";
        double superficie = 200;
        int capacite = 20;
        int nombreDeCreatures = 0;
        ArrayList<Creature> creatures = new ArrayList<>();
        int proprete = 2;
        double hauteur = 10;
        int propreteToit = 2;

        // Les tests
        assertEquals(nom, voliere.getNom());
        assertEquals(superficie, voliere.getSuperficie());
        assertEquals(capacite, voliere.getCapacite());
        assertEquals(nombreDeCreatures, voliere.getNombreDeCreatures());
        assertEquals(creatures, voliere.getCreatures());
        assertEquals(proprete, voliere.getProprete());
        assertNull(voliere.getZooFantastique());
        assertNull(voliere.getMeute());
        assertEquals(hauteur, voliere.getHauteur());
        assertEquals(propreteToit, voliere.getPropreteToit());
    }

    /**
     * Méthode de test des setters de Voliere
     */
    @Test
    public void testSetters(){
        //On crée la volière.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Voliere voliere = new Voliere("Voliere1", 200, 20, 10);

        Phenix phenix1 = new Phenix("Sirene1", "male", 5, 0.5, voliere);
        Phenix phenix2 = new Phenix("Sirene2", "male", 5, 0.5, voliere);
        Phenix phenix3 = new Phenix("Sirene3", "male", 5, 0.5, voliere);
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(phenix1);
        creatures.add(phenix2);
        creatures.add(phenix3);

        //On modifie avec les setters.
        voliere.setNombreDeCreatures(3);
        voliere.setCreatures(creatures);
        voliere.setProprete(1);
        voliere.setPropreteToit(1);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Voliere1";
        double superficie = 200;
        int capacite = 20;
        int nombreDeCreatures = 3;
        int proprete = 1;
        int salinite = 1;
        int propreteFond = 1;

        // Les tests
        assertEquals(nom, voliere.getNom());
        assertEquals(superficie, voliere.getSuperficie());
        assertEquals(capacite, voliere.getCapacite());
        assertEquals(nombreDeCreatures, voliere.getNombreDeCreatures());
        assertEquals(creatures, voliere.getCreatures());
        assertEquals(proprete, voliere.getProprete());
        assertNull(voliere.getZooFantastique());
        assertNull(voliere.getMeute());
        assertEquals(propreteFond, voliere.getPropreteToit());
    }

    /**
     * Test de l'ajout de créature dans un volière
     */
    @Test
    public void testAjouterCreature() {
        // On crée la volière
        Maitre maitre = new Maitre("Jean", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo de fou", maitre, 20);
        Voliere voliere = new Voliere("Volière de Zinzin", 200, 20, 10);

        //On crée la créature à ajouter
        Creature creature = new Creature("Creature", "male", 20, 20, null);
        Kraken kraken = new Kraken("Kraken", "male", 20, 20, null);
        Phenix phenix = new Phenix("Phenix", "male", 20, 20, null);
        Dragon dragon = new Dragon("Dragon", "male", 20, 20, null);

        //On ajoute
        voliere.ajouterCreature(creature);
        voliere.ajouterCreature(kraken);
        voliere.ajouterCreature(phenix);
        voliere.ajouterCreature(dragon);

        //Valeurs à vérifier
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(phenix);
        creatures.add(dragon);

        //On teste
        assertEquals(voliere, phenix.getEnclos());
        assertEquals(voliere, dragon.getEnclos());
        assertEquals(creatures, voliere.getCreatures());
        assertEquals(2, voliere.getNombreDeCreatures());
    }

    /**
     * Test afficherCaracteristiques()
     */
    @Test
    public void testAfficherCaracteristiques() {
        // On crée la volière
        Maitre maitre = new Maitre("Jean", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo de fou", maitre, 20);
        Voliere voliere = new Voliere("Voliere de Zinzin", 200, 20, 10);

        // On crée les valeurs à vérifier
        String caracteristiquesEnclos = ("Voliere de Zinzin :" +
                "\n Superficie : 200.0m²" +
                "\n Hauteur : 10.0m" +
                "\n Capacité : 20 créatures" +
                "\n Nombre de créatures : 0" +
                "\n " +
                "\n Propreté : propre" +
                "\n Propreté du toit : propre" +
                "\n " +
                "\n Nombre de créatures affamés : 0"+
                "\n Nombre de créatures très affamées : 0" +
                "\n " +
                "\n Nombre de créatures malades : 0" +
                "\n Nombre de créatures très malades : 0");

        // Test
        assertEquals(caracteristiquesEnclos, voliere.afficherCaracteristiques());
    }

    /**
     * Test de la méthode nettoyer
     */
    @Test
    public void testNettoyer() {
        //On crée la volière
        Maitre maitre = new Maitre("Mamadou", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo fou", maitre, 20);
        Voliere voliere = new Voliere("Volière de zinzin", 200, 20, 20);

        //On modifie la valeur de propreté
        voliere.setProprete(0);
        voliere.setPropreteToit(0);

        //On nettoie
        voliere.nettoyer();

        //On teste
        assertEquals(2, voliere.getProprete());
        assertEquals(2, voliere.getPropreteToit());
    }

}