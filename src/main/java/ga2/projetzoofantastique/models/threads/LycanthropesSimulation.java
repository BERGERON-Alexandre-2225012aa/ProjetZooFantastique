package ga2.projetzoofantastique.models.threads;

import ga2.projetzoofantastique.models.colonies.Colonie;

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
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            colonie.faireQuitterCertainsLycanthropesOmega();
            colonie.verifierSiBesoinCreerMeute();
            colonie.faireEvoluerHierarchies();
            colonie.transformerCertainsLycanthropes();
            colonie.genererHurlements();
            colonie.verifierSiSaisonAmour();
        }
    }
}
