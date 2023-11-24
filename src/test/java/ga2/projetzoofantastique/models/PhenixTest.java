package ga2.projetzoofantastique.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PhenixTest {
    /**
     * Méthode de test pour le constructeur de la classe Phenix
     */
    @Test
    public void testConstructor(){
        // On crée le phénix.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Voliere voliere = new Voliere("Voliere1", 200, 20, zooFantastique, 10);
        Phenix phenix = new Phenix("Phenix1", "male", 25, 5, voliere);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Phenix1";
        String sexe = "male";
        double poids = 25;
        double taille = 5;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 12;
        int porteeMinimum = 1;
        int porteeMaximum = 3;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(4);
        moisSaisonAmour.add(5);
        moisSaisonAmour.add(6);

        // Les tests.
        assertEquals(nom, phenix.getNom());
        assertEquals(sexe, phenix.getSexe());
        assertEquals(poids, phenix.getPoids());
        assertEquals(taille, phenix.getTaille());
        assertEquals(age, phenix.getAge());
        assertEquals(faim, phenix.getFaim());
        assertEquals(sommeil, phenix.isSommeil());
        assertEquals(sante, phenix.getSante());
        assertEquals(voliere, phenix.getEnclos());
        assertEquals(tempsAvantNaissance, phenix.getTempsAvantNaissance());
        assertEquals(porteeMinimum, phenix.getPorteeMinimum());
        assertEquals(porteeMaximum, phenix.getPorteeMaximum());
        assertEquals(moisSaisonAmour, phenix.getMoisSaisonAmour());
    }

}