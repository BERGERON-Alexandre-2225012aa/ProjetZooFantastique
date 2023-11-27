package ga2.projetzoofantastique.models.colonies;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.vivipares.Lycanthrope;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MeuteTest {

    @Test
    public void testConstructor() {
        //On crée la meute
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Meute meute = new Meute(enclos);

        //On initialise les valeurs souhaitées
        CoupleAlpha coupleAlpha = meute.getCoupleAlpha();
        ArrayList<Lycanthrope> lycanthropes = new ArrayList<>();

        //Les tests
        assertEquals(coupleAlpha, meute.getCoupleAlpha());
        assertEquals(lycanthropes, meute.getLycanthropes());
        assertEquals(enclos, meute.getEnclos());
    }

    @Test
    public void testGetters() {
        //On crée la meute
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Meute meute = new Meute(enclos);

        //On initialise les valeurs souhaitées
        CoupleAlpha coupleAlpha = meute.getCoupleAlpha();
        ArrayList<Lycanthrope> lycanthropes = new ArrayList<>();

        //Les tests
        assertEquals(coupleAlpha, meute.getCoupleAlpha());
        assertEquals(lycanthropes, meute.getLycanthropes());
        assertEquals(enclos, meute.getEnclos());
    }

    /**
     * Méthode de test des setters
     */
    @Test
    public void testSetters() {
        //On crée la meute
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Meute meute = new Meute(enclos);

        //On modifie les valeurs
        ArrayList<Lycanthrope> lycanthropes = new ArrayList<>();
        meute.setLycanthropes(lycanthropes);

        //Les tests
        assertEquals(lycanthropes, meute.getLycanthropes());
    }

}