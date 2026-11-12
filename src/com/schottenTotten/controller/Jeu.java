package com.schottenTotten.controller;

import com.schottenTotten.model.Carte;
import java.util.List;

public class Jeu {

    public static void main(String[] args) {

        List<Carte> paquet = Carte.creationPaquet();

        System.out.println("Nombre de cartes : " + paquet.size());

        for (Carte carte : paquet) {
            System.out.println(carte.getValeur() + " " + carte.getCouleur());
        }
    }
}