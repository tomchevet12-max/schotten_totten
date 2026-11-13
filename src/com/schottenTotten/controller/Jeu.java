package com.schottenTotten.controller;

import com.schottenTotten.model.Carte;
import com.schottenTotten.model.Joueur;
import com.schottenTotten.model.Borne;

import java.util.List;
import java.util.Scanner;

public class Jeu {

    public static void main(String[] args) {

        List<Carte> pioche = Carte.Pioche();
        List<Carte> main = Joueur.MainJoueur(pioche);
        String pseudo = Joueur.Pseudo();

        Joueur joueur1 = new Joueur(1, pseudo);
        Borne borne1 = new Borne(1);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < main.size(); i++) {
            Carte carte = main.get(i);
            System.out.println((i + 1) + " : " + carte.getValeur() + " " + carte.getCouleur());
        }

        System.out.println("Nombre de carte dans la pioche : " + pioche.size());
        System.out.println("Bienvenue " + pseudo);

        System.out.print("Quelle carte voulez-vous poser ? ");
        int choix = scanner.nextInt();

        if (choix < 1 || choix > main.size()) {
            throw new IllegalArgumentException("Choix de carte invalide");
        }

        Carte carteChoisie = main.get(choix - 1);

        joueur1.PoserCarte(borne1, carteChoisie, main, pioche);

        borne1.AfficherBorne();

        System.out.println("Nombre de carte dans la pioche : " + pioche.size());
    }
}