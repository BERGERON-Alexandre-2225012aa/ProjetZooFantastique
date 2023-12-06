package ga2.projetzoofantastique.models.creatures.vivipares;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.colonies.Hurlement;
import ga2.projetzoofantastique.models.colonies.Meute;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests de la classe Lycanthrope
 */
class LycanthropeTest {

    /**
     * Test du constructeur de la classe Lycanthrope
     */
    @Test
    public void testConstructor(){
        // On crée le lycanthrope.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        zooFantastique.ajouterEnclos(enclos);
        Lycanthrope lycanthrope = new Lycanthrope("Lycanthrope", "male", 25, 5, enclos);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Lycanthrope";
        String sexe = "male";
        double poids = 25;
        double taille = 5;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 9;
        int porteeMinimum = 1;
        int porteeMaximum = 7;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(4);
        moisSaisonAmour.add(5);
        moisSaisonAmour.add(6);
        int force = 0;
        int impetuosite = 0;
        char rang = 'γ';
        int facteurDomination = 0;

        // Les tests.
        assertEquals(nom, lycanthrope.getNom());
        assertEquals(sexe, lycanthrope.getSexe());
        assertEquals(poids, lycanthrope.getPoids());
        assertEquals(taille, lycanthrope.getTaille());
        assertEquals(age, lycanthrope.getAge());
        assertEquals(faim, lycanthrope.getFaim());
        assertEquals(sommeil, lycanthrope.isSommeil());
        assertEquals(sante, lycanthrope.getSante());
        assertEquals(enclos, lycanthrope.getEnclos());
        assertEquals(tempsAvantNaissance, lycanthrope.getTempsAvantNaissance());
        assertEquals(porteeMinimum, lycanthrope.getPorteeMinimum());
        assertEquals(porteeMaximum, lycanthrope.getPorteeMaximum());
        assertEquals(moisSaisonAmour, Lycanthrope.moisSaisonAmour);
        assertNull(lycanthrope.getMeute());
        assertNull(lycanthrope.getApparenceHumaine());
        assertEquals(facteurDomination, lycanthrope.getFacteurDomination());
        assertEquals(rang, lycanthrope.getRang());
    }

    /**
     * Test des Getters de la classe Lycanthrope
     */
    @Test
    public void testGetters(){
        // On crée le lycanthrope.
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Lycanthrope lycanthrope = new Lycanthrope("Lycanthrope", "male", 25, 5, null);
        enclos.ajouterCreature(lycanthrope);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Lycanthrope";
        String sexe = "male";
        double poids = 25;
        double taille = 5;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 9;
        int porteeMinimum = 1;
        int porteeMaximum = 7;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(4);
        moisSaisonAmour.add(5);
        moisSaisonAmour.add(6);
        int force = 0;
        int impetuosite = 0;
        char rang = 'γ';
        int facteurDomination = 0;

        // Les tests.
        assertEquals(nom, lycanthrope.getNom());
        assertEquals(sexe, lycanthrope.getSexe());
        assertEquals(poids, lycanthrope.getPoids());
        assertEquals(taille, lycanthrope.getTaille());
        assertEquals(age, lycanthrope.getAge());
        assertEquals(faim, lycanthrope.getFaim());
        assertEquals(sommeil, lycanthrope.isSommeil());
        assertEquals(sante, lycanthrope.getSante());
        assertEquals(enclos, lycanthrope.getEnclos());
        assertEquals(tempsAvantNaissance, lycanthrope.getTempsAvantNaissance());
        assertEquals(porteeMinimum, lycanthrope.getPorteeMinimum());
        assertEquals(porteeMaximum, lycanthrope.getPorteeMaximum());
        assertEquals(moisSaisonAmour, Lycanthrope.moisSaisonAmour);
        assertNull(lycanthrope.getMeute());
        assertNull(lycanthrope.getApparenceHumaine());
        assertEquals(facteurDomination, lycanthrope.getFacteurDomination());
        assertEquals(rang, lycanthrope.getRang());
    }

    /**
     * Méthode de test des setters de la classe lycanthrope
     */
    @Test
    public void testSetters() {
        // On crée le lycanthrope
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        zooFantastique.ajouterEnclos(enclos);
        Lycanthrope lycanthrope = new Lycanthrope("Lycanthrope", "male", 25, 5, null);

        // On modifie les valeurs
        lycanthrope.setRang('ω');
        lycanthrope.setForce(10);
        lycanthrope.setImpetuosite(12);
        Meute meute = new Meute(enclos);
        enclos.ajouterCreature(lycanthrope);
        meute.ajouterLycanthrope(lycanthrope);
        lycanthrope.setFacteurDomination(1);

        // On crée les éléments auxquels les attributs doivent correspondre.
        String nom = "Lycanthrope";
        String sexe = "male";
        double poids = 25;
        double taille = 5;
        int age = 0;
        int faim = 0;
        boolean sommeil = false;
        int sante = 2;
        int tempsAvantNaissance = 9;
        int porteeMinimum = 1;
        int porteeMaximum = 7;
        ArrayList<Integer> moisSaisonAmour = new ArrayList<>();
        moisSaisonAmour.add(4);
        moisSaisonAmour.add(5);
        moisSaisonAmour.add(6);
        int force = 10;
        int impetuosite = 12;
        char rang = 'ω';
        int facteurDomination = 1;

        // Les tests.
        assertEquals(nom, lycanthrope.getNom());
        assertEquals(sexe, lycanthrope.getSexe());
        assertEquals(poids, lycanthrope.getPoids());
        assertEquals(taille, lycanthrope.getTaille());
        assertEquals(age, lycanthrope.getAge());
        assertEquals(faim, lycanthrope.getFaim());
        assertEquals(sommeil, lycanthrope.isSommeil());
        assertEquals(sante, lycanthrope.getSante());
        assertEquals(enclos, lycanthrope.getEnclos());
        assertEquals(tempsAvantNaissance, lycanthrope.getTempsAvantNaissance());
        assertEquals(porteeMinimum, lycanthrope.getPorteeMinimum());
        assertEquals(porteeMaximum, lycanthrope.getPorteeMaximum());
        assertEquals(moisSaisonAmour, Lycanthrope.moisSaisonAmour);
        assertEquals(meute, lycanthrope.getMeute());
        assertNull(lycanthrope.getApparenceHumaine());
        assertEquals(facteurDomination, lycanthrope.getFacteurDomination());
        assertEquals(rang, lycanthrope.getRang());
    }

    /**
     * Test de l'affichage d'un lycanthrope
     */
    @Test
    public void testAfficherCaracteristiques() {
        //On crée le lycanthrope
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Lycanthrope lycanthrope = new Lycanthrope("Lycanthrope1", "male", 20, 20, null);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        zooFantastique.ajouterEnclos(enclos);
        Meute meute = new Meute(enclos);
        enclos.ajouterCreature(lycanthrope);
        enclos.getMeute().ajouterLycanthrope(lycanthrope);
        lycanthrope.setFacteurDomination(0);
        lycanthrope.setForce(0);
        lycanthrope.setImpetuosite(0);

        //On crée la string à vérifier
        String caracteristiques = "Lycanthrope1 :" +
                "\n Sexe : male" +
                "\n Âge : 0 ans" +
                "\n Poids : 20.0 kg" +
                "\n Taille : 20.0 m" +
                "\n Faim : rassasié" +
                "\n Sommeil : réveillé" +
                "\n Santé : bonne santé" +
                "\n " +
                "\n Meute : Enclos1" +
                "\n " +
                "\n Force : 0" +
                "\n Impétuosité : 0" +
                "\n Domination : 0" +
                "\n " +
                "\n Rang : γ";

        //On teste
        assertEquals(caracteristiques, lycanthrope.afficherCaracteristiques());
    }

    @Test
    public void testEmettreSon() {
        //On crée le zoo
        ZooFantastique zooFantastique = new ZooFantastique("Zoo1", null, 9);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Enclos enclos2 = new Enclos("Enclos2", 200, 20);

        zooFantastique.ajouterEnclos(enclos);
        zooFantastique.ajouterEnclos(enclos2);

        //On crée le lycanthrope
        Lycanthrope lycanthrope = new Lycanthrope("LycanthropeMid", "male", 20, 20, null);
        Meute meute = new Meute(enclos);
        enclos.ajouterCreature(lycanthrope);
        enclos.getMeute().ajouterLycanthrope(lycanthrope);
        lycanthrope.setFacteurDomination(5);
        lycanthrope.setForce(5);
        lycanthrope.setImpetuosite(5);

        //On crée un soumis
        Lycanthrope lycanthropeGuez = new Lycanthrope("LycanthropeGuez", "male", 20, 20, null);
        enclos.ajouterCreature(lycanthropeGuez);
        enclos.getMeute().ajouterLycanthrope(lycanthropeGuez);
        lycanthropeGuez.setFacteurDomination(0);
        lycanthropeGuez.setForce(0);
        lycanthropeGuez.setImpetuosite(0);

        //On crée un tarpin fort
        Lycanthrope lycanthropeFort = new Lycanthrope("LycanthropeFort", "male", 20, 20, null);
        enclos.ajouterCreature(lycanthropeFort);
        enclos.getMeute().ajouterLycanthrope(lycanthropeFort);
        lycanthropeFort.setFacteurDomination(10);
        lycanthropeFort.setForce(10);
        lycanthropeFort.setImpetuosite(10);

        //On teste la domination
        lycanthrope.emettreSon(new Hurlement("domination", null));

        //On crée une autre meute
        Meute meute2 = new Meute(enclos2);

        //On teste l'appartenance
        lycanthrope.emettreSon(new Hurlement("appartenance", meute));
    }
}