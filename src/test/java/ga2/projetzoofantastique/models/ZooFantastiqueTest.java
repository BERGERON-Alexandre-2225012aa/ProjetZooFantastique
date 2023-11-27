package ga2.projetzoofantastique.models;

import ga2.projetzoofantastique.models.colonies.Colonie;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests de la classe ZooFantastique
 */
class ZooFantastiqueTest {

    /**
     * Méthode de test du constructeur de ZooFantastique
     */
    @Test
    public void testConstructor() {
        //On crée le ZooFantastique
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique", null, 10);

        //On crée les valeurs qui doivent correspondre
        String nom = "ZooFantastique";
        int nombreMaxEnclos = 10;
        ArrayList<Enclos> enclos = new ArrayList<>();
        Colonie colonie = zooFantastique.getColonie();

        //Les tests.
        assertEquals(nom, zooFantastique.getNom());
        assertNull(zooFantastique.getMaitre());
        assertEquals(nombreMaxEnclos, zooFantastique.getNombreMaxEnclos());
        assertEquals(enclos, zooFantastique.getEnclos());
        assertEquals(colonie, zooFantastique.getColonie());
    }
    /**
     * Méthode de test des Getters de ZooFantastique
     */
    @Test
    public void testGetters() {
        //On crée le ZooFantastique
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique", null, 10);

        //On crée les valeurs qui doivent correspondre
        String nom = "ZooFantastique";
        int nombreMaxEnclos = 10;
        ArrayList<Enclos> enclos = new ArrayList<>();
        Colonie colonie = zooFantastique.getColonie();

        //Les tests.
        assertEquals(nom, zooFantastique.getNom());
        assertNull(zooFantastique.getMaitre());
        assertEquals(nombreMaxEnclos, zooFantastique.getNombreMaxEnclos());
        assertEquals(enclos, zooFantastique.getEnclos());
        assertEquals(colonie, zooFantastique.getColonie());
    }
    /**
     * Méthode de test des Setters de ZooFantastique
     */
    @Test
    public void testSetters() {
        //On crée le ZooFantastique
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique", null, 10);

        //On modifie les valeurs
        Enclos enclos = new Enclos("Enclos", 200, 20, zooFantastique);
        ArrayList<Enclos> listeEnclos = new ArrayList<>();
        listeEnclos.add(enclos);
        zooFantastique.setEnclos(listeEnclos);
        Maitre maitre = new Maitre("Jean", "male");
        zooFantastique.setMaitre(maitre);
        zooFantastique.setNombreMaxEnclos(11);

        //On crée les valeurs qui doivent correspondre
        String nom = "ZooFantastique";
        int nombreMaxEnclos = 11;
        Colonie colonie = zooFantastique.getColonie();

        //Les tests.
        assertEquals(nom, zooFantastique.getNom());
        assertEquals(maitre, zooFantastique.getMaitre());
        assertEquals(nombreMaxEnclos, zooFantastique.getNombreMaxEnclos());
        assertEquals(listeEnclos, zooFantastique.getEnclos());
        assertEquals(colonie, zooFantastique.getColonie());
    }
}