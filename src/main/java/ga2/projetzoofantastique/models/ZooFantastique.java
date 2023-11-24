package ga2.projetzoofantastique.models;

import ga2.projetzoofantastique.models.colonies.Colonie;
import ga2.projetzoofantastique.models.enclos.Enclos;

import java.util.ArrayList;

public class ZooFantastique {
    private String nom;
    private Maitre maitre;
    private int nombreMaxEnclos;
    private ArrayList<Enclos> enclos;
    private Colonie colonie;
    public ZooFantastique(String nom, Maitre maitre, int nombreMaxEnclos) {
        this.nom = nom;
        this.maitre = maitre;
        this.nombreMaxEnclos = nombreMaxEnclos;
        this.enclos = new ArrayList<>();
        this.colonie = new Colonie();
    }
}
