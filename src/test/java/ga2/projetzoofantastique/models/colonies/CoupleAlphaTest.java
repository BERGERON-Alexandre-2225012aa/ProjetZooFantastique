package ga2.projetzoofantastique.models.colonies;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.creatures.vivipares.Lycanthrope;
import ga2.projetzoofantastique.models.enclos.Enclos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests des couples alpha
 */
class CoupleAlphaTest {

    /**
     * Méthode de test du constructeur
     */
    @Test
    public void testConstructor() {
        //On crée le couple alpha
        CoupleAlpha coupleAlpha = new CoupleAlpha();

        //Les tests
        assertNull(coupleAlpha.getLycanthropeFemelle());
        assertNull(coupleAlpha.getLycanthropeMale());
    }

    /**
     * Méthode de test des Getters
     */
    @Test
    public void testGetters() {
        //On crée le couple alpha
        CoupleAlpha coupleAlpha = new CoupleAlpha();

        //Les tests
        assertNull(coupleAlpha.getLycanthropeFemelle());
        assertNull(coupleAlpha.getLycanthropeMale());
    }

    /**
     * Méthode de test des Setters
     */
    @Test
    public void testSetters() {
        //On crée le couple alpha
        CoupleAlpha coupleAlpha = new CoupleAlpha();

        //On crée les valeurs à modifier
        Maitre maitre = new Maitre("Maitre1", "male");
        ZooFantastique zooFantastique = new ZooFantastique("ZooFantastique1", maitre, 10);
        Enclos enclos = new Enclos("Enclos1", 200, 20, zooFantastique);
        Lycanthrope lycanthropeMale = new Lycanthrope("LycanthropeMale", "male", 25, 5, enclos);
        Lycanthrope lycanthropeFemelle = new Lycanthrope("LycanthropeFemelle", "femelle", 25, 5, enclos);

        //On modifie les valeurs
        coupleAlpha.setLycanthropeMale(lycanthropeMale);
        coupleAlpha.setLycanthropeFemelle(lycanthropeFemelle);
        //Des tests
        assertNull(coupleAlpha.getLycanthropeMale());
        assertNull(coupleAlpha.getLycanthropeFemelle());

        //On modifie le rang des lycanthropes et on réessaye
        lycanthropeMale.setRang('α');
        lycanthropeFemelle.setRang('α');
        coupleAlpha.setLycanthropeMale(lycanthropeMale);
        coupleAlpha.setLycanthropeFemelle(lycanthropeFemelle);
        //Tests
        assertEquals(lycanthropeMale, coupleAlpha.getLycanthropeMale());
        assertEquals(lycanthropeFemelle, coupleAlpha.getLycanthropeFemelle());

        //On test qu'il est bel et bien impossible de set un male à la place d'une femelle et inversement
        coupleAlpha.setLycanthropeFemelle(lycanthropeMale);
        coupleAlpha.setLycanthropeMale(lycanthropeFemelle);
        //Tests
        assertEquals(lycanthropeFemelle, coupleAlpha.getLycanthropeFemelle());
        assertEquals(lycanthropeMale, coupleAlpha.getLycanthropeMale());
    }

}