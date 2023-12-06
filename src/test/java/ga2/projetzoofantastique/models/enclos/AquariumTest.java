package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.ovipares.Dragon;
import ga2.projetzoofantastique.models.creatures.ovipares.Kraken;
import ga2.projetzoofantastique.models.creatures.ovipares.Phenix;
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
        //On crée l'aquarium.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Aquarium aquarium = new Aquarium("Aquarium1", 200, 20, 10);

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
        assertNull(aquarium.getZooFantastique());
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
        Aquarium aquarium = new Aquarium("Aquarium1", 200, 20, 10);

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
        assertNull(aquarium.getZooFantastique());
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
        Aquarium aquarium = new Aquarium("Aquarium1", 200, 20, 10);

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
        assertNull(aquarium.getZooFantastique());
        assertNull(aquarium.getMeute());
        assertEquals(salinite, aquarium.getSalinite());
        assertEquals(propreteFond, aquarium.getPropreteFond());
    }

    /**
     * Test de l'ajout de créature dans un aquarium
     */
    @Test
    public void testAjouterCreature() {
        // On crée l'aquarium
        Maitre maitre = new Maitre("Jean", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo de fou", maitre, 20);
        Aquarium aquarium = new Aquarium("Aquarium de Zinzin", 200, 20, 10);

        //On crée la créature à ajouter
        Creature creature = new Creature("Creature", "male", 20, 20, null);
        Kraken kraken = new Kraken("Kraken", "male", 20, 20, null);
        Phenix phenix = new Phenix("Phenix", "male", 20, 20, null);
        Dragon dragon = new Dragon("Dragon", "male", 20, 20, null);

        //On ajoute
        aquarium.ajouterCreature(creature);
        aquarium.ajouterCreature(kraken);
        aquarium.ajouterCreature(phenix);
        aquarium.ajouterCreature(dragon);

        //Valeurs à vérifier
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(kraken);
        creatures.add(dragon);

        //On teste
        assertEquals(aquarium, kraken.getEnclos());
        assertEquals(aquarium, dragon.getEnclos());
        assertEquals(creatures, aquarium.getCreatures());
        assertEquals(2, aquarium.getNombreDeCreatures());
    }

    /**
     * Test afficherCaracteristiques()
     */
    @Test
    public void testAfficherCaracteristiques() {
        // On crée l'aquarium
        Maitre maitre = new Maitre("Jean", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo de fou", maitre, 20);
        Aquarium aquarium = new Aquarium("Aquarium de Zinzin", 200, 20, 10);

        // On crée les valeurs à vérifier
        String caracteristiquesEnclos = ("Aquarium de Zinzin :" +
                "\n Superficie : 200.0m²" +
                "\n Profondeur : 10.0m" +
                "\n Capacité : 20 créatures" +
                "\n Nombre de créatures : 0" +
                "\n " +
                "\n Propreté : propre" +
                "\n Propreté du fond : propre" +
                "\n " +
                "\n Salinité : correcte" +
                "\n " +
                "\n Nombre de créatures affamées : 0"+
                "\n Nombre de créatures très affamées : 0" +
                "\n " +
                "\n Nombre de créatures malades : 0" +
                "\n Nombre de créatures très malades : 0");

        // Test
        assertEquals(caracteristiquesEnclos, aquarium.afficherCaracteristiques());
    }

    /**
     * Test de la méthode nettoyer
     */
    @Test
    public void testNettoyer() {
        //On crée l'aquarium
        Maitre maitre = new Maitre("Mamadou", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo fou", maitre, 20);
        Aquarium aquarium = new Aquarium("Aquarium de zinzin", 200, 20, 20);

        //On modifie la valeur de propreté
        aquarium.setProprete(0);
        aquarium.setPropreteFond(0);

        //On nettoie
        aquarium.nettoyer();

        //On teste
        assertEquals(2, aquarium.getProprete());
        assertEquals(2, aquarium.getPropreteFond());
    }

    /**
     * Test de la méthode saliniser
     */
    @Test
    public void testSaliniser() {
        //On crée l'aquarium
        Maitre maitre = new Maitre("Mamadou", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo fou", maitre, 20);
        Aquarium aquarium = new Aquarium("Aquarium de zinzin", 200, 20, 20);

        //On modifie la valeur de salinité
        aquarium.setSalinite(0);

        //On remet correctement
        aquarium.saliniser();

        //On teste
        assertEquals(2, aquarium.getSalinite());
    }
}