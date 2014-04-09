/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

import BasesDonnees.ConnectionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Léa
 */

public class SQL {
    static ConnectionBD con;


   /* public SQL() {
        try{
        con = new ConnectionBD();
        con.connecter();
        } 
        catch(SQLException e) {
            System.out.println("ca marche pas");
        }
        throw(SQLException)e ;
    }

    public void ajouterPatientBD(Patient p) {
        try {
            NouvelleAdmission admi = new NouvelleAdmission();

            String requete = "SELECT * FROM APP.PATIENTS where NOMUSUEL like '" + nom + "' AND"
                    + " PRENOM like '" + prenom + "' AND DATENAISSANCE like '" + date + "'";

            try {
                ResultSet result = con.resultatRequete(requete);
                while (result.next()) {
                    admi.usuel.setText(result.getString("NOMUSUEL"));
                    admi.nom.setText(result.getString("NOMNAISSANCE"));
                    admi.prenom.setText(result.getString("PRENOM"));
                    admi.sexe.setText(result.getString("SEXE"));
                    admi.lieu.setText(result.getString("LIEUNAISSANCE"));
                    admi.medT.setText(result.getString("NOMMT"));
                    admi.secu.setText(result.getString("NUMSECU"));
                    admi.adresse.setText(result.getString("ADRESSE"));
                    admi.tel.setText(result.getString("NUMTELEPHONE"));
                    admi.naissance.setText(result.getString("DATENAISSANCE"));
                    admi.IPP.setText(result.getString("IPP"));

                }
            } catch (SQLException e) {
                //JOptionPane.showMessageDialog(null, e,
                //"Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }*/
}
