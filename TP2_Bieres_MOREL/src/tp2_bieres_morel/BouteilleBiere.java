/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_morel;

/**
 *
 * @author leamo
 */
public class BouteilleBiere {

    public String nom;
    public float degreAlcool;
    public String brasserie;
    public boolean ouverte;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);

    }

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {

        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
  
    
    }
    public boolean Décapsuler() {
        if (ouverte == false) {
            ouverte = true ;
        } else {
            System.out.println("erreur : biere déjà ouverte");           
        }
        return false;
    }



