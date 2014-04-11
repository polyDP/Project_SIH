/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

import BasesDonnees.ConnectionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Léa
 */
public class SQL {

    static ConnectionBD con;
    private int err;
    private String connexion;

    public SQL() throws SQLException, InstantiationException, IllegalAccessException {

        con = new ConnectionBD();

        con.connecter();
        err = 0;

    }

    public void ajouterPatientBD(Patient p) {
        try {

            String requete = "INSERT INTO donnee_personnelle(IPP,Sexe,Nom_P,Prenom_P,Date_Naissance,Num_Tel,Numero_Adresse,Nom_Rue,Code_Postal,Ville,Med_T,Etat_Dossier)"
                    + "Values (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, p.getIpp().toString());

            prepS.setObject(2, p.getSexe());

            prepS.setObject(3, p.getNom());

            prepS.setObject(4, p.getPrenom());

            prepS.setObject(5, p.getDateNaissance().toString());

            prepS.setObject(6, p.getTelephone());

            prepS.setObject(7, p.getAdresse().getNumero());

            prepS.setObject(8, p.getAdresse().getRue());

            prepS.setObject(9, p.getAdresse().getCodePostal());

            prepS.setObject(10, p.getAdresse().getVille());

            prepS.setObject(11, p.getNomMedecinTraitant());

            prepS.setObject(12, p.getEtatDossier());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void ajouterSejourPatientBD(Patient p, NumeroSejour numSej, Services s, MedecinPH m, Lit l) {
        try {
            String requete = "INSERT INTO nouveau_sejour(Num_Sejour,IPP,Date_Entree,Service_P,PH_Resp,Loca_P)"
                    + "Values (?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, numSej.getNumeroSejour());

            prepS.setObject(2, p.getIpp().toString());

            prepS.setObject(3, p.getDateAdmission().toString());

            prepS.setObject(4, s.name());

            prepS.setObject(5, m.getId());

            prepS.setObject(6, l.idLit());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ajouterMedecinPHBD(MedecinPH m) {
        try {
            String requete = "INSERT INTO personnel(ID_PH,Nom_PH,Prenom_PH,Mdp_PH,Service,Fonction_PH)"
                    + "Values (?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, m.getId());

            prepS.setObject(2, m.getNom());

            prepS.setObject(3, m.getPrenom());

            prepS.setObject(4, m.getMotDePasse());

            prepS.setObject(5, m.getServices());

            prepS.setObject(6, m.getFonction());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ajouterInfirmiereBD(Infirmiere i) {
        try {
            String requete = "INSERT INTO personnel(ID_PH,Nom_PH,Prenom_PH,Mdp_PH,Service,Fonction_PH)"
                    + "Values (?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, i.getId());

            prepS.setObject(2, i.getNom());

            prepS.setObject(3, i.getPrenom());

            prepS.setObject(4, i.getMotDePasse());

            prepS.setObject(5, i.getServices());

            prepS.setObject(6, i.getFonction());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ajouterPersonnelMedicalBD(PersonnelMedical m) {
        try {
            String requete = "INSERT INTO personnel(ID_PH,Nom_PH,Prenom_PH,Mdp_PH,Service,Fonction_PH)"
                    + "Values (?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, m.getId());

            prepS.setObject(2, m.getNom());

            prepS.setObject(3, m.getPrenom());

            prepS.setObject(4, m.getMotDePasse());

            prepS.setObject(5, m.getServices());

            prepS.setObject(6, m.getFonction());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void seConnecterSIH(String id, String motDePasse) {
        String requete = "SELECT * FROM personnel";
        
        try {
            boolean boucle = true;
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            
            while (result.next()) {
                
                if (result.getString("ID_PH").equals(id)) {
                   
                    boucle = false;
                    if (result.getString("Mdp_PH").equals(motDePasse)) {
                        if (result.getString("Fonction_PH").equals("PH") | result.getString("Fonction_PH").equals("Interne")) {
                            connexion ="PH";
                        }
                        if (result.getString("Fonction_PH").equals("Secretaire")) {
                           connexion="Secretaire";
                        }
                        if (result.getString("Fonction_PH").equals("Infirmier")) {
                            connexion="Infirmier";
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Mot de passe incorrect",
                                "Erreur", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            if (boucle) {
                JOptionPane.showMessageDialog(null, "Identifiant incorrect",
                        "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String dernierIPP() {
        String ippValue = null;
        String requete = "SELECT MAX(IPP) FROM donnee_personnelle";
        
        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {
                System.out.println(result.getString("MAX(IPP)"));
           ippValue = result.getString("MAX(IPP)");
            }
            
        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return ippValue;
    }
    
    public Patient rechercherPatient(String nom,String prenom){
        
        String ippValue=null;
        String sexe=null;
        String dateNaissance=null;
        String numTel=null;
        String numAdresse=null;
        String nomRue=null;
        String codePostal=null;
        String ville=null;
        String medecinTraitant=null;
        int jour=0;
        int mois=0;
        int annee=0;       
        
        String requete = "SELECT * FROM donnee_personnelle WHERE Nom_P = '"+nom+"' AND Prenom_P = '"+prenom+"'";
        
        try {  
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {
                
           ippValue = result.getString("IPP");
               
           sexe = result.getString("sexe");
           dateNaissance = result.getString("Date_Naissance");
                
           numTel = result.getString("Num_Tel");
           numAdresse = result.getString("Numero_Adresse");
           nomRue = result.getString("Nom_Rue");
           codePostal = result.getString("Code_Postal");
           ville = result.getString("ville");
           medecinTraitant = result.getString("Med_T");
           
            }
            
        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        Adresse adresse = new Adresse(numAdresse,nomRue,codePostal,ville);
        
        jour = Integer.parseInt(dateNaissance.substring(0, 2));
        mois = Integer.parseInt(dateNaissance.substring(3, 5));
        annee= Integer.parseInt(dateNaissance.substring(6,10));
        
        Date date = new Date(jour,mois,annee);
        
        IPP ipp = new IPP(ippValue);
        
        Patient patient = new Patient(nom,prenom,numTel,medecinTraitant,sexe,date,adresse);
        patient.setIpp(ipp);
        return patient;
    }
    
    public Vector<String> listePatient(){
        Vector<String> listePatient = new Vector<>();
        String nomPrenom;
        String requete = "SELECT * FROM donnee_personnelle ORDER BY Nom_P";
        try {  
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {
                
           nomPrenom = result.getString("Nom_P");
           nomPrenom = nomPrenom +" "+ result.getString("Prenom_P");
           listePatient.add(nomPrenom);
            }
            
        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listePatient;
    }
    
    /**
     * @return the err
     */
    public int getErr() {
        return err;
    }

    /**
     * @param err the err to set
     */
    public void setErr(int err) {
        err = err;
    }

    /**
     * @return the connexion
     */
    public String getConnexion() {
        return connexion;
    }

    /**
     * @param connexion the connexion to set
     */
    public void setConnexion(String connexion) {
        this.connexion = connexion;
    }

}
