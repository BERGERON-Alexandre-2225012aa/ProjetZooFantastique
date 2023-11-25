package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests pour la classe Nymphe
 */
class NympheTest {
    /**
     * Méthode de test pour le constructeur de la classe Nymphe
     */
    @Test
    public void testConstructor(){
        // On crée la nymphe.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos aucun = new Enclos("Aucun enclos", 0, 0, zooFantastique);
        Nymphe nymphe = new Nymphe("Nymphe1", "femelle", 50, 10, aucun );

        // On crée les éléments auxquels les attributs de la nymphe doivent correspondre.
        String nom = "Nymphe1";
        String sexe = "femelle";
        double poids = 50;
        double taille = 10;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 9;
        int porteeMinimum = 1;
        int porteeMaximum = 3;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(7);
        moisSaisonAmour.add(8);
        moisSaisonAmour.add(9);

        // Les tests.
        assertEquals(nom, nymphe.getNom());
        assertEquals(sexe, nymphe.getSexe());
        assertEquals(poids, nymphe.getPoids());
        assertEquals(taille, nymphe.getTaille());
        assertEquals(age, nymphe.getAge());
        assertEquals(faim, nymphe.getFaim());
        assertEquals(sommeil, nymphe.isSommeil());
        assertEquals(sante, nymphe.getSante());
        assertEquals(aucun, nymphe.getEnclos());
        assertEquals(tempsAvantNaissance, nymphe.getTempsAvantNaissance());
        assertEquals(porteeMinimum, nymphe.getPorteeMinimum());
        assertEquals(porteeMaximum, nymphe.getPorteeMaximum());
        assertEquals(moisSaisonAmour, nymphe.getMoisSaisonAmour());
    }

}