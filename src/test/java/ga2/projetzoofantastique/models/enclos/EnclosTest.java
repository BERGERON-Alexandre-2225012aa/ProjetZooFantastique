package ga2.projetzoofantastique.models.enclos;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.ovipares.Dragon;
import ga2.projetzoofantastique.models.creatures.ovipares.Kraken;
import ga2.projetzoofantastique.models.creatures.ovipares.Phenix;
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
        Enclos enclos = new Enclos("Enclos1", 200, 20);

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
        assertNull(enclos.getZooFantastique());
        assertNull(enclos.getMeute());
    }

    /**
     * Méthode de test des getters de Enclos
     */
    @Test
    public void testGetters(){
        //On crée l'enclos.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Enclos enclos = new Enclos("Enclos1", 200, 20);

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
        assertNull(enclos.getMeute());
    }

    /**
     * Méthode de test des setters de Enclos
     */
    @Test
    public void testSetters(){
        //On crée l'enclos.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 5);
        Enclos enclos = new Enclos("Enclos1", 200, 20);

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
        assertNull(enclos.getZooFantastique());
        assertNull(enclos.getMeute());
    }

    /**
     * Test de l'ajout d'une créature dans un enclos
     */
    @Test
    public void testAjouterCreature() {
        // On crée l'enclos
        Maitre maitre = new Maitre("Jean", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo de fou", maitre, 20);
        Enclos enclos = new Enclos("Enclos de Zinzin", 200, 20);

        //On crée la créature à ajouter
        Creature creature = new Creature("Creature", "male", 20, 20, null);
        Kraken kraken = new Kraken("Kraken", "male", 20, 20, null);
        Phenix phenix = new Phenix("Phenix", "male", 20, 20, null);
        Dragon dragon = new Dragon("Dragon", "male", 20, 20, null);

        //On ajoute
        enclos.ajouterCreature(creature);
        enclos.ajouterCreature(kraken);
        enclos.ajouterCreature(phenix);
        enclos.ajouterCreature(dragon);

        //Valeurs à vérifier
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(creature);
        creatures.add(dragon);

        //On teste
        assertEquals(enclos, creature.getEnclos());
        assertEquals(enclos, dragon.getEnclos());
        assertEquals(creatures, enclos.getCreatures());
        assertEquals(2, enclos.getNombreDeCreatures());
    }

    @Test
    public void testRetirerCreature() {
        // On crée l'enclos
        Maitre maitre = new Maitre("Jean", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo de fou", maitre, 20);
        Enclos enclos = new Enclos("Enclos de Zinzin", 200, 20);

        //On crée la créature à ajouter
        Creature creature = new Creature("Creature", "male", 20, 20, null);

        //On ajoute
        enclos.ajouterCreature(creature);

        //On retire
        enclos.retirerCreature(creature);

        //Valeurs à vérifier
        ArrayList<Creature> creatures = new ArrayList<>();

        //On teste
        assertNull(creature.getEnclos());
        assertEquals(creatures, enclos.getCreatures());
        assertEquals(0, enclos.getNombreDeCreatures());
    }

    /**
     * Test afficherCaracteristiques()
     */
    @Test
    public void testAfficherCaracteristiques() {
        // On crée l'enclos
        Maitre maitre = new Maitre("Jean", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo de fou", maitre, 20);
        Enclos enclos = new Enclos("Enclos de Zinzin", 200, 20);

        // On crée les valeurs à vérifier
        String caracteristiquesEnclos = ("Enclos de Zinzin :" +
                "\n Superficie : 200.0m²" +
                "\n Capacité : 20 créatures" +
                "\n Nombre de créatures : 0" +
                "\n " +
                "\n Propreté : propre" +
                "\n " +
                "\n Nombre de créatures affamés : 0"+
                "\n Nombre de créatures très affamées : 0");

        // Test
        assertEquals(caracteristiquesEnclos, enclos.afficherCaracteristiques());
    }

    /**
     * Test pour afficher toutes les caractéristiques des créatures d'un enclos
     */
    @Test
    public void testAfficherCaracteristiquesCreatures() {
        //On crée la créature
        Maitre maitre = new Maitre("Mamadou", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo fou", maitre, 20);
        Enclos enclos = new Enclos("Enclos", 200, 20);
        Creature creature = new Creature("Creature", "male",10, 10, null);

        //On l'ajoute dans l'enclos
        enclos.ajouterCreature(creature);

        //On crée la valeur à vérifier
        String caracteristiquesCreature = ("Creature" + " :" +
                "\n Sexe : " + "male" +
                "\n Âge : " + "0" + " ans" +
                "\n Poids : " + "10.0" + " kg" +
                "\n Taille : " + "10.0" + " m" +
                "\n Faim : " + "rassasié" +
                "\n Sommeil : " + "réveillé" +
                "\n Santé : " + "bonne santé");

        ArrayList<String> listeCaracteristiquesCreatures = new ArrayList<>();
        listeCaracteristiquesCreatures.add(caracteristiquesCreature);

        //Test
        assertEquals(listeCaracteristiquesCreatures, enclos.afficherCaracteristiquesCreatures());
    }

    /**
     * Test de la méthode nourrir
     */
    @Test
    public void testNourrirCreatures() {
        //On crée l'enclos
        Maitre maitre = new Maitre("Mamadou", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo fou", maitre, 20);
        Enclos enclos = new Enclos("Enclos", 200, 20);

        //On crée les créatures
        Creature creature1 = new Creature("Creature1", "male",10, 10, null);
        Creature creature2 = new Creature("Creature2", "male",10, 10, null);
        Creature creature3 = new Creature("Creature3", "male",10, 10, null);

        //On les ajoute
        enclos.ajouterCreature(creature1);
        enclos.ajouterCreature(creature2);
        enclos.ajouterCreature(creature3);

        //On modifie la valeur de faim
        creature1.setFaim(2);
        creature2.setFaim(2);
        creature3.setFaim(2);

        //On remet à 0
        enclos.nourrirCreatures();

        //Test
        for (int i = 0 ; i < enclos.getNombreDeCreatures() ; ++i) {
            assertEquals(0, enclos.getCreatures().get(i).getFaim());
        }
    }

    /**
     * Test de la méthode nettoyer
     */
    @Test
    public void testNettoyer() {
        //On crée l'enclos
        Maitre maitre = new Maitre("Mamadou", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo fou", maitre, 20);
        Enclos enclos = new Enclos("Enclos", 200, 20);

        //On modifie la valeur de propreté
        enclos.setProprete(0);

        //On nettoie
        enclos.nettoyer();

        //On teste
        assertEquals(2, enclos.getProprete());
    }

}