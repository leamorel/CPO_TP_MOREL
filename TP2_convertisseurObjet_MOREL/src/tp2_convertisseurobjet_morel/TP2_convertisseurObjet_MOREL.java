/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_morel;

import java.util.Scanner;

/**
 *
 * @author leamo
 */
public class TP2_convertisseurObjet_MOREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conertisseur convert=new Conertisseur();
        
        System.out.println("saisir la valeur a convertir");                       
        Scanner sc=new Scanner (System.in);
        double val=sc.nextDouble();
        System.out.println("saisir : 1 pour convertir des Celcius en Kelvin, 2 pour convertir des Kelvin en Celcius, 3 pour convertir des Farenheit en Celcius, 4 pour convertir des Celcius en Farenheit, 5 pour convertir des Farenheit en Kelvin et 6 pour convertir des Kelvin en Farenheit");    
        int conv=sc.nextInt();
        
        if (conv==1){
            System.out.println(convert.CelciusVersKelvin( val));
        }
        if(conv==2){
            System.out.println(convert.KelvinVersCelcius(val));           
        }
        if(conv==3){
            System.out.println(convert.FarenheitVersCelcius(val));           
        }
        if(conv==4){
            System.out.println(convert.CelciusVersFarenheit(val));
        }
        if(conv==5){
            System.out.println(convert.FarenheitVersKelvin(val));
        }
        if(conv==6){
            System.out.println(convert.KelvinVersFarenheit(val));
        }       
        
    }
    
}
