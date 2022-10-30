package tp2_relation_1_morel;

import static java.lang.constant.ConstantDescs.NULL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leamo
 */
public class Voiture {

    public String Modele;
    public String Marque;
    public int PuissanceCV;
    public Personne proprietaire ;

    public Voiture(String leModele, String laMarque, int laPuissanceCV) {
        Modele = leModele;
        Marque = laMarque;
        PuissanceCV = laPuissanceCV;
        proprietaire = null;
    }

    @Override
    public String toString() {
        return Modele;
    }

}
