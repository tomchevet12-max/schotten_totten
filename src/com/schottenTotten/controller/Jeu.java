package com.schottenTotten.controller;

import com.schottenTotten.model.Carte;
import com.schottenTotten.model.Joueur;

import java.util.List;

public class Jeu {

    public static void main(String[] args) {


        List<Carte> pioche = Carte.Pioche();
        List<Carte> main = Joueur.MainJoueur(pioche);
        String pseudo = Joueur.Pseudo();

        
        
        for (Carte carte : main) {
            System.out.println(carte.getValeur() + " " + carte.getCouleur());
        }
        
        System.out.println("Nombre de carte dans la pioche :" +pioche.size());
        System.out.println("Bienvenue " + pseudo);
    }
}