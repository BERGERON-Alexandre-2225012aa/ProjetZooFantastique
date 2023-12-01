package ga2.projetzoofantastique.models.creatures;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests pour la classe Creature
 */
class CreatureTest {
    /**
     * Méthode de test pour le constructeur de Creature
     */
    @Test
    public void testConstructor(){
        // On crée la créature.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Creature creature = new Creature("Creature1", "male", 5, 0.5, enclos);

        // On crée les éléments auxquels les attributs de la créature doivent correspondre.
        String nom = "Creature1";
        String sexe = "male";
        double poids = 5;
        double taille = 0.5;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;

        // Les tests.
        assertEquals(nom, creature.getNom());
        assertEquals(sexe, creature.getSexe());
        assertEquals(poids, creature.getPoids());
        assertEquals(taille, creature.getTaille());
        assertEquals(age, creature.getAge());
        assertEquals(faim, creature.getFaim());
        assertEquals(sommeil, creature.isSommeil());
        assertEquals(sante, creature.getSante());
        assertEquals(enclos, creature.getEnclos());
    }

    /**
     * Méthode de test pour les getters de Creature
     */
    @Test
    public void testGetters(){
        // On crée la créature.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Creature creature = new Creature("Creature1", "male", 5, 0.5, enclos);

        // On crée les éléments auxquels les attributs de la créature doivent correspondre.
        String nom = "Creature1";
        String sexe = "male";
        double poids = 5;
        double taille = 0.5;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;

        // Les tests.
        assertEquals(nom, creature.getNom());
        assertEquals(sexe, creature.getSexe());
        assertEquals(poids, creature.getPoids());
        assertEquals(taille, creature.getTaille());
        assertEquals(age, creature.getAge());
        assertEquals(faim, creature.getFaim());
        assertEquals(sommeil, creature.isSommeil());
        assertEquals(sante, creature.getSante());
        assertEquals(enclos, creature.getEnclos());
    }

    /**
     * Méthode de test pour les setters de Creature
     */
    @Test
    public void testSetters() {
        // On crée la créature.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Creature creature = new Creature("Creature1", "male", 5, 0.5, enclos);

        Enclos enclos2 = new Enclos("Enclos2",200, 20);

        // On la modifie avec les setters.
        creature.setPoids(6);
        creature.setTaille(1);
        creature.setAge(10);
        creature.setFaim(1);
        creature.setSommeil(true);
        creature.setSante(1);
        creature.setEnclos(enclos2);

        // On crée les éléments auxquels les attributs de la créature doivent correspondre.
        String nom = "Creature1";
        String sexe = "male";
        double poids = 6;
        double taille = 1;
        int age = 10;
        int faim = 1;
        boolean sommeil = true;
        int sante = 1;

        // Les tests.
        assertEquals(nom, creature.getNom());
        assertEquals(sexe, creature.getSexe());
        assertEquals(poids, creature.getPoids());
        assertEquals(taille, creature.getTaille());
        assertEquals(age, creature.getAge());
        assertEquals(faim, creature.getFaim());
        assertEquals(sommeil, creature.isSommeil());
        assertEquals(sante, creature.getSante());
        assertEquals(enclos2, creature.getEnclos());
    }

    @Test
    public void testAfficherCaracteristiques() {
        //On crée la créature
        Maitre maitre = new Maitre("Mamadou", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo fou", maitre, 20);
        Enclos enclos = new Enclos("Enclos", 200, 20);
        Creature creature = new Creature("Creature", "male",10, 10, enclos);

        //On crée la valeur à vérifier
        String caracteristiquesCreature = ("Creature" + " :" +
                "\n Sexe : " + "male" +
                "\n Âge : " + "0" + " ans" +
                "\n Poids : " + "10.0" + " kg" +
                "\n Taille : " + "10.0" + " m" +
                "\n Faim : " + "rassasié" +
                "\n Sommeil : " + "réveillé" +
                "\n Santé : " + "bonne santé");
        //Test
        assertEquals(caracteristiquesCreature, creature.afficherCaracteristiques());
    }

    /**
     * Test manger
     */
    @Test
    public void testManger() {
        Enclos enclos = new Enclos("Enclos", 200, 20);
        Creature creature = new Creature("Creature", "male",10, 10, enclos);

        creature.setFaim(2);

        creature.manger();

        assertEquals(0, creature.getFaim());
    }

    /**
     * Test pour soigner une créature
     */
    @Test
    public void testSoigner() {
        Enclos enclos = new Enclos("Enclos", 200, 20);
        Creature creature = new Creature("Creature", "male",10, 10, enclos);

        creature.setSante(1);

        creature.soigner();

        assertEquals(2, creature.getSante());
    }

    /**
     * Test si la créature se réveille comme il faut
     */
    @Test
    public void testSeReveiller() {
        Enclos enclos = new Enclos("Enclos", 200, 20);
        Creature creature = new Creature("Creature", "male",10, 10, enclos);

        creature.setSommeil(true);

        creature.seReveiller();

        assertEquals(false, creature.isSommeil());
    }

    /**
     * Test si la créature s'endort bien
     */
    @Test
    public void testDormir() {
        Enclos enclos = new Enclos("Enclos", 200, 20);
        Creature creature = new Creature("Creature", "male",10, 10, enclos);

        creature.dormir();

        assertEquals(true, creature.isSommeil());
    }

    /**
     * Test si la créature vieillit correctement
     */
    @Test
    public void testVieillir() {
        Creature creature = new Creature("Jul meilleur rappeur", "male", 75, 1.80, null);

        creature.vieillir();

        assertEquals(1, creature.getAge());
    }

    /**
     * Test si la créature vieillit correctement
     */
    @Test
    public void testMourrir() {
        Creature creature = new Creature("Jul meilleur rappeur", "male", 75, 1.80, null);

        creature.vieillir();

        assertEquals(1, creature.getAge());
    }
}