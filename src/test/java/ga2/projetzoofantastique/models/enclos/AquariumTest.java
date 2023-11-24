package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.vivipares.Sirene;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests de la classe Aquarium
 */
class AquariumTest {

    /**
     * Méthode de test du constructeur de la classe Aquarium
     */
    @Test
    public void testConstructor() {
        //On crée l'enclos.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Aquarium aquarium = new Aquarium("Aquarium1", 200, 20, zooFantastique, 10);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Aquarium1";
        double superficie = 200;
        int capacite = 20;
        int nombreDeCreatures = 0;
        ArrayList<Creature> creatures = new ArrayList<>();
        int proprete = 2;
        double profondeur = 10;
        int salinite = 2;
        int propreteFond = 2;

        // Les tests
        assertEquals(nom, aquarium.getNom());
        assertEquals(superficie, aquarium.getSuperficie());
        assertEquals(capacite, aquarium.getCapacite());
        assertEquals(nombreDeCreatures, aquarium.getNombreDeCreatures());
        assertEquals(creatures, aquarium.getCreatures());
        assertEquals(proprete, aquarium.getProprete());
        assertEquals(zooFantastique, aquarium.getZooFantastique());
        assertNull(aquarium.getMeute());
        assertEquals(profondeur, aquarium.getProfondeur());
        assertEquals(salinite, aquarium.getSalinite());
        assertEquals(propreteFond, aquarium.getPropreteFond());
    }
    /**
     * Méthode de test du constructeur de la classe Aquarium
     */
    @Test
    public void testGetters() {
        //On crée l'aquarium.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Aquarium aquarium = new Aquarium("Aquarium1", 200, 20, zooFantastique, 10);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Aquarium1";
        double superficie = 200;
        int capacite = 20;
        int nombreDeCreatures = 0;
        ArrayList<Creature> creatures = new ArrayList<>();
        int proprete = 2;
        double profondeur = 10;
        int salinite = 2;
        int propreteFond = 2;

        // Les tests
        assertEquals(nom, aquarium.getNom());
        assertEquals(superficie, aquarium.getSuperficie());
        assertEquals(capacite, aquarium.getCapacite());
        assertEquals(nombreDeCreatures, aquarium.getNombreDeCreatures());
        assertEquals(creatures, aquarium.getCreatures());
        assertEquals(proprete, aquarium.getProprete());
        assertEquals(zooFantastique, aquarium.getZooFantastique());
        assertNull(aquarium.getMeute());
        assertEquals(profondeur, aquarium.getProfondeur());
        assertEquals(salinite, aquarium.getSalinite());
        assertEquals(propreteFond, aquarium.getPropreteFond());
    }

    /**
     * Méthode de test des setters de Aquarium
     */
    @Test
    public void testSetters(){
        //On crée l'aquarium.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Aquarium aquarium = new Aquarium("Aquarium1", 200, 20, zooFantastique, 10);

        Sirene sirene1 = new Sirene("Sirene1", "male", 5, 0.5, aquarium);
        Sirene sirene2 = new Sirene("Sirene2", "male", 5, 0.5, aquarium);
        Sirene sirene3 = new Sirene("Sirene3", "male", 5, 0.5, aquarium);
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(sirene1);
        creatures.add(sirene2);
        creatures.add(sirene3);

        //On modifie avec les setters.
        aquarium.setNombreDeCreatures(3);
        aquarium.setCreatures(creatures);
        aquarium.setProprete(1);
        aquarium.setSalinite(1);
        aquarium.setPropreteFond(1);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Aquarium1";
        double superficie = 200;
        int capacite = 20;
        int nombreDeCreatures = 3;
        int proprete = 1;
        int salinite = 1;
        int propreteFond = 1;

        // Les tests
        assertEquals(nom, aquarium.getNom());
        assertEquals(superficie, aquarium.getSuperficie());
        assertEquals(capacite, aquarium.getCapacite());
        assertEquals(nombreDeCreatures, aquarium.getNombreDeCreatures());
        assertEquals(creatures, aquarium.getCreatures());
        assertEquals(proprete, aquarium.getProprete());
        assertEquals(zooFantastique, aquarium.getZooFantastique());
        assertNull(aquarium.getMeute());
        assertEquals(salinite, aquarium.getSalinite());
        assertEquals(propreteFond, aquarium.getPropreteFond());
    }
}