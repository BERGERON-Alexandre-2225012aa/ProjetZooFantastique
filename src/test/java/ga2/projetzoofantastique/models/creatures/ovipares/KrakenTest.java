package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class KrakenTest {
    /**
     * Méthode de test pour le constructeur de la classe Kraken
     */
    @Test
    public void testConstructor(){
        // On crée le kraken.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Aquarium aquarium = new Aquarium("Aquarium1", 200, 20, zooFantastique, 50);
        Kraken kraken = new Kraken("Kraken1", "male", 250, 20, aquarium);

        // On crée les éléments auxquels les attributs du kraken doivent correspondre.
        String nom = "Kraken1";
        String sexe = "male";
        double poids = 250;
        double taille = 20;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 4;
        int porteeMinimum = 1;
        int porteeMaximum = 10;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(1);
        moisSaisonAmour.add(2);
        moisSaisonAmour.add(3);

        // Les tests.
        assertEquals(nom, kraken.getNom());
        assertEquals(sexe, kraken.getSexe());
        assertEquals(poids, kraken.getPoids());
        assertEquals(taille, kraken.getTaille());
        assertEquals(age, kraken.getAge());
        assertEquals(faim, kraken.getFaim());
        assertEquals(sommeil, kraken.isSommeil());
        assertEquals(sante, kraken.getSante());
        assertEquals(aquarium, kraken.getEnclos());
        assertEquals(tempsAvantNaissance, kraken.getTempsAvantNaissance());
        assertEquals(porteeMinimum, kraken.getPorteeMinimum());
        assertEquals(porteeMaximum, kraken.getPorteeMaximum());
        assertEquals(moisSaisonAmour, kraken.getMoisSaisonAmour());
    }

}