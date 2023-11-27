package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests de la classe Lycanthrope
 */
class LycanthropeTest {

    /**
     * Test du constructeur de la classe Lycanthrope
     */
    @Test
    public void testConstructor(){
        // On crée le lycanthrope.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Lycanthrope lycanthrope = new Lycanthrope("Lycanthrope", "male", 25, 5, enclos);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Lycanthrope";
        String sexe = "male";
        double poids = 25;
        double taille = 5;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 9;
        int porteeMinimum = 1;
        int porteeMaximum = 7;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(4);
        moisSaisonAmour.add(5);
        moisSaisonAmour.add(6);
        int force = 0;
        int impetuosite = 0;
        char rang = 'γ';
        int facteurDomination = 0;

        // Les tests.
        assertEquals(nom, lycanthrope.getNom());
        assertEquals(sexe, lycanthrope.getSexe());
        assertEquals(poids, lycanthrope.getPoids());
        assertEquals(taille, lycanthrope.getTaille());
        assertEquals(age, lycanthrope.getAge());
        assertEquals(faim, lycanthrope.getFaim());
        assertEquals(sommeil, lycanthrope.isSommeil());
        assertEquals(sante, lycanthrope.getSante());
        assertEquals(enclos, lycanthrope.getEnclos());
        assertEquals(tempsAvantNaissance, lycanthrope.getTempsAvantNaissance());
        assertEquals(porteeMinimum, lycanthrope.getPorteeMinimum());
        assertEquals(porteeMaximum, lycanthrope.getPorteeMaximum());
        assertEquals(moisSaisonAmour, lycanthrope.getMoisSaisonAmour());
        assertNull(lycanthrope.getMeute());
        assertNull(lycanthrope.getApparenceHumaine());
        assertEquals(facteurDomination, lycanthrope.getFacteurDomination());
        assertEquals(force, lycanthrope.getForce());
        assertEquals(impetuosite, lycanthrope.getImpetuosite());
        assertEquals(rang, lycanthrope.getRang());
    }

    /**
     * Test des Getters de la classe Lycanthrope
     */
    @Test
    public void testGetters(){
        // On crée le lycanthrope.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Lycanthrope lycanthrope = new Lycanthrope("Lycanthrope", "male", 25, 5, enclos);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Lycanthrope";
        String sexe = "male";
        double poids = 25;
        double taille = 5;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 9;
        int porteeMinimum = 1;
        int porteeMaximum = 7;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(4);
        moisSaisonAmour.add(5);
        moisSaisonAmour.add(6);
        int force = 0;
        int impetuosite = 0;
        char rang = 'γ';
        int facteurDomination = 0;

        // Les tests.
        assertEquals(nom, lycanthrope.getNom());
        assertEquals(sexe, lycanthrope.getSexe());
        assertEquals(poids, lycanthrope.getPoids());
        assertEquals(taille, lycanthrope.getTaille());
        assertEquals(age, lycanthrope.getAge());
        assertEquals(faim, lycanthrope.getFaim());
        assertEquals(sommeil, lycanthrope.isSommeil());
        assertEquals(sante, lycanthrope.getSante());
        assertEquals(enclos, lycanthrope.getEnclos());
        assertEquals(tempsAvantNaissance, lycanthrope.getTempsAvantNaissance());
        assertEquals(porteeMinimum, lycanthrope.getPorteeMinimum());
        assertEquals(porteeMaximum, lycanthrope.getPorteeMaximum());
        assertEquals(moisSaisonAmour, lycanthrope.getMoisSaisonAmour());
        assertNull(lycanthrope.getMeute());
        assertNull(lycanthrope.getApparenceHumaine());
        assertEquals(facteurDomination, lycanthrope.getFacteurDomination());
        assertEquals(force, lycanthrope.getForce());
        assertEquals(impetuosite, lycanthrope.getImpetuosite());
        assertEquals(rang, lycanthrope.getRang());
    }

}