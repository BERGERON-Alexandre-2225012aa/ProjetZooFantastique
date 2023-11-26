package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests pour la classe Sirene
 */
class SireneTest {
    /**
     * Méthode de test pour le constructeur de la classe Sirene
     */
    @Test
    public void testConstructor(){
        // On crée la sirène.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Aquarium aquarium = new Aquarium("Aquarium1", 200, 20, zooFantastique, 10);
        Sirene sirene = new Sirene("Sirene1", "male", 25, 5, aquarium);

        // On crée les éléments auxquels les attributs de la sirene doivent correspondre.
        String nom = "Sirene1";
        String sexe = "male";
        double poids = 25;
        double taille = 5;
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
        assertEquals(nom, sirene.getNom());
        assertEquals(sexe, sirene.getSexe());
        assertEquals(poids, sirene.getPoids());
        assertEquals(taille, sirene.getTaille());
        assertEquals(age, sirene.getAge());
        assertEquals(faim, sirene.getFaim());
        assertEquals(sommeil, sirene.isSommeil());
        assertEquals(sante, sirene.getSante());
        assertEquals(aquarium, sirene.getEnclos());
        assertEquals(tempsAvantNaissance, sirene.getTempsAvantNaissance());
        assertEquals(porteeMinimum, sirene.getPorteeMinimum());
        assertEquals(porteeMaximum, sirene.getPorteeMaximum());
        assertEquals(moisSaisonAmour, sirene.getMoisSaisonAmour());
    }

}