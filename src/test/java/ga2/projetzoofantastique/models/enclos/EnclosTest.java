package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests pour la classe Enclos
 */
class EnclosTest {
    /**
     * Méthode de test du constructeur de la classe Enclos
     */
    @Test
    public void testConstructor() {
        //On crée l'enclos.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Enclos1";
        double superficie = 200;
        int capacite = 20;
        int nombreDeCreatures = 0;
        ArrayList<Creature> creatures = new ArrayList<>();
        int proprete = 2;

        // Les tests
        assertEquals(nom, enclos.getNom());
        assertEquals(superficie, enclos.getSuperficie());
        assertEquals(capacite, enclos.getCapacite());
        assertEquals(nombreDeCreatures, enclos.getNombreDeCreatures());
        assertEquals(creatures, enclos.getCreatures());
        assertEquals(proprete, enclos.getProprete());
        assertEquals(zooFantastique, enclos.getZooFantastique());
        assertEquals(null, enclos.getMeute());
    }

    /**
     * Méthode de test des getters de Enclos
     */
    @Test
    public void testGetters(){
        //On crée l'enclos.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Enclos1";
        double superficie = 200;
        int capacite = 20;
        int nombreDeCreatures = 0;
        ArrayList<Creature> creatures = new ArrayList<>();
        int proprete = 2;

        // Les tests
        assertEquals(nom, enclos.getNom());
        assertEquals(superficie, enclos.getSuperficie());
        assertEquals(capacite, enclos.getCapacite());
        assertEquals(nombreDeCreatures, enclos.getNombreDeCreatures());
        assertEquals(creatures, enclos.getCreatures());
        assertEquals(proprete, enclos.getProprete());
        assertEquals(zooFantastique, enclos.getZooFantastique());
        assertEquals(null, enclos.getMeute());
    }

    /**
     * Méthode de test des setters de Enclos
     */
    @Test
    public void testSetters(){
        //On crée l'enclos.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);

        Creature creature1 = new Creature("creature1", "male", 5, 0.5, enclos);
        Creature creature2 = new Creature("creature2", "male", 5, 0.5, enclos);
        Creature creature3 = new Creature("creature3", "male", 5, 0.5, enclos);
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(creature1);
        creatures.add(creature2);
        creatures.add(creature3);

        //On modifie avec les setters.
        enclos.setNombreDeCreatures(3);
        enclos.setCreatures(creatures);
        enclos.setProprete(1);
        enclos.setMeute(null);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Enclos1";
        double superficie = 200;
        int capacite = 20;
        int nombreDeCreatures = 3;
        int proprete = 1;

        // Les tests
        assertEquals(nom, enclos.getNom());
        assertEquals(superficie, enclos.getSuperficie());
        assertEquals(capacite, enclos.getCapacite());
        assertEquals(nombreDeCreatures, enclos.getNombreDeCreatures());
        assertEquals(creatures, enclos.getCreatures());
        assertEquals(proprete, enclos.getProprete());
        assertEquals(zooFantastique, enclos.getZooFantastique());
        assertEquals(null, enclos.getMeute());
    }

    /**
     * Test afficherCaracteristiques()
     */
    @Test
    public void testAfficherCaracteristiques() {
        // On crée l'enclos
        Maitre maitre = new Maitre("Jean", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo de fou", maitre, 20);
        Enclos enclos = new Enclos("Enclos de Zinzin", 200, 20, zooFantastique);

        // On crée les valeurs à vérifier
        String caracteristiquesEnclos = ("Enclos de Zinzin :" +
                "\n Superficie : 200.0" +
                "\n Capacité : 20" +
                "\n Nombre de créatures : 0" +
                "\n Propreté : 2");

        // Test
        assertEquals(caracteristiquesEnclos, enclos.afficherCaracteristiques());
    }

}