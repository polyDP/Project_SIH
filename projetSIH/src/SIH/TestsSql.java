/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Baptiste-PC
 */
public class TestsSql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //IPP ipp = new IPP();
        Date date = new Date();
        date = date.dateJour();
        IPP ipp = new IPP(date);
        System.out.println(ipp.toString());
        //System.out.println(ipp.incrementerIPP("14000000"));
        //NumeroSejour numsej = new NumeroSejour("10050236");
        //System.out.println(numsej.toString());

        try {
            SQL sql = new SQL();
            //Patient patient = sql.rechercherPatient("Bano", "Delphine");
           // NumeroSejour numSej = sql.numeroSejourPatient(patient.getIpp());
           // sql.afficherTherapeutique(patient, numSej);
            //System.out.println(patient.getTraitmentPersonnel());
            
            //System.out.println(p.affichagePatient());
            for (int i = 0; i < 10; i++) {
                //System.out.println(sql.listePatient());
                //System.out.println(sql.rechercherPatient("Bano", "Delphine").getNom());
                //sql.listeMedecinPH();
                //System.out.println(sql.listeMedecinPH().get(i));
                //System.out.println(sql.listeHistoriqueSejourPatient(p));
                //System.out.println(sql.listePatientParMedecin(Services.Pediatrie));
                //System.out.println(sql.infoHistoriqueSejourPatient(p,new NumeroSejour("10050236")));
                //System.out.println(sql.listeInfirmiere().get(i));
                // System.out.println(sql.listeSecretaire().get(i));
                //System.out.println(Services.Pediatrie.toString());
                //System.out.println(sql.listeLitDispo(Services.Pediatrie));
              //  System.out.println(sql.listePrescriptionsMedecinPH(patient, numSej));

            }

        } catch (SQLException ex) {
            Logger.getLogger(TestsSql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TestsSql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TestsSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Date date = new Date(25, 03, 1995);
        //IPP ipp = new IPP(date);
        //System.out.println("ipp apres dernier SQL :" + ipp.toString());
    }

}
