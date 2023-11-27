package ga2.projetzoofantastique.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test de la classe Maitre
 */
class MaitreTest {

    /**
     * Méthode de test du constructeur de Maitre
     */
    @Test
    public void testConstructor() {
        //On crée le maitre
        Maitre maitre = new Maitre("Jacques", "male");

        //On crée les valeurs à vérifier
        String nom = "Jacques";
        String sexe = "male";
        int age = 0;

        //Les tests.
        assertEquals(nom, maitre.getNom());
        assertEquals(sexe, maitre.getSexe());
        assertEquals(age, maitre.getAge());
    }

    /**
     * Méthode de test des Getters de Maitre
     */
    @Test
    public void testGetters() {
        //On crée le maitre
        Maitre maitre = new Maitre("Jacques", "male");

        //On crée les valeurs à vérifier
        String nom = "Jacques";
        String sexe = "male";
        int age = 0;

        //Les tests.
        assertEquals(nom, maitre.getNom());
        assertEquals(sexe, maitre.getSexe());
        assertEquals(age, maitre.getAge());
    }

    @Test
    public void testSetters() {
        //On crée le maitre
        Maitre maitre = new Maitre("Jacques", "male");

        //On modifie quelques valeurs
        maitre.setAge(90);

        //On crée les valeurs à vérifier
        String nom = "Jacques";
        String sexe = "male";
        int age = 90;

        //Les tests.
        assertEquals(nom, maitre.getNom());
        assertEquals(sexe, maitre.getSexe());
        assertEquals(age, maitre.getAge());
    }
}