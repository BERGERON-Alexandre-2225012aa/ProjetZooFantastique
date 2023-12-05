package ga2.projetzoofantastique.models.threads;

import ga2.projetzoofantastique.models.colonies.Colonie;
import ga2.projetzoofantastique.view_models.Application;

/**
 * Thread de simulation des lycanthropes
 */
public class LycanthropesSimulation extends Thread {

    /**
     * La colonie
     */
    private Colonie colonie;

    /**
     * Le constructeur
     * @param colonie
     */
    public LycanthropesSimulation(Colonie colonie) {
        this.colonie = colonie;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                colonie.faireQuitterCertainsLycanthropesOmega();
                colonie.verifierSiBesoinCreerMeute();
                colonie.faireEvoluerHierarchies();
                colonie.transformerCertainsLycanthropes();
                colonie.genererHurlements();
                colonie.verifierSiSaisonAmour();
            }
            catch (NullPointerException e) {
                System.out.println(Application.ANSI_RED + "Erreur, vérifier manuellement l'état des créatures." + Application.ANSI_RESET);
            }
        }
    }
}
