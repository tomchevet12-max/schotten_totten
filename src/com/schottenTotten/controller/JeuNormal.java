package com.schottenTotten.controller;


import com.schottenTotten.model.*;
import java.util.List;

public class JeuNormal {

    public static boolean SuiteCouleur(List<Carte> cartes) {

        if (Suite(cartes) && Couleur(cartes)){
            return true;
        }

        return false;
    }



    public static boolean Brelan(List<Carte> cartes) {

        if (cartes.size() != 3) {
            return false;
        }

        Carte carte1 = cartes.get(0);
        Carte carte2 = cartes.get(1);
        Carte carte3 = cartes.get(2);

        if (carte1.getValeur() == carte2.getValeur() && carte2.getValeur() == carte3.getValeur()) {
            return true;
        }

        return false;
    }

    
    public static boolean Couleur(List<Carte> cartes)
    {
        if (cartes.size() != 3) {
            return false;
        }
        
        String couleur1 = cartes.get(0).getCouleur();
        String couleur2 = cartes.get(1).getCouleur();
        String couleur3 = cartes.get(2).getCouleur();
        
        if (couleur1.equals(couleur2)  && couleur2.equals(couleur3)) {
            return true;
        } 
        
        return false;
    }
    
    public static boolean Suite(List<Carte> cartes)
    {
        if (cartes.size() != 3) {
            return false;
        }

        int valeur1 = cartes.get(0).getValeur();
        int valeur2 = cartes.get(1).getValeur();
        int valeur3 = cartes.get(2).getValeur();

        int max = Math.max(valeur1, Math.max(valeur2, valeur3));
        int min = Math.min(valeur1, Math.min(valeur2, valeur3));

        if (max - min == 2 && valeur1 != valeur2 && valeur1 != valeur3 && valeur2 != valeur3)
        {
            return true;
        }

        return false;
    }


    public static int RangCombinaison(List<Carte> cartes) {

        if (cartes.size() != 3) {
            return 0;
        }
    
        if (SuiteCouleur(cartes)) {
            return 5;
        }
    
        if (Brelan(cartes)) {
            return 4;
        }
    
        if (Couleur(cartes)) {
            return 3;
        }
    
        if (Suite(cartes)) {
            return 2;
        }
    
        return 1;
    }

    public static int ComparerCombinaisons(List<Carte> cartesJ1, List<Carte> cartesJ2) {

        if (cartesJ1.size() != 3 || cartesJ2.size() != 3) {
            return 0;
        }

        int rangJ1 = RangCombinaison(cartesJ1);
        int rangJ2 = RangCombinaison(cartesJ2);
    
        if (rangJ1 > rangJ2) {
            return 1;
        }
    
        if (rangJ2 > rangJ1) {
            return 2;
        }

        if (rangJ1 == rangJ2)
        {
            int valeur11 = cartesJ1.get(0).getValeur();
            int valeur12 = cartesJ1.get(1).getValeur();
            int valeur13 = cartesJ1.get(2).getValeur();

            int valeur21 = cartesJ2.get(0).getValeur();
            int valeur22 = cartesJ2.get(1).getValeur();
            int valeur23 = cartesJ2.get(2).getValeur();

            int sommeJ1 = valeur11 + valeur12 + valeur13;
            int sommeJ2 = valeur21 + valeur22 + valeur23;

            if (sommeJ1 > sommeJ2){
                return 1;
            }

            if (sommeJ2 > sommeJ1){
                return 2;
            }
        }
    
        return 0;
    }


}