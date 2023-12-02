package ga2.projetzoofantastique.models.colonies;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.vivipares.Lycanthrope;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MeuteTest {

    @Test
    public void testConstructor() {
        //On crée la meute
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Meute meute = new Meute(enclos);

        //On initialise les valeurs souhaitées
        CoupleAlpha coupleAlpha = meute.getCoupleAlpha();
        ArrayList<Lycanthrope> lycanthropes = new ArrayList<>();

        //Les tests
        assertEquals(coupleAlpha, meute.getCoupleAlpha());
        assertEquals(lycanthropes, meute.getLycanthropes());
        assertEquals(enclos, meute.getEnclos());
    }

    @Test
    public void testGetters() {
        //On crée la meute
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Meute meute = new Meute(enclos);

        //On initialise les valeurs souhaitées
        CoupleAlpha coupleAlpha = meute.getCoupleAlpha();
        ArrayList<Lycanthrope> lycanthropes = new ArrayList<>();

        //Les tests
        assertEquals(coupleAlpha, meute.getCoupleAlpha());
        assertEquals(lycanthropes, meute.getLycanthropes());
        assertEquals(enclos, meute.getEnclos());
    }

    /**
     * Méthode de test des setters
     */
    @Test
    public void testSetters() {
        //On crée la meute
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Meute meute = new Meute(enclos);

        //On modifie les valeurs
        ArrayList<Lycanthrope> lycanthropes = new ArrayList<>();
        meute.setLycanthropes(lycanthropes);

        //Les tests
        assertEquals(lycanthropes, meute.getLycanthropes());
    }
    /**
     * Méthode de test de l'affichage des caractéristiques
     */
    @Test
    public void testAfficherCaracteristiques() {
        //On crée la meute
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Meute meute = new Meute(enclos);
        CoupleAlpha coupleAlpha = new CoupleAlpha();
        Lycanthrope lycanthropeMale = new Lycanthrope("Lycanthrope1", "male", 20, 20, null);
        Lycanthrope lycanthropeFemelle = new Lycanthrope("Lycanthrope2", "femelle", 20, 20, null);
        enclos.ajouterCreature(lycanthropeMale);
        enclos.ajouterCreature(lycanthropeFemelle);
        lycanthropeMale.setRang('α');
        lycanthropeFemelle.setRang('α');
        coupleAlpha.setLycanthropeMale(lycanthropeMale);
        coupleAlpha.setLycanthropeFemelle(lycanthropeFemelle);
        meute.setCoupleAlpha(coupleAlpha);

        //La valeur attendue
        String caracteristiques = "Meute de Enclos1 :" +
                "\n Couple alpha : Lycanthrope1, Lycanthrope2";

        //On teste
        assertEquals(caracteristiques, meute.afficherCaracteristiques());
    }

    /**
     * Méthode de test de l'affichage de la liste de lycanthropes de la meute
     */
    @Test
    public void testAfficherCaracteristiquesLycanthropes() {
        //On crée la meute
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Meute meute = new Meute(enclos);
        CoupleAlpha coupleAlpha = new CoupleAlpha();
        Lycanthrope lycanthrope1 = new Lycanthrope("Lycanthrope1", "male", 20, 20, null);
        Lycanthrope lycanthrope2 = new Lycanthrope("Lycanthrope2", "femelle", 20, 20, null);
        enclos.ajouterCreature(lycanthrope1);
        enclos.ajouterCreature(lycanthrope2);
        lycanthrope1.setRang('α');
        lycanthrope2.setRang('α');
        meute.ajouterLycanthrope(lycanthrope1);
        meute.ajouterLycanthrope(lycanthrope2);

        //La valeur attendue
        String caracteristiques = "Lycanthrope1 (α)\n" +
                "Lycanthrope2 (α)\n";

        //On teste
        assertEquals(caracteristiques, meute.afficherCaracteristiquesLycanthropes());
    }

    /**
     * Méthode de test de constitution de couple alpha de la meute
     */
    @Test
    public void testConstituerCoupleAlpha() {
        //On crée la meute
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Meute meute = new Meute(enclos);
        Lycanthrope lycanthrope1 = new Lycanthrope("Lycanthrope1", "male", 20, 20, null);
        Lycanthrope lycanthrope2 = new Lycanthrope("Lycanthrope2", "femelle", 20, 20, null);
        enclos.ajouterCreature(lycanthrope1);
        enclos.ajouterCreature(lycanthrope2);
        meute.ajouterLycanthrope(lycanthrope1);
        meute.ajouterLycanthrope(lycanthrope2);
        meute.constituerCoupleAlpha();

        //La valeur à vérifier
        CoupleAlpha coupleAlpha = new CoupleAlpha();
        coupleAlpha.setLycanthropeMale(lycanthrope1);
        coupleAlpha.setLycanthropeFemelle(lycanthrope2);

        //On teste
        assertEquals(coupleAlpha.getLycanthropeMale(), meute.getCoupleAlpha().getLycanthropeMale());
        assertEquals(coupleAlpha.getLycanthropeFemelle(), meute.getCoupleAlpha().getLycanthropeFemelle());

        //On rajoute un lycanthrope male tarpin fort
        Lycanthrope lycanthrope3 = new Lycanthrope("Lycanthrope3", "male", 20, 20, null);
        lycanthrope3.setForce(100);
        lycanthrope3.setRang('α');
        enclos.ajouterCreature(lycanthrope3);
        meute.ajouterLycanthrope(lycanthrope3);
        meute.constituerCoupleAlpha();

        //On modifie la valeur à vérifier
        coupleAlpha.setLycanthropeMale(lycanthrope3);

        //On reteste
        assertEquals(coupleAlpha.getLycanthropeMale(), meute.getCoupleAlpha().getLycanthropeMale());
        assertEquals(coupleAlpha.getLycanthropeFemelle(), meute.getCoupleAlpha().getLycanthropeFemelle());
    }

    /**
     * Méthode de test de l'équilibrage des rangs de la meute
     */
    @Test
    public void testDecroitreRangs() {
        //On crée la meute
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Meute meute = new Meute(enclos);
        Lycanthrope lycanthrope1 = new Lycanthrope("Lycanthrope1", "male", 20, 20, null);
        Lycanthrope lycanthrope2 = new Lycanthrope("Lycanthrope2", "femelle", 20, 20, null);
        Lycanthrope lycanthrope3 = new Lycanthrope("Lycanthrope3", "male", 20, 20, null);
        Lycanthrope lycanthrope4 = new Lycanthrope("Lycanthrope4", "femelle", 20, 20, null);
        Lycanthrope lycanthrope5 = new Lycanthrope("Lycanthrope5", "male", 20, 20, null);
        Lycanthrope lycanthrope6 = new Lycanthrope("Lycanthrope6", "femelle", 20, 20, null);
        enclos.ajouterCreature(lycanthrope1);
        enclos.ajouterCreature(lycanthrope2);
        enclos.ajouterCreature(lycanthrope3);
        enclos.ajouterCreature(lycanthrope4);
        enclos.ajouterCreature(lycanthrope5);
        enclos.ajouterCreature(lycanthrope6);
        meute.ajouterLycanthrope(lycanthrope1);
        meute.ajouterLycanthrope(lycanthrope2);
        meute.ajouterLycanthrope(lycanthrope3);
        meute.ajouterLycanthrope(lycanthrope4);
        meute.ajouterLycanthrope(lycanthrope5);
        meute.ajouterLycanthrope(lycanthrope6);
        lycanthrope1.setForce(100);
        lycanthrope2.setForce(100);
        lycanthrope3.setForce(3);
        lycanthrope4.setForce(3);
        lycanthrope5.setForce(1);
        lycanthrope6.setForce(1);

        lycanthrope1.setFacteurDomination(24);
        lycanthrope2.setFacteurDomination(24);
        lycanthrope3.setFacteurDomination(24);
        lycanthrope4.setFacteurDomination(24);
        lycanthrope5.setFacteurDomination(24);
        lycanthrope6.setFacteurDomination(24);

        meute.decroitreRangs();

        for (int i = 0 ; i < meute.getLycanthropes().size() ; ++i) {
            assertEquals('α', meute.getLycanthropes().get(i).getRang());
        }
        assertEquals(lycanthrope1, meute.getCoupleAlpha().getLycanthropeMale());
        assertEquals(lycanthrope2, meute.getCoupleAlpha().getLycanthropeFemelle());
    }

    @Test
    public void testDeclarerLycanthropesOmega() {
        //On crée la meute
        Enclos enclos = new Enclos("Enclos1", 200, 20);
        Meute meute = new Meute(enclos);
        Lycanthrope lycanthrope1 = new Lycanthrope("Lycanthrope1", "male", 20, 20, null);
        Lycanthrope lycanthrope2 = new Lycanthrope("Lycanthrope2", "femelle", 20, 20, null);
        Lycanthrope lycanthrope3 = new Lycanthrope("Lycanthrope3", "male", 20, 20, null);
        Lycanthrope lycanthrope4 = new Lycanthrope("Lycanthrope4", "femelle", 20, 20, null);
        Lycanthrope lycanthrope5 = new Lycanthrope("Lycanthrope5", "male", 20, 20, null);
        Lycanthrope lycanthrope6 = new Lycanthrope("Lycanthrope6", "femelle", 20, 20, null);

        enclos.ajouterCreature(lycanthrope1);
        enclos.ajouterCreature(lycanthrope2);
        enclos.ajouterCreature(lycanthrope3);
        enclos.ajouterCreature(lycanthrope4);
        enclos.ajouterCreature(lycanthrope5);
        enclos.ajouterCreature(lycanthrope6);

        meute.ajouterLycanthrope(lycanthrope1);
        meute.ajouterLycanthrope(lycanthrope2);
        meute.ajouterLycanthrope(lycanthrope3);
        meute.ajouterLycanthrope(lycanthrope4);
        meute.ajouterLycanthrope(lycanthrope5);
        meute.ajouterLycanthrope(lycanthrope6);

        lycanthrope1.setForce(100);
        lycanthrope2.setForce(100);
        lycanthrope3.setForce(3);
        lycanthrope4.setForce(3);
        lycanthrope5.setForce(1);
        lycanthrope6.setForce(1);

        lycanthrope1.setFacteurDomination(24);
        lycanthrope2.setFacteurDomination(24);
        lycanthrope3.setFacteurDomination(24);
        lycanthrope4.setFacteurDomination(2);
        lycanthrope5.setFacteurDomination(1);
        lycanthrope6.setFacteurDomination(21);

        meute.declarerLycanthropesOmega();

        assertNotEquals('ω', lycanthrope1.getRang());
        assertNotEquals('ω', lycanthrope2.getRang());
        assertNotEquals('ω', lycanthrope3.getRang());
        assertEquals('ω', lycanthrope4.getRang());
        assertEquals('ω', lycanthrope5.getRang());
        assertNotEquals('ω', lycanthrope6.getRang());
    }
}