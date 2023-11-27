package ga2.projetzoofantastique.models.colonies;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test de la classe Hurlement
 */
class HurlementTest {

    @Test
    public void testConstructor() {
        //On crée le hurlement
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Meute meute = new Meute(enclos);
        Hurlement hurlement = new Hurlement("appartenance", meute);

        //On crée les valeurs souhaitées
        String type = "appartenance";

        // Les tests
        assertEquals(type, hurlement.getType());
        assertEquals(meute, hurlement.getMeute());
    }
    @Test
    public void testGetters() {
        //On crée le hurlement
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Meute meute = new Meute(enclos);
        Hurlement hurlement = new Hurlement("appartenance", meute);

        //On crée les valeurs souhaitées
        String type = "appartenance";

        // Les tests
        assertEquals(type, hurlement.getType());
        assertEquals(meute, hurlement.getMeute());
    }

    @Test
    public void testAfficherCaracteristiques() {
        //On crée les hurlements
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Meute meute = new Meute(enclos);
        Hurlement hurlement1 = new Hurlement("appartenance", meute);
        Hurlement hurlement2 = new Hurlement("domination", null);

        hurlement1.afficherCaracteristiques();
        hurlement2.afficherCaracteristiques();
    }
}