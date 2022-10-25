/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_morel;

/**
 *
 * @author leamo
 */
public class TP2_Bieres_MOREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   /** BouteilleBiere uneBiere = new BouteilleBiere() ; 
    
    uneBiere.nom = "Cuvée des trolls";
    uneBiere.degreAlcool = (float) 7.0 ;
    uneBiere.brasserie = "Dubuisson" ;
    uneBiere.ouverte = false;
   */
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
    uneBiere.lireEtiquette(); 
    
  /**  BouteilleBiere autreBiere = new BouteilleBiere() ; 
    
    autreBiere.nom = "Leffe";
    autreBiere.degreAlcool = (float) 6.6 ;
    autreBiere.brasserie = "Abbaye de Leffe" ;
    autreBiere.ouverte = false;
  */
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;  
    autreBiere.lireEtiquette(); 
    
    BouteilleBiere Biere1 = new BouteilleBiere ("Heineken", (float) 5.0,"Heineken France") ;  
    Biere1.lireEtiquette(); 
    
    BouteilleBiere Biere2 = new BouteilleBiere ("Goudale", (float) 7.2,"Brasserie d'Arques") ;  
    Biere2.lireEtiquette(); 
    
    BouteilleBiere Biere3 = new BouteilleBiere ("Ciney", (float) 7.0,"Brasserie de Biron") ;  
    Biere3.lireEtiquette(); 
    Biere3.Décapsuler();
    }   
}
