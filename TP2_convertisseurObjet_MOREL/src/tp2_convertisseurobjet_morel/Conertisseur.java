package tp2_convertisseurobjet_morel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leamo
 */
public class Conertisseur {

    public int nbConversions;


    //this. désigne nbConversions dans la classe

    /**
     *
     */
    public Conertisseur() {
        nbConversions = 0;
    }
    
    //retourne le nombre de conversions effectuées 
    @Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

    public double CelciusVersKelvin (double temp_celcius){
        double temp_kelvin=temp_celcius+273;
        nbConversions+=1;
        return temp_kelvin;
    }    
    public double KelvinVersCelcius (double temp_kelvin){
        double temp_celcius=temp_kelvin-273;
        nbConversions+=1;
        return temp_celcius;
    }        
    public double FarenheitVersCelcius (double temp_farenheit){
        double temp_celcius=(temp_farenheit-32)*5/9;
        nbConversions+=1;
        return temp_celcius;
    }   
    public double CelciusVersFarenheit (double temp_celcius){
        double temp_farenheit=temp_celcius*9/5+32;
        nbConversions+=1;
        return temp_farenheit;
    } 
    public double FarenheitVersKelvin (double temp_farenheit){
        double temp_kelvin=(temp_farenheit+459.67)*5/9;
        nbConversions+=1;
        return temp_kelvin;
    } 
    public double KelvinVersFarenheit (double temp_kelvin){
        double temp_farenheit=temp_kelvin*9/5-459.67;
        nbConversions+=1;
        return temp_farenheit;
    } 
    
       
}
}
