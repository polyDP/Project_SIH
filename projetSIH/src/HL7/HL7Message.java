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
     public String admin(Patient p){ //ajouter ici le séjour quand ce sera implémenté
         String m = new String("MSH|^~\\&|Asclepios|Administration| IP|" + "numeros de séjour à ajouter"  + "|||ADT^A01|0001|P|2.3.1||||||8859/1||| ");
          m = m + "EVN||"+ "200501231408" +"||||200501231408|";
         m = m+"PID||||"+"ajouter le numéros de séjour"+ "|"+ p.getNom()+"^"+p.getPrenom()+"^^^^^L||"+"|" + this.SexeHL7(p)+"|||"+ p.getAdresse().getNumero()+
                 p.getAdresse().getRue()+"^^"+ p.getAdresse().getVille()+"^^"+p.getAdresse().getCodePostal()+"^100|||||||251|||||||||||||" ;
          m = m + "PV1||I|Service^" + p.getLocalisation().getNumero()+"^"+p.getLocalisation().getCote()+"||||"+ "007^DURAND^^^^DOCTEUR^L|001^WATSON^^^^DOCTEUR^L| 008^NOMDOCTEUR3^^^^DOCTEUR^L|MED|||||B6||NOMDOCTEUR4^^^^DOCTEUR^L||4444444F| |||||||||||||||||||||||||||||||A||"; 
          m = m + "ZFU|||||DECET1|200501231408|";   
      return m;
     }
     public String discharge(Patient P){
         return "";
     }
     public String premiereVisite(Patient P){
         return "";
     }
     
     public void afficher(HL7Message m){
         System.out.println(m.toString()); 
     }
    
}
