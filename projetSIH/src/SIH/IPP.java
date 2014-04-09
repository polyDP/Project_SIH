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
public class IPP {
    
     private Date date;

    private int compteur;

    private String numero;
    
    public IPP(){
        
        this.compteur=0;
        this.numero="00000";
    }
    
    public IPP(Date date){
        this.date = date;
        final int nbDigits = 5;
        NumberFormat nbf = NumberFormat.getNumberInstance();
        nbf.setMinimumIntegerDigits(nbDigits);
        nbf.setGroupingUsed(false);
        nbf.setMaximumIntegerDigits(nbDigits);
        numero = nbf.format(compteur);
        this.incrementerCompteur();
    }
    public void incrementerCompteur() {
        final int nbDigits = 5;
        NumberFormat nbf = NumberFormat.getNumberInstance();
        nbf.setMinimumIntegerDigits(nbDigits);
        nbf.setGroupingUsed(false);
        nbf.setMaximumIntegerDigits(nbDigits);
        compteur = (compteur + 1);
        numero = (nbf.format(compteur));

    }
    
    public String getIpp(){
        return date.formatAnneeString2digit()+numero;
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
    
}
