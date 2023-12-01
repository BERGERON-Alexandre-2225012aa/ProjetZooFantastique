package ga2.projetzoofantastique.models.colonies;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests de la classe Colonie
 */
class ColonieTest {
    @Test
    public void testConstructor() {
        // On crée la colonie.
        Colonie colonie = new Colonie();

        // On initialise les données souhaitées
        ArrayList<Meute> meutes = new ArrayList<>();

        //Test
        assertEquals(meutes, colonie.getMeutes());
    }

    @Test
    public void testGetters() {
        // On crée la colonie.
        Colonie colonie = new Colonie();

        // On initialise les données souhaitées
        ArrayList<Meute> meutes = new ArrayList<>();

        //Test
        assertEquals(meutes, colonie.getMeutes());
    }

    @Test
    public void testSetters() {
        // On crée la colonie.
        Colonie colonie = new Colonie();

        // On modifie les valeurs
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Meute meute = new Meute(enclos);
        ArrayList<Meute> meutes = new ArrayList<>();
        meutes.add(meute);
        colonie.setMeutes(meutes);

        //Test
        assertEquals(meutes, colonie.getMeutes());
    }

}