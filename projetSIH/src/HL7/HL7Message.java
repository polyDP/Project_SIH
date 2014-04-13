/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HL7;
import SIH.*;
/**
 *
 * @author indis_000
 */
public class HL7Message {
    Date DateSysteme;
    public HL7Message() {
        // rajouter comment mettre la date et l'heure du syst.
        
    }
     public String SexeHL7(Patient p){
         String m = new String("");
         if (p.getSexe()=="Feminin"){
            m="F";
         }
         else {
            if (p.getSexe()=="Masculin"){
                m="M";
            }
            else {
                m="U";
            }
         }
         return m;
     } 
     public String admin(Patient p, SejourPatient sp){ //ajouter ici le séjour quand ce sera implémenté
         String m = new String("MSH|^~\\&|Asclepios|Administration| IP|" + sp.getNumSej().toString()  + "|||ADT^A01|0001|P|2.3.1||||||8859/1||| ");
          m = m + "EVN||"+ "200501231408" +"||||200501231408|";
         m = m+"PID||||"+sp.getNumSej().toString()+ "|"+ p.getNom()+"^"+p.getPrenom()+"^^^^^L||"+"|" + this.SexeHL7(p)+"|||"+ p.getAdresse().getNumero()+
                 p.getAdresse().getRue()+"^^"+ p.getAdresse().getVille()+"^^"+p.getAdresse().getCodePostal()+"^100|||||||251|||||||||||||" ;
          m = m + "PV1||I|" + sp.getServicePat()+"^" + p.getLocalisation().getNumero()+"^"+p.getLocalisation().getCote()+"||||"+ sp.getMedResp().getId() +"^"+sp.getMedResp().getNom()+
                  "^^^"+sp.getMedResp().getFonction()+"^L|||MED|||||||||"+sp.getNumSej()+"| |||||||||||||||||||||||||||||||A||"; 
          m = m + "ZFU|||||"+sp.getServicePat()+"|"+sp.getDateEntree().formatAnneeString2digit()+sp.getDateEntree().formatMoisString()+sp.getDateEntree().getJour()+"|";//il manque l'heure et la minute d'entrée
      return m;
     }
     public String discharge(Patient p, SejourPatient sp){
         String m = new String("MSH|^~\\&|Asclepios|Administration| IP|" + sp.getNumSej().toString()  + "|||ADT^A03|0001|P|2.3.1||||||8859/1||| ");
          m = m + "EVN||"+ "200501231408" +"||||200501231408|";
         m = m+"PID||||"+sp.getNumSej().toString()+ "|"+ p.getNom()+"^"+p.getPrenom()+"^^^^^L||"+"|" + this.SexeHL7(p)+"|||"+ p.getAdresse().getNumero()+
                 p.getAdresse().getRue()+"^^"+ p.getAdresse().getVille()+"^^"+p.getAdresse().getCodePostal()+"^100|||||||251|||||||||||||" ;
          m = m + "PV1||I|" + sp.getServicePat()+"^" + p.getLocalisation().getNumero()+"^"+p.getLocalisation().getCote()+"||||"+ sp.getMedResp().getId() +"^"+sp.getMedResp().getNom()+
                  "^^^"+sp.getMedResp().getFonction()+"^L|||MED|||||||||"+sp.getNumSej()+"| |||||||||||||||||||||||||||||||A||"; 
          m = m + "ZFU|||||"+sp.getServicePat()+"|"+sp.getDateEntree().formatAnneeString2digit()+sp.getDateEntree().formatMoisString()+sp.getDateEntree().getJour()+"|";//il manque l'heure et la minute d'entrée
      return m;
     }     
     public void afficher(HL7Message m){
         System.out.println(m.toString()); 
     }
    
}
