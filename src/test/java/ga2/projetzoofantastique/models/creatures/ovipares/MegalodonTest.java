package ga2.projetzoofantastique.models.creatures.ovipares;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class MegalodonTest {
    /**
     * Méthode de test pour le constructeur de la classe Megalodon
     */
    @Test
    public void testConstructor(){
        // On crée le megalodon.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Aquarium aquarium = new Aquarium("Aquarium1", 200, 20, zooFantastique, 50);
        Megalodon megalodon = new Megalodon("Megalodon1", "femelle", 100, 15, aquarium);

        // On crée les éléments auxquels les attributs du megalodon doivent correspondre.
        String nom = "Megalodon1";
        String sexe = "femelle";
        double poids = 100;
        double taille = 15;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 5;
        int porteeMinimum = 1;
        int porteeMaximum = 4;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(4);
        moisSaisonAmour.add(5);
        moisSaisonAmour.add(6);

        // Les tests.
        assertEquals(nom, megalodon.getNom());
        assertEquals(sexe, megalodon.getSexe());
        assertEquals(poids, megalodon.getPoids());
        assertEquals(taille, megalodon.getTaille());
        assertEquals(age, megalodon.getAge());
        assertEquals(faim, megalodon.getFaim());
        assertEquals(sommeil, megalodon.isSommeil());
        assertEquals(sante, megalodon.getSante());
        assertEquals(aquarium, megalodon.getEnclos());
        assertEquals(tempsAvantNaissance, megalodon.getTempsAvantNaissance());
        assertEquals(porteeMinimum, megalodon.getPorteeMinimum());
        assertEquals(porteeMaximum, megalodon.getPorteeMaximum());
        assertEquals(moisSaisonAmour, megalodon.getMoisSaisonAmour());
    }

}