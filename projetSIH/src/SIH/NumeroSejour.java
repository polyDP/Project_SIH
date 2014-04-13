/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

import java.text.NumberFormat;

/**
 *
 * @author Baptiste-PC
 */
public class NumeroSejour {

    private Date date;

    private int compteur;

    private String numero;
    
    private String numSej;
    
    private String typeNumSej;
    
    public NumeroSejour(String numSej){
        this.numSej = numSej;
        typeNumSej="StringType";
    }

    public NumeroSejour(Date date) {
        this.date = date;
        this.compteur=0;
        this.numero="0000";
        final int nbDigits = 4;
        NumberFormat nbf = NumberFormat.getNumberInstance();
        nbf.setMinimumIntegerDigits(nbDigits);
        nbf.setGroupingUsed(false);
        nbf.setMaximumIntegerDigits(nbDigits);
        numero = nbf.format(compteur);
        typeNumSej="DateType";

    }

    public void incrementerCompteur() {
        final int nbDigits = 4;
        NumberFormat nbf = NumberFormat.getNumberInstance();
        nbf.setMinimumIntegerDigits(nbDigits);
        nbf.setGroupingUsed(false);
        nbf.setMaximumIntegerDigits(nbDigits);
        compteur++;
        numero =nbf.format(compteur);

    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the compteur
     */
    public int getCompteur() {
        return compteur;
    }

    /**
     * @param compteur the compteur to set
     */
    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getNumeroSejour(){
        String numeroSejour=null;
        
        if(typeNumSej.equals("DateType")){
          numeroSejour = date.formatAnneeString2digit()+date.formatMoisString()+numero;  
        } else if(typeNumSej.equals("StringType")){
          numeroSejour= numSej;
            
        }
        return numeroSejour;
    }

}
