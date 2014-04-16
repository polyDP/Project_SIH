/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    private SQL sql;
    
    private String numSejourValue;
    
    public NumeroSejour(){
        this.compteur = 0;
        this.numero = "000000";
    }
    
     public NumeroSejour(Date date) {
        typeNumSej="dateType";
        this.date = date;
        this.compteur=0;
        try {
            sql=new SQL();
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(NumeroSejour.class.getName()).log(Level.SEVERE, null, ex);
        }
        numSejourValue = sql.dernierNumeroSejour();
        
        
        int n = 5;
        int length = numSejourValue.length();
        
        numero = numSejourValue.substring(length - n, length);
        
        numero = this.incrementerNumeroSejour(numero);
        
        typeNumSej="dateType";

    }
     
    public NumeroSejour(String numSej){
        typeNumSej="stringType";
        this.numSej = numSej;
        
    }

   

    public String incrementerNumeroSejour(String numero) {
        long compteur ;
        compteur = Integer.parseInt(numero);
         final int nbdigits = 5;
         NumberFormat nbf = NumberFormat.getNumberInstance();
          nbf.setMinimumIntegerDigits(nbdigits);
          nbf.setGroupingUsed(false);
           nbf.setMaximumIntegerDigits(nbdigits);
           
           String sformatee = nbf.format(compteur+1);
           
        return sformatee;

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
    
    public String toString(){
        String numeroSejour=null;
        
        if(typeNumSej.equals("dateType")){
            
          numeroSejour = date.formatAnneeString2digit()+date.formatMoisString()+numero;  
        } else if(typeNumSej.equals("stringType")){
          numeroSejour= numSej;
            
        }
        return numeroSejour;
    }

}
