package com.schottenTotten.controller;

import com.schottenTotten.model.*;
import com.schottenTotten.view.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jeu {

    public static void main(String[] args) {

        List<Carte> pioche = Carte.Pioche();
        List<Carte> mainJ1 = Joueur.MainJoueur(pioche);
        List<Carte> mainJ2 = Joueur.MainJoueur(pioche);
        String pseudoJ1 = Joueur.Pseudo(1);
        String pseudoJ2 = Joueur.Pseudo(2);

        Joueur joueurJ1 = new Joueur(1, pseudoJ1);
        Joueur joueurJ2 = new Joueur(2,pseudoJ2);

        List<Borne> List_Bornes = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            List_Bornes.add(new Borne(i));
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue, vous êtes le joueur 1" + pseudoJ1);
        System.out.println("Voici votre main");
        Affichage.AfficherMain(mainJ1);

        System.out.println("Bienvenue, vous êtes le joueur 2" + pseudoJ2);
        System.out.println("Voici votre main");
        Affichage.AfficherMain(mainJ2);


        System.out.println("Nombre de carte dans la pioche : " + pioche.size());

        //1 tour de table
    //     System.out.print("J1:Quelle carte voulez-vous poser ? ");
    //     int choix_carte = scanner.nextInt();

    //     if (choix_carte < 1 || choix_carte > mainJ1.size()) {
    //         throw new IllegalArgumentException("Choix de carte invalide");
    //     }

    //     System.out.print("Dans quelle borne voulez-vous la jouer ? ");
    //     int choix_borne = scanner.nextInt();

    //     if (choix_borne < 1 || choix_borne > List_Bornes.size()) {
    //         throw new IllegalArgumentException("Choix de borne invalide");
    //     }

    //     Carte carteChoisie = main.get(choix_carte - 1);
    //     Borne borneChoisie = List_Bornes.get(choix_borne - 1);

    //     joueurJ1.PoserCarte(borneChoisie, carteChoisie, main, pioche);

    //     borneChoisie.AfficherBorne();

    //     System.out.println("Nombre de carte dans la pioche : " + pioche.size());
     }
}