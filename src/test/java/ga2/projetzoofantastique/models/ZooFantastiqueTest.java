package ga2.projetzoofantastique.models;

import ga2.projetzoofantastique.models.colonies.Colonie;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.ovipares.Kraken;
import ga2.projetzoofantastique.models.creatures.ovipares.Phenix;
import ga2.projetzoofantastique.models.creatures.vivipares.Licorne;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import ga2.projetzoofantastique.models.enclos.Enclos;
import ga2.projetzoofantastique.models.enclos.Voliere;
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
        Enclos enclos = new Enclos("Enclos", 200, 20);
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

    /**
     * Test d'affichage du nombre de créatures d'un zoo
     */
    @Test
    public void testAfficherNombreCreatures() {
        //On crée le zoo et ses enclos
        Maitre maitre = new Maitre("Jérome", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo", maitre, 20);
        Enclos enclos1 = new Enclos("Enclos de licornes 1", 200, 20);
        Aquarium aquarium1 = new Aquarium("Aquarium de krakens 1", 200, 20, 20);
        Voliere voliere1 = new Voliere("Voliere de Phénix 1", 200, 20, 20);

        //On ajoute les enclos au zoo
        zooFantastique.ajouterEnclos(enclos1);
        zooFantastique.ajouterEnclos(aquarium1);
        zooFantastique.ajouterEnclos(voliere1);

        //On crée des créatures
        Licorne licorne = new Licorne("Licorne 1", "male", 20,20,enclos1);
        Kraken kraken = new Kraken("Kraken 1", "male", 20, 20, aquarium1);
        Phenix phenix = new Phenix("Phenix 1", "male", 20, 20, voliere1);

        enclos1.ajouterCreature(licorne);
        aquarium1.ajouterCreature(kraken);
        voliere1.ajouterCreature(phenix);

        //On teste
        assertEquals(3, zooFantastique.afficherNombreCreatures());
    }

    /**
     * Test d'affichage de tous les noms de créatures d'un zoo
     */
    @Test
    public void testAfficherCreatures() {
        //On crée le zoo et ses enclos
        Maitre maitre = new Maitre("Jérome", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo", maitre, 20);
        Enclos enclos1 = new Enclos("Enclos de licornes 1", 200, 20);
        Aquarium aquarium1 = new Aquarium("Aquarium de krakens 1", 200, 20, 20);
        Voliere voliere1 = new Voliere("Voliere de Phénix 1", 200, 20, 20);

        //On ajoute les enclos au zoo
        zooFantastique.ajouterEnclos(enclos1);
        zooFantastique.ajouterEnclos(aquarium1);
        zooFantastique.ajouterEnclos(voliere1);

        //On crée des créatures
        Licorne licorne = new Licorne("Licorne 1", "male", 20,20,enclos1);
        Kraken kraken = new Kraken("Kraken 1", "male", 20, 20, aquarium1);
        Phenix phenix = new Phenix("Phenix 1", "male", 20, 20, voliere1);

        enclos1.ajouterCreature(licorne);
        aquarium1.ajouterCreature(kraken);
        voliere1.ajouterCreature(phenix);

        //Valeur à vérifier
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(licorne);
        creatures.add(kraken);
        creatures.add(phenix);

        //On teste
        assertEquals(creatures, zooFantastique.afficherCreatures());
    }

    /**
     * Test d'affichage de tous les noms des enclos d'un zoo
     */
    @Test
    public void testAfficherEnclos() {
        //On crée le zoo et ses enclos
        Maitre maitre = new Maitre("Jérome", "male");
        ZooFantastique zooFantastique = new ZooFantastique("Zoo", maitre, 20);
        Enclos enclos1 = new Enclos("Enclos de licornes 1", 200, 20);
        Aquarium aquarium1 = new Aquarium("Aquarium de krakens 1", 200, 20, 20);
        Voliere voliere1 = new Voliere("Voliere de Phénix 1", 200, 20, 20);

        //On ajoute les enclos au zoo
        zooFantastique.ajouterEnclos(enclos1);
        zooFantastique.ajouterEnclos(aquarium1);
        zooFantastique.ajouterEnclos(voliere1);

        //Valeur à vérifier
        ArrayList<String> nomsEnclos = new ArrayList<>();
        nomsEnclos.add("Enclos de licornes 1");
        nomsEnclos.add("Aquarium de krakens 1");
        nomsEnclos.add("Voliere de Phénix 1");

        //On teste
        assertEquals(nomsEnclos, zooFantastique.afficherEnclos());
    }
}