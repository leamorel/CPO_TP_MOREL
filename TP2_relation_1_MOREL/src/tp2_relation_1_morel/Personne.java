package tp2_relation_1_morel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leamo
 */
public class Personne {
    public String Nom;
    public String Prenom;
    public int nbVoitures;
    public Voiture[] liste_voitures;
    private Personne proprietaire;
    
    
public Personne(String unNom, String unPrenom){
    Nom=unNom;
    Prenom=unPrenom;
    liste_voitures = new Voiture [3] ;
    nbVoitures = 0;
    
} 

@Override
  public String toString () {
  return "nom:"+ Nom + "prenom:"+ Prenom;   
}
  
  public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
      if (proprietaire!=null || (nbVoitures == 3)){
          return false;
      }else{
          nbVoitures+=1;
          liste_voitures[nbVoitures] = voiture_a_ajouter;          
          voiture_a_ajouter.proprietaire = this ; 
          return true;
      }
          
      }
        
  
}