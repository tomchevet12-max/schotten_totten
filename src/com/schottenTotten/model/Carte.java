package com.schottenTotten.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carte {
    private int valeur;
    private String couleur;

    public Carte(int valeur, String couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public int getValeur()
    {
        return valeur;
    }

    public String getCouleur()
    {
        return couleur;
    }

    public static List<Carte> Pioche() {

        String[] couleurs = {"Rouge", "Vert", "Bleu", "Doré", "Violet", "Marron"};
        int[] valeurs = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Carte> pioche = new ArrayList<>();

        for (String couleur : couleurs) {
            for (int valeur : valeurs) {
                pioche.add(new Carte(valeur, couleur));
            }
        }

        Collections.shuffle(pioche);

        return pioche;
    }




}

