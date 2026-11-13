package com.schottenTotten.model;

import com.schottenTotten.model.Carte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Joueur{

    private int numeroJoueur;
    private String pseudo;

    public Joueur(int numeroJoueur, String pseudo) {
        this.numeroJoueur = numeroJoueur;
        this.pseudo = pseudo;
    }

    public static List<Carte> MainJoueur(List<Carte> pioche) {
        if (pioche.size() < 6) {
        throw new IllegalArgumentException("Pas assez de cartes dans la pioche");
        }

        List<Carte> main = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Carte carte = pioche.remove(0);
            main.add(carte);
        }

        return main;

    }

    public void PoserCarte(Borne borne, Carte carte, List<Carte> main, List<Carte> pioche) {

        if (!main.contains(carte)) {
            throw new IllegalArgumentException("Cette carte n'est pas dans la main du joueur");
        }
    
        borne.AjouterCarte(numeroJoueur, carte);
    
        main.remove(carte);
    
        if (!pioche.isEmpty()) {
            Carte nouvelleCarte = pioche.remove(0);
            main.add(nouvelleCarte);
        }
    }

    public static String Pseudo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre pseudo : ");

        return scanner.nextLine();

    }


    

}