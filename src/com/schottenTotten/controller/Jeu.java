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

        System.out.println("Bienvenue" + pseudoJ1 + ", vous êtes le joueur 1");
        System.out.println("Voici votre main");
        Affichage.AfficherMain(mainJ1);

        System.out.println("Bienvenue" + pseudoJ2 + ", vous êtes le joueur 2 ");
        System.out.println("Voici votre main");
        Affichage.AfficherMain(mainJ2);

        System.out.println("Nombre de carte dans la pioche : " + pioche.size());

        while (true)
        {
            System.out.println("Tour de " + pseudoJ1);
            Tour(joueurJ1, mainJ1, List_Bornes, pioche, scanner);
    
            System.out.println("Tour de " + pseudoJ2);
            Tour(joueurJ2, mainJ2, List_Bornes, pioche, scanner);

        }

        

     }

    public static void Tour(Joueur joueur, List<Carte> main, List<Borne> List_Bornes, List<Carte> pioche, Scanner scanner) {

        Affichage.AfficherMain(main);
    
        System.out.print("Quelle carte voulez-vous poser ? ");
        int choix_carte = scanner.nextInt();
    
        if (choix_carte < 1 || choix_carte > main.size()) {
            throw new IllegalArgumentException("Choix de carte invalide");
        }
    
        System.out.print("Dans quelle borne voulez-vous la jouer ? ");
        int choix_borne = scanner.nextInt();
    
        if (choix_borne < 1 || choix_borne > List_Bornes.size()) {
            throw new IllegalArgumentException("Choix de borne invalide");
        }
    
        Carte carteChoisie = main.get(choix_carte - 1);
        Borne borneChoisie = List_Bornes.get(choix_borne - 1);
    
        joueur.PoserCarte(borneChoisie, carteChoisie, main, pioche);
    
        borneChoisie.AfficherBorne();
    
        System.out.println("Nombre de cartes dans la pioche : " + pioche.size());
    }
}