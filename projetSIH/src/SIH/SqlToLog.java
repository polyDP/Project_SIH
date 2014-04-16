/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

import BasesDonnees.ConnectionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Baptiste-PC
 */
public class SqlToLog {

    static ConnectionBD con;
    private int err;
    private String connexion;
    private Infirmiere infirmiere;
    private Administratif administratif;
    private MedecinPH medecinPH;
    private String dateHeureJour;

    /**
     * classe permettant d'ajouter des logs a la base de donnee
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public SqlToLog() throws SQLException, InstantiationException, IllegalAccessException {
        Date dateJour = new Date();
        dateJour = dateJour.dateJour();
        Calendar calendrier = Calendar.getInstance();
        dateHeureJour = dateJour + " " + calendrier.get(Calendar.HOUR_OF_DAY) + ":" + calendrier.get(Calendar.MINUTE) + ":" + calendrier.get(Calendar.SECOND);
        con = new ConnectionBD();

        con.connecter();
        err = 0;

    }
/**
 *  requete log lors de la connexion d'un personnel
 * @param p 
 */
    public void connexionPersonnel(Personnel p) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, p.getId().toString());

            prepS.setObject(4, "connexion");

            prepS.setObject(5, "pas d'IPP");

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    //Ajout des log pour chaque recherche de patient
    /**
     * Envoie d'un log lors de la recherche du patient par la secrétaire
     * médicale
     */
    public void recherchePatientBDlog(Patient p, Administratif s) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, s.getId().toString());

            prepS.setObject(4, "recherche patient numero");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * Envoie d'un log lors de la recherche du patient par le médecin,
     * l'anesthésiste *ou le personnel médico-technique
     */
    public void RecherchePatientBDlog(Patient p, Personnel pers) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                   + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, pers.getId().toString());

            prepS.setObject(4, "Recherche du patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }
/**
     * Envoie d'un log lors de l'ajout d'un nouveau Séjour pour le patient
     */
    public void ajouterPatientBDlog(Patient p, Administratif adm) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                   + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, adm.getId().toString());

            prepS.setObject(4, "creation d'un nouveau patient");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }
   

    /**
     * Envoie d'un log lors de l'ajout d'un nouveau Séjour pour le patient
     */
    public void ajouterSejourPatientBDlog(Patient p, Administratif adm) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                   + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, adm.getId().toString());

            prepS.setObject(4, "Ajout d'un nouveau séjour au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * Envoie d'un log lors de la fermeture d'un séjour
     */
    public void fermerSejourPatientBDlog(Patient p, Administratif s) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                   + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, s.getId().toString());

            prepS.setObject(4, "Fermeture du séjour du patient ");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

//Création des log lors des transformations apportées par l'infirmière
    /**
     * Envoie d'un log lors de l'ajout d'un soin par l'infirmière
     */
    public void ajouterSoinInfirmierPatientBDlog(Patient p, Infirmiere i) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (NULL,NOW(),?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(3, i.getId().toString());

            prepS.setObject(4, "Ajout d'un nouveau soin au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

  

    
//Création des log lors de toutes les opérations réalisées par le médecin l'anestésiste ou le médico-technique

    /**
     * Envoie d'un log lors de l'ajout d'un soin par le médecin l'anestésiste ou
     * le médico-technique
     */
    public void ajouterSoinMedecinPatientBDlog(Patient p, PersonnelMedical pm) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, pm.getId().toString());

            prepS.setObject(4, "Ajout d'un nouveau soin au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * Envoie d'un log lors de l'ajout d'un soin par le médecin l'anestésiste ou
     * le médico-technique
     */
    public void premiereConstantesMedecinPatientBDlog(Patient p, PersonnelMedical pm) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, pm.getId().toString());

            prepS.setObject(4, "Ajout des première constantes au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * Envoie d'un log lors de l'ajout d'une opération par le médecin
     * l'anestésiste ou le médico-technique
     */
    public void ajouterOperationPatientBDlog(Patient p, PersonnelMedical pm) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, pm.getId().toString());

            prepS.setObject(4, "Ajout d'une nouvelle opération au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * Envoie d'un log lors de l'ajout d'une prescription par le médecin
     * l'anestésiste ou le médico-technique
     */

    public void ajouterPrescriptionPatientBDlog(Patient p, PersonnelMedical pm) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, pm.getId().toString());

            prepS.setObject(4, "Ajout d'une nouvelle prescription au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * Envoie d'un log lors de l'ajout d'une observation par le médecin
     * l'anestésiste ou le médico-technique
     */

    public void ajouterObservationPatientBDlog(Patient p, MedecinPH m) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, m.getId().toString());

            prepS.setObject(4, "Ajout d'une nouvelle observation au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * Envoie d'un log lors de l'ajout d'une lettre de sortie par le médecin
     * l'anestésiste ou le médico-technique
     */

    public void ajouterLettreSortiePatientBDlog(Patient p, PersonnelMedical m) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, m.getId().toString());

            prepS.setObject(4, "Ajout de la lettre de sortie au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * Envoie d'un log lors de l'ajout d'un résultat par le médico-technique
     */

    public void ajouterResultatsPatientBDlog(Patient p, MedecinPH m) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, m.getId().toString());

            prepS.setObject(4, "Ajout d'un nouveau résultat au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    /**
     * Envoie d'un log lors de l'ajout d'une opération par l'anestésiste
     */
    public void ajouterCRPatientBDlog(Patient p, MedecinPH m) {
        try {

            String requete = "INSERT INTO Tracer(ID_log,Date_heure,ID_PH,Methode,IPP)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, null);
            
            prepS.setObject(2, dateHeureJour);

            prepS.setObject(3, m.getId().toString());

            prepS.setObject(4, "Ajout d'un compte-rendu d'anesthésie au patient numéro");

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

}
