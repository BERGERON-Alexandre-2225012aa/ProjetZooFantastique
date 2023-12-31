package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests pour la classe Vivipare
 */
class VivipareTest {
    /**
     * Méthode de test pour le constructeur de la classe Vivipare
     */
    @Test
    public void testConstructor(){
        // On crée le vivipare.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Creature creature = new Creature("Vivipare1", "male", 5, 0.5, enclos);

        // On crée les éléments auxquels les attributs du vivipare doivent correspondre.
        String nom = "Vivipare1";
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

}