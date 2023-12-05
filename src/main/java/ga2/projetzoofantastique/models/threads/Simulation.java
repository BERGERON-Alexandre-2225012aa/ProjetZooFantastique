package ga2.projetzoofantastique.models.threads;

import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.view_models.Application;

/**
 * Le thread de simulation
 */
public class Simulation extends Thread {

    /**
     * Le zoo fantastique
     */
    private Application application;

    /**
     * Le constructeur
     * @param application
     */
    public Simulation(Application application) {
        this.application = application;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.application.ajouterMois();
            System.out.println("\n\nDate : " + Application.mois + "/" + Application.annee +"\n");
            this.application.modifierAleatoirementEnclos();
            this.application.modifierAleatoirementCreatures();
        }
    }
}
