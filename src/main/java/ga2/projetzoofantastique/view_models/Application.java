package ga2.projetzoofantastique.view_models;

import ga2.projetzoofantastique.models.Maitre;
import ga2.projetzoofantastique.models.ZooFantastique;
import ga2.projetzoofantastique.models.colonies.Meute;
import ga2.projetzoofantastique.models.creatures.Creature;
import ga2.projetzoofantastique.models.creatures.interfaces.Aerien;
import ga2.projetzoofantastique.models.creatures.interfaces.Aquatique;
import ga2.projetzoofantastique.models.creatures.interfaces.Terrestre;
import ga2.projetzoofantastique.models.creatures.ovipares.*;
import ga2.projetzoofantastique.models.creatures.vivipares.*;
import ga2.projetzoofantastique.models.enclos.Aquarium;
import ga2.projetzoofantastique.models.enclos.Enclos;
import ga2.projetzoofantastique.models.enclos.Voliere;
import ga2.projetzoofantastique.models.threads.Simulation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * L'application du zoo
 */
public class Application {
    //COULEUR POUR LES SYSTEM OUT
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    /**
     * L'année du zoo
     */
    public static int annee;
    /**
     * Le mois du zoo
     */
    public static int mois;
    /**
     * Le zoo de la simulation
     */
    private ZooFantastique zooFantastique;

    /**
     * Le constructeur de l'application
     */
    public Application() {
        this.annee = 0;
        this.mois = 0;
        this.zooFantastique = new ZooFantastique("Zoo Fantastique", new Maitre("Maître", "male"), 10);

        //On crée les éléments de base du zoo

        //Lycanthropes
        Enclos enclosLycanthropes1 = new Enclos("Enclos de Lycanthropes 1", 200, 20);
        zooFantastique.ajouterEnclos(enclosLycanthropes1);
        Meute meuteLycanthropes1 = new Meute(enclosLycanthropes1);
        Lycanthrope lycanthrope1 = new Lycanthrope("Lycanthrope1", "male", 80, 1.50, null);
        Lycanthrope lycanthrope2 = new Lycanthrope("Lycanthrope2", "femelle", 80, 1.50, null);
        enclosLycanthropes1.ajouterCreature(lycanthrope1);
        enclosLycanthropes1.ajouterCreature(lycanthrope2);
        meuteLycanthropes1.ajouterLycanthrope(lycanthrope1);
        meuteLycanthropes1.ajouterLycanthrope(lycanthrope2);
        meuteLycanthropes1.constituerCoupleAlpha();


        Enclos enclosLycanthropes2 = new Enclos("Enclos de Lycanthropes 2", 200, 20);
        zooFantastique.ajouterEnclos(enclosLycanthropes2);
        Meute meuteLycanthropes2 = new Meute(enclosLycanthropes2);
        Lycanthrope lycanthrope3 = new Lycanthrope("Lycanthrope3", "male", 80, 1.50, null);
        Lycanthrope lycanthrope4 = new Lycanthrope("Lycanthrope4", "femelle", 80, 1.50, null);
        enclosLycanthropes2.ajouterCreature(lycanthrope3);
        enclosLycanthropes2.ajouterCreature(lycanthrope4);
        meuteLycanthropes2.ajouterLycanthrope(lycanthrope3);
        meuteLycanthropes2.ajouterLycanthrope(lycanthrope4);
        meuteLycanthropes2.constituerCoupleAlpha();


        Enclos enclosLycanthropes3 = new Enclos("Enclos de Lycanthropes 3", 200, 20);
        zooFantastique.ajouterEnclos(enclosLycanthropes3);
        Meute meuteLycanthropes3 = new Meute(enclosLycanthropes3);
        Lycanthrope lycanthrope5 = new Lycanthrope("Lycanthrope5", "male", 80, 1.50, null);
        Lycanthrope lycanthrope6 = new Lycanthrope("Lycanthrope6", "femelle", 80, 1.50, null);
        enclosLycanthropes3.ajouterCreature(lycanthrope5);
        enclosLycanthropes3.ajouterCreature(lycanthrope6);
        meuteLycanthropes3.ajouterLycanthrope(lycanthrope5);
        meuteLycanthropes3.ajouterLycanthrope(lycanthrope6);
        meuteLycanthropes3.constituerCoupleAlpha();


        //Licornes
        Enclos enclosLicornes = new Enclos("Enclos de Licornes", 200, 20);
        zooFantastique.ajouterEnclos(enclosLicornes);
        Licorne licorne1 = new Licorne("Licorne1", "male", 80, 1.50, null);
        Licorne licorne2 = new Licorne("Licorne2", "femelle", 80, 1.50, null);
        enclosLicornes.ajouterCreature(licorne1);
        enclosLicornes.ajouterCreature(licorne2);


        //Nymphes
        Enclos enclosNymphes = new Enclos("Enclos de Nymphes", 200, 20);
        zooFantastique.ajouterEnclos(enclosNymphes);
        Nymphe nymphe1 = new Nymphe("Nymphe1", "male", 40, 1, null);
        Nymphe nymphe2 = new Nymphe("Nymphe2", "femelle", 40, 1, null);
        enclosNymphes.ajouterCreature(nymphe1);
        enclosNymphes.ajouterCreature(nymphe2);


        //Sirènes
        Aquarium aquariumSirenes = new Aquarium("Aquarium de Sirènes", 200, 20, 20);
        zooFantastique.ajouterEnclos(aquariumSirenes);
        Sirene sirene1 = new Sirene("Sirène1", "male", 70, 1, null);
        Sirene sirene2 = new Sirene("Sirène2", "femelle", 70, 1, null);
        aquariumSirenes.ajouterCreature(sirene1);
        aquariumSirenes.ajouterCreature(sirene2);


        //Dragons
        Voliere voliereDragons = new Voliere("Volière de Dragons", 200, 20, 20);
        zooFantastique.ajouterEnclos(voliereDragons);
        Dragon dragon1 = new Dragon("Dragon1", "male", 300,5, null);
        Dragon dragon2 = new Dragon("Dragon2", "femelle", 300,5, null);
        voliereDragons.ajouterCreature(dragon1);
        voliereDragons.ajouterCreature(dragon2);

        //Phénix
        Voliere volierePhenix = new Voliere("Volière de Phénix", 200, 20, 20);
        zooFantastique.ajouterEnclos(volierePhenix);
        Phenix phenix1 = new Phenix("Phénix1", "male", 50,4, null);
        Phenix phenix2 = new Phenix("Phénix2", "femelle", 50,4, null);
        volierePhenix.ajouterCreature(phenix1);
        volierePhenix.ajouterCreature(phenix2);

        //Krakens
        Aquarium aquariumKrakens = new Aquarium("Aquarium de Krakens", 200, 20, 20);
        zooFantastique.ajouterEnclos(aquariumKrakens);
        Kraken kraken1 = new Kraken("Kraken1", "male", 250, 10, null);
        Kraken kraken2 = new Kraken("Kraken2", "femelle", 250, 10, null);
        aquariumKrakens.ajouterCreature(kraken1);
        aquariumKrakens.ajouterCreature(kraken2);


        //Megalodons
        Aquarium aquariumMegalodons = new Aquarium("Aquarium de Megalodons", 200, 20, 20);
        zooFantastique.ajouterEnclos(aquariumMegalodons);
        Megalodon megalodon1 = new Megalodon("Megalodon1", "male", 175, 6, null);
        Megalodon megalodon2 = new Megalodon("Megalodon2", "femelle", 175, 6, null);
        aquariumMegalodons.ajouterCreature(megalodon1);
        aquariumMegalodons.ajouterCreature(megalodon2);


    }

    /**
     * Ajoute un mois à la date
     */
    public void ajouterMois() {
        if (this.mois == 12) {
            this.mois = 0;
            this.annee += 1;
            for (int i = 0 ; i < this.zooFantastique.afficherCreatures().size() ; ++i) {
                this.zooFantastique.afficherCreatures().get(i).vieillir();
            }
        }
        else {
            this.mois += 1;
        }
        this.zooFantastique.getColonie().ajouterMois();
    }

    /**
     * Modifier les indicateurs des créatures
     */
    public void modifierAleatoirementCreatures() {
        Random random = new Random();
        Creature creature = null;
        int nombreRandom = 0;
        for (int i = 0 ; i < this.zooFantastique.afficherCreatures().size() ; ++i) {
            creature = this.zooFantastique.afficherCreatures().get(i);

            // SOMMEIL

            if (!(creature.getEnclos() == null)) {
                nombreRandom = random.nextInt(2);
                if (creature.isSommeil() && nombreRandom == 0) {
                    creature.seReveiller();
                } else if (!creature.isSommeil() && nombreRandom == 0) {
                    creature.dormir();
                }
            }

            //FAIM
            if (!(creature.getEnclos() == null)) {
                nombreRandom = random.nextInt(10);
                if (nombreRandom == 0) {
                    creature.affamer();
                    System.out.println(creature.getNom() + " (" + creature.getEnclos().getNom() + ") a plus faim qu'avant.");
                }
            }


            //SANTE
            if (!(creature.getEnclos() == null)) {
                nombreRandom = random.nextInt(20);
                if (nombreRandom == 0) {
                    creature.empoisonner();
                    System.out.println(creature.getNom() + " (" + creature.getEnclos().getNom() + ") est plus malade qu'avant.");
                }
            }


            //COURIR
            if (!(creature.getEnclos() == null)) {
                if (creature instanceof Terrestre) {
                    nombreRandom = random.nextInt(12);
                    if (nombreRandom == 0) {
                        ((Terrestre) creature).courir();
                    }
                }
            }


            //VOLER
            if (!(creature.getEnclos() == null)) {
                if (creature instanceof Aerien) {
                    nombreRandom = random.nextInt(12);
                    if (nombreRandom == 0) {
                        ((Aerien) creature).voler();
                    }
                }
            }


            //NAGER
            if (!(creature.getEnclos() == null)) {
                if (creature instanceof Aquatique) {
                    nombreRandom = random.nextInt(12);
                    if (nombreRandom == 0) {
                        ((Aquatique) creature).nager();
                    }
                }
            }


            //CRIER
            if (!(creature.getEnclos() == null)) {
                if (!(creature instanceof Lycanthrope)) {
                    nombreRandom = random.nextInt(12);
                    if (nombreRandom == 0) {
                        creature.emettreSon();
                    }
                }
            }


            //ENFANTER
            if (!(creature.getEnclos() == null)) {
                if (!(creature instanceof Lycanthrope)) {
                    if (creature.getMoisSaisonAmour().contains(mois)) {
                        if (creature instanceof Ovipare) {
                            nombreRandom = random.nextInt(20);
                            if (nombreRandom == 0) {
                                ((Ovipare) creature).pondre();
                            }
                        }
                        if (creature instanceof Vivipare) {
                            nombreRandom = random.nextInt(20);
                            if (nombreRandom == 0) {
                                ((Vivipare) creature).mettreBas();
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Modifie aléatoirement les indicateurs des enclos
     */
    public void modifierAleatoirementEnclos() {
        Random random = new Random();
        Enclos enclos = null;
        int nombreRandom = 0;
        for (int i = 0 ; i < this.zooFantastique.getEnclos().size() ; ++i) {
            enclos = this.zooFantastique.getEnclos().get(i);

            //PROPRETE
            nombreRandom = random.nextInt(10);
            if (nombreRandom==0) {
                enclos.salir();
                System.out.println(this.zooFantastique.getEnclos().get(i).getNom() + " est plus sale qu'avant.");
            }

            //SALINITE
            if (enclos instanceof Aquarium) {
                nombreRandom = random.nextInt(10);
                if (nombreRandom==0) {
                    ((Aquarium) enclos).desaliniser();
                    System.out.println(this.zooFantastique.getEnclos().get(i).getNom() + " se désalinise.");
                }
            }
        }
    }

    /**
     * Demande les input du joueur
     */
    public void maitreJoue() {
        //On crée le Scanner
        Scanner input = new Scanner(System.in);

        System.out.println(ANSI_CYAN + "\n\nAccéder à un enclos : \n" + ANSI_RESET);
        for (int i = 0 ; i < this.zooFantastique.getEnclos().size() ; ++i) {
            System.out.println(ANSI_YELLOW + "[" + i + "]\t\t" + this.zooFantastique.afficherEnclos().get(i) + ANSI_RESET);
        }

        System.out.println();

        //On lit l'input de l'enclos choisi
        int indiceEnclos = 0;
        int action = 0;
        int choixCreature = 0;
        System.out.print(ANSI_CYAN + "Enclos : " + ANSI_RESET);
        try {
            indiceEnclos = input.nextInt();
            //On affiche l'enclos choisit
            System.out.println(ANSI_PURPLE + "\n\n" + zooFantastique.getEnclos().get(indiceEnclos).afficherCaracteristiques() + ANSI_RESET);
            if (zooFantastique.getEnclos().get(indiceEnclos) instanceof Aquarium) {
                System.out.println(ANSI_BLUE + "\n\nActions à réaliser dans cet enclos : \n"+ ANSI_GREEN +
                        "\n[0]\tNettoyer enclos" +
                        "\n[1]\tNourrir créatures" +
                        "\n[2]\tSoigner créatures" +
                        "\n[3]\tSaliniser l'eau" +
                        "\n[4]\tAfficher la liste des créatures\n" + ANSI_RESET);
                try {
                    System.out.print(ANSI_BLUE + "Action : " + ANSI_RESET);
                    action = input.nextInt();
                    if (action == 0) {
                        this.zooFantastique.getEnclos().get(indiceEnclos).nettoyer();
                        System.out.println(ANSI_PURPLE+ "\nLes créatures de " + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " quittent l'enclos temporairement." + ANSI_RESET );
                        System.out.println(ANSI_PURPLE + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " nettoyé avec succès." + ANSI_RESET);
                        System.out.println(ANSI_PURPLE + "Les créatures de " + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " reviennent dans leur enclos." + ANSI_RESET);
                    }
                    else if (action == 1) {
                        this.zooFantastique.getEnclos().get(indiceEnclos).nourrirCreatures();
                        System.out.println(ANSI_PURPLE + "\nCréatures de " + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " nourries avec succès." + ANSI_RESET);
                    }
                    else if (action == 2) {
                        this.zooFantastique.getEnclos().get(indiceEnclos).soigner();
                        System.out.println(ANSI_PURPLE + "\nCréatures de " + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " soignées avec succès." + ANSI_RESET);
                    }
                    else if (action == 3) {
                        ((Aquarium) this.zooFantastique.getEnclos().get(indiceEnclos)).saliniser();
                        System.out.println(ANSI_PURPLE + "\nEau de " + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " salinisée avec succès." + ANSI_RESET);
                    }
                    else if (action == 4) {
                        System.out.println(ANSI_CYAN + "\n\nAfficher les caractéristiques d'une créature : \n" + ANSI_RESET);
                        for (int i = 0 ; i < zooFantastique.getEnclos().get(indiceEnclos).getCreatures().size() ; ++i) {
                            System.out.println(ANSI_YELLOW + "[" + i + "]\t\t" + zooFantastique.getEnclos().get(indiceEnclos).getCreatures().get(i).getNom() + ANSI_RESET);
                        }
                        try {
                            System.out.print(ANSI_CYAN + "\nChoix : " + ANSI_RESET);
                            choixCreature = input.nextInt();
                            System.out.println(ANSI_PURPLE + "\n\n" + zooFantastique.getEnclos().get(indiceEnclos).getCreatures().get(choixCreature).afficherCaracteristiques() + ANSI_RESET);
                        }
                        catch (InputMismatchException | IndexOutOfBoundsException e) {
                            System.out.println(ANSI_RED + "\nVeuillez saisir un numéro correspondant à une action." + ANSI_RESET);
                        }
                    }
                    else {
                        throw new IndexOutOfBoundsException();
                    }

                } catch (InputMismatchException | IndexOutOfBoundsException e) {
                    System.out.println(ANSI_RED + "\nVeuillez saisir un numéro correspondant à une action." + ANSI_RESET);
                }
            }
            else {
                System.out.println(ANSI_BLUE + "\n\nActions à réaliser dans cet enclos : \n"+ ANSI_GREEN +
                        "\n[0]\tNettoyer enclos" +
                        "\n[1]\tNourrir créatures" +
                        "\n[2]\tSoigner créatures" +
                        "\n[3]\tAfficher la liste des créatures\n" + ANSI_RESET);
                try {
                    System.out.print(ANSI_BLUE + "Action : " + ANSI_RESET);
                    action = input.nextInt();
                    if (action == 0) {
                        this.zooFantastique.getEnclos().get(indiceEnclos).nettoyer();
                        System.out.println(ANSI_PURPLE+ "\nLes créatures de " + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " quittent l'enclos temporairement." + ANSI_RESET );
                        System.out.println(ANSI_PURPLE + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " nettoyé avec succès." + ANSI_RESET);
                        System.out.println(ANSI_PURPLE + "Les créatures de " + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " reviennent dans leur enclos." + ANSI_RESET);
                    }
                    else if (action == 1) {
                        this.zooFantastique.getEnclos().get(indiceEnclos).nourrirCreatures();
                        System.out.println(ANSI_PURPLE + "\nCréatures de " + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " nourries avec succès." + ANSI_RESET);
                    }
                    else if (action == 2) {
                        this.zooFantastique.getEnclos().get(indiceEnclos).soigner();
                        System.out.println(ANSI_PURPLE + "\nCréatures de " + zooFantastique.getEnclos().get(indiceEnclos).getNom() + " soignées avec succès." + ANSI_RESET);
                    }
                    else if (action == 3) {
                        System.out.println(ANSI_CYAN + "\n\nAfficher les caractéristiques d'une créature : \n" + ANSI_RESET);
                        for (int i = 0 ; i < zooFantastique.getEnclos().get(indiceEnclos).getCreatures().size() ; ++i) {
                            System.out.println(ANSI_YELLOW + "[" + i + "]\t\t" + zooFantastique.getEnclos().get(indiceEnclos).getCreatures().get(i).getNom() + ANSI_RESET);
                        }
                        try {
                            System.out.print(ANSI_CYAN + "\nChoix : " + ANSI_RESET);
                            choixCreature = input.nextInt();
                            System.out.println(ANSI_PURPLE + "\n\n" + zooFantastique.getEnclos().get(indiceEnclos).getCreatures().get(choixCreature).afficherCaracteristiques() + ANSI_RESET);
                        }
                        catch (InputMismatchException | IndexOutOfBoundsException e) {
                            System.out.println(ANSI_RED + "\nVeuillez saisir un numéro correspondant à une action." + ANSI_RESET);
                        }
                    }
                    else {
                        throw new IndexOutOfBoundsException();
                    }

                } catch (InputMismatchException | IndexOutOfBoundsException e) {
                    System.out.println(ANSI_RED + "\nVeuillez saisir un numéro correspondant à une action." + ANSI_RESET);
                }
            }
        }
        catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println(ANSI_RED + "\nVeuillez saisir un numéro d'enclos existant." + ANSI_RESET);
        }


    }

    /**
     * Lance la simulation
     */
    public void lancerSimulation() {
        Simulation simulation = new Simulation(this);
        simulation.start();
        this.zooFantastique.getColonie().lancerSimulationLycanthropes();
        while (true) {
            maitreJoue();
        }
    }
}
