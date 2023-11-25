package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class DragonTest {
    /**
     * Méthode de test pour le constructeur de la classe dragon
     */
    @Test
    public void testConstructor(){
        // On crée le dragon.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Aquarium1", 200, 20, zooFantastique);
        Dragon dragon = new Dragon("Dragon1", "male", 500, 30, enclos);

        // On crée les éléments auxquels les attributs du dragon doivent correspondre.
        String nom = "Dragon1";
        String sexe = "male";
        double poids = 500;
        double taille = 30;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 12;
        int porteeMinimum = 1;
        int porteeMaximum = 2;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(10);
        moisSaisonAmour.add(11);
        moisSaisonAmour.add(12);

        // Les tests.
        assertEquals(nom, dragon.getNom());
        assertEquals(sexe, dragon.getSexe());
        assertEquals(poids, dragon.getPoids());
        assertEquals(taille, dragon.getTaille());
        assertEquals(age, dragon.getAge());
        assertEquals(faim, dragon.getFaim());
        assertEquals(sommeil, dragon.isSommeil());
        assertEquals(sante, dragon.getSante());
        assertEquals(enclos, dragon.getEnclos());
        assertEquals(tempsAvantNaissance, dragon.getTempsAvantNaissance());
        assertEquals(porteeMinimum, dragon.getPorteeMinimum());
        assertEquals(porteeMaximum, dragon.getPorteeMaximum());
        assertEquals(moisSaisonAmour, dragon.getMoisSaisonAmour());
    }

}