package ga2.projetzoofantastique.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests pour la classe Licorne
 */
class LicorneTest {
    /**
     * Méthode de test pour le constructeur de la classe Licorne
     */
    @Test
    public void testConstructor(){
        // On crée la licorne.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Licorne licorne = new Licorne("Licorne1", "male", 25, 5, enclos);

        // On crée les éléments auxquels les attributs de la licorne doivent correspondre.
        String nom = "Licorne1";
        String sexe = "male";
        double poids = 25;
        double taille = 5;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 11;
        int porteeMinimum = 1;
        int porteeMaximum = 1;

        // Les tests.
        assertEquals(nom, licorne.getNom());
        assertEquals(sexe, licorne.getSexe());
        assertEquals(poids, licorne.getPoids());
        assertEquals(taille, licorne.getTaille());
        assertEquals(age, licorne.getAge());
        assertEquals(faim, licorne.getFaim());
        assertEquals(sommeil, licorne.isSommeil());
        assertEquals(sante, licorne.getSante());
        assertEquals(enclos, licorne.getEnclos());
        assertEquals(tempsAvantNaissance, licorne.getTempsAvantNaissance());
        assertEquals(porteeMinimum, licorne.getPorteeMinimum());
        assertEquals(porteeMaximum, licorne.getPorteeMaximum());
    }

}