package ga2.projetzoofantastique.models.colonies;

import ga2.projetzoofantastique.models.creatures.vivipares.Lycanthrope;

public class CoupleAlpha {

    /**
     * Lycanthrope male du couple
     */
    private Lycanthrope lycanthropeMale;
    /**
     * Lycanthrope femelle du couple
     */
    private Lycanthrope lycanthropeFemelle;

    /**
     * Constructeur du couple alpha
     */
    public CoupleAlpha() {
        this.lycanthropeFemelle = null;
        this.lycanthropeMale = null;
    }

    /**
     * Getter du lycanthrope femelle
     * @return
     */
    public Lycanthrope getLycanthropeFemelle() {
        return lycanthropeFemelle;
    }

    /**
     * Getter du lycanthrope male
     * @return
     */
    public Lycanthrope getLycanthropeMale() {
        return lycanthropeMale;
    }

    /**
     * Setter du lycanthrope femelle
     * @param lycanthropeFemelle
     */
    public void setLycanthropeFemelle(Lycanthrope lycanthropeFemelle) {
        if (lycanthropeFemelle.getRang() == 'α') {
            if (lycanthropeFemelle.getSexe().equals("femelle")) {
                this.lycanthropeFemelle = lycanthropeFemelle;
            }
        }
    }

    /**
     * Setter du lycanthrope male
     * @param lycanthropeMale
     */
    public void setLycanthropeMale(Lycanthrope lycanthropeMale) {
        if (lycanthropeMale.getRang() == 'α') {
            if ( lycanthropeMale.getSexe().equals("male")) {
                this.lycanthropeMale = lycanthropeMale;
            }
        }
    }
}
