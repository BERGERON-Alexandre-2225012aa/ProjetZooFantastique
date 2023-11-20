package ga2.projetzoofantastique.models;

import java.util.ArrayList;

public class Enclos {
    private String nom;
    private double superficie;
    private int capacite;
    private int nombreDeCreatures;
    private ArrayList<Creature> creatures;
    private int proprete;
    private ZooFantastique zooFantastique;
    private Meute meute;
    public Enclos(String nom, double superficie, int capacite, ZooFantastique zooFantastique) {
        this.nom = nom;
        this.superficie = superficie;
        this.capacite = capacite;
        this.nombreDeCreatures = 0;
        this.creatures = new ArrayList<>();
        this.proprete = 2;
        this.zooFantastique = zooFantastique;
        this.meute = null;
    }
}
