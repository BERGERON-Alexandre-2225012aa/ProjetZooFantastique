package ga2.projetzoofantastique.models;

import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test de la classe Maitre
 */
class MaitreTest {

    /**
     * Méthode de test du constructeur de Maitre
     */
    @Test
    public void testConstructor() {
        //On crée le maitre
        Maitre maitre = new Maitre("Jacques", "male");

        //On crée les valeurs à vérifier
        String nom = "Jacques";
        String sexe = "male";
        int age = 0;

        //Les tests.
        assertEquals(nom, maitre.getNom());
        assertEquals(sexe, maitre.getSexe());
        assertEquals(age, maitre.getAge());
    }

    /**
     * Méthode de test des Getters de Maitre
     */
    @Test
    public void testGetters() {
        //On crée le maitre
        Maitre maitre = new Maitre("Jacques", "male");

        //On crée les valeurs à vérifier
        String nom = "Jacques";
        String sexe = "male";
        int age = 0;

        //Les tests.
        assertEquals(nom, maitre.getNom());
        assertEquals(sexe, maitre.getSexe());
        assertEquals(age, maitre.getAge());
    }
    /**
     * Méthode de test des Setters de Maitre
     */
    @Test
    public void testSetters() {
        //On crée le maitre
        Maitre maitre = new Maitre("Jacques", "male");

        //On modifie quelques valeurs
        maitre.setAge(90);

        //On crée les valeurs à vérifier
        String nom = "Jacques";
        String sexe = "male";
        int age = 90;

        //Les tests.
        assertEquals(nom, maitre.getNom());
        assertEquals(sexe, maitre.getSexe());
        assertEquals(age, maitre.getAge());
    }
    /**
     * Méthode de test de examinerEnclos()
     */
    @Test
    public void testExaminerEnclos() {
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
                "\n Nombre de créatures affamées : 0"+
                "\n Nombre de créatures très affamées : 0" +
                "\n " +
                "\n Nombre de créatures malades : 0" +
                "\n Nombre de créatures très malades : 0");

        // On teste
        assertEquals(caracteristiquesEnclos, maitre.examinerEnclos(enclos));
    }
    /**
     * Méthode de test de nettoyerEnclos()
     */
    @Test
    public void testNettoyerEnclos() {
        //On crée l'enclos
        Maitre maitre = new Maitre("Mamadou", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo fou", maitre, 20);
        Enclos enclos = new Enclos("Enclos", 200, 20);

        //On modifie la valeur de propreté
        enclos.setProprete(0);

        //On nettoie
        maitre.nettoyerEnclos(enclos);

        //On teste
        assertEquals(2, enclos.getProprete());
    }

    /**
     * Méthode de test de nourrirEnclos()
     */
    @Test
    public void testNourrirEnclos() {
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
        maitre.nourrirEnclos(enclos);

        //Test
        for (int i = 0 ; i < enclos.getNombreDeCreatures() ; ++i) {
            assertEquals(0, enclos.getCreatures().get(i).getFaim());
        }
    }

    /**
     * Test du transfert de créatures
     */
    @Test
    public void testTransfererCreature() {
        //On crée les enclos
        Maitre maitre = new Maitre("Mamadou", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo fou", maitre, 20);
        Enclos enclos1 = new Enclos("Enclos1", 200, 20);
        Enclos enclos2 = new Enclos("Enclos1", 200, 20);

        //On crée la créature
        Creature creature1 = new Creature("Creature1", "male",10, 10, null);

        //On l'ajoute
        enclos1.ajouterCreature(creature1);

        //On la transfère
        maitre.transfererCreature(creature1, enclos2);

        //Valeurs à vérifier
        ArrayList<Creature> creaturesEnclos1 = new ArrayList<>();
        ArrayList<Creature> creaturesEnclos2 = new ArrayList<>();
        creaturesEnclos2.add(creature1);

        //On teste
        assertEquals(0, enclos1.getNombreDeCreatures());
        assertEquals(1, enclos2.getNombreDeCreatures());
        assertEquals(creaturesEnclos1, enclos1.getCreatures());
        assertEquals(creaturesEnclos2, enclos2.getCreatures());
    }

    /**
     * Test si le maitre vieillit correctement
     */
    @Test
    public void testVieillir() {
        Maitre maitre = new Maitre("Karim", "male");

        maitre.vieillir();

        assertEquals(1, maitre.getAge());
    }
}