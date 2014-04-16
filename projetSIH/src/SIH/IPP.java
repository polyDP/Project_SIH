/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

import Interface_alpha2.A11_DMA;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Baptiste-PC
 */
public class IPP {

    private Date date;

    private int compteur;

    private String numero;

    private String ippValue;

    private SQL sql = null;
    
    private String typeIPP;

    public IPP() {

        this.compteur = 0;
        this.numero = "0000000";
    }
/**
 * constructeur du l'ipp en fonction de la date
 * @param date 
 */
    public IPP(Date date) {
        this.date = date;
        this.compteur = 0;
        try{
        sql = new SQL();
        }catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(A11_DMA.class.getName()).log(Level.SEVERE, null, ex);
        }
        ippValue = sql.dernierIPP();
        
        int n = 7;
        int length = ippValue.length();
        numero = ippValue.substring(length - n, length);
        
        numero = this.incrementerIPP(numero);
        
        typeIPP="dateType";
        
        
    }
    
    public IPP(String ipp){
        ippValue = ipp;
        typeIPP="stringType";
        
    }
/**
 * methode qui incremente l'ipp en fonction du masque de 7 digit
 * @param numero
 * @return 
 */
    public String incrementerIPP(String numero) {
        long compteur ;
        compteur = Integer.parseInt(numero);
         final int nbdigits = 7;
         NumberFormat nbf = NumberFormat.getNumberInstance();
          nbf.setMinimumIntegerDigits(nbdigits);
          nbf.setGroupingUsed(false);
           nbf.setMaximumIntegerDigits(nbdigits);
           
           String sformatee = nbf.format(compteur+1);
        return sformatee;

    }
/**
 * renvoie un affichage formate de l'ipp de type String
 * @return 
 */
    public String toString() {
        String toString = null;
        if (typeIPP.equals("dateType")){
        toString= date.formatAnneeString2digit() + numero;
        } else if (typeIPP.equals("stringType")){
            toString=ippValue;
        }
        return toString;
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

    public void stringToIPP(String ipp) {

    }

}
