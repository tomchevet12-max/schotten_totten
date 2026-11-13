package com.schottenTotten.model;

import com.schottenTotten.model.Carte;
import com.schottenTotten.model.Joueur;

import java.util.ArrayList;
import java.util.List;



public class Borne{
    private int numero;
    private List<Carte> cartesJ1;
    private List<Carte> cartesJ2;

    public Borne(int numero) {
        this.numero = numero;
        this.cartesJ1 = new ArrayList<>();
        this.cartesJ2 = new ArrayList<>();
    }

    public void AjouterCarte(int numeroJoueur, Carte carte)
    {
        if (numeroJoueur == 1 && cartesJ1.size()<3) {
            cartesJ1.add(carte);
        }
        else if (numeroJoueur == 2 && cartesJ2.size()<3) {
            cartesJ2.add(carte);
        }
        else{
            throw new IllegalArgumentException("Impossible d'ajouter une carte sur cette borne");
        }
    }

    public void AfficherBorne() {

        System.out.println("Borne " + numero);
    
        System.out.println("Cartes du joueur 1 :");
        for (Carte carte : cartesJ1) {
            System.out.println(carte.getValeur() + " " + carte.getCouleur());
        }
    
        System.out.println("Cartes du joueur 2 :");
        for (Carte carte : cartesJ2) {
            System.out.println(carte.getValeur() + " " + carte.getCouleur());
        }
    }



    
}