package com.schottenTotten.model;

import com.schottenTotten.model.Carte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Joueur{

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

    public static String Pseudo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre pseudo : ");

        return scanner.nextLine();

    }


    

}