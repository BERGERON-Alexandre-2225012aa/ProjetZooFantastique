package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
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
        Voliere voliere = new Voliere("Voliere1", 200, 20, zooFantastique, 10);

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
        assertEquals(zooFantastique, voliere.getZooFantastique());
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
        Voliere voliere = new Voliere("Voliere1", 200, 20, zooFantastique, 10);

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
        assertEquals(zooFantastique, voliere.getZooFantastique());
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
        Voliere voliere = new Voliere("Voliere1", 200, 20, zooFantastique, 10);

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
        assertEquals(zooFantastique, voliere.getZooFantastique());
        assertNull(voliere.getMeute());
        assertEquals(propreteFond, voliere.getPropreteToit());
    }

}