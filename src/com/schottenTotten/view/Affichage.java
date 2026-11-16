package com.schottenTotten.view;

import java.util.List;
import com.schottenTotten.model.Carte;

public class Affichage{

    public static void  AfficherMain(List<Carte> mainJ)
    {
        for (int i = 0; i < mainJ.size(); i++) {
            Carte carte = mainJ.get(i);
            System.out.println((i + 1) + " : " + carte.getValeur() + " " + carte.getCouleur());
        }

         
    }
    
}