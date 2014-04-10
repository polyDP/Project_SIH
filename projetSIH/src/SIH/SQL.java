/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

import BasesDonnees.ConnectionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Léa
 */
public class SQL {

    static ConnectionBD con;
    private int err;

    /**
     * @return the err
     */
    public int getErr() {
        return err;
    }

    /**
     * @param aErr the err to set
     */
    public void setErr(int aErr) {
        err = aErr;
    }

    public SQL() throws SQLException, InstantiationException, IllegalAccessException {

        con = new ConnectionBD();

        con.connecter();
        err=0;

    }

    public void ajouterPatientBD(Patient p) {
        try {

            String requete = "INSERT INTO donnee_personnelle(IPP,Sexe,Nom_P,Prenom_P,Date_Naissance,Num_Tel,Numero_Adresse,Nom_Rue,Code_Postal,Ville,Med_T,Etat_Dossier)"
                    + "Values (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, p.getIpp().getIpp());

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
err =1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void ajouterSejourPatientBD(Patient p, NumeroSejour numSej, Services s, MedecinPH m, Lit l) {
        try {
            String requete = "INSERT INTO nouveau_sejour(Num_Sejour,IPP,Date_Entree,Service_P,PH_Resp,Loca_P)"
                    + "Values (?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, numSej.getNumeroSejour());

            prepS.setObject(2, p.getIpp().getIpp());

            prepS.setObject(3, p.getDateAdmission().toString());

            prepS.setObject(4, s.name());

            prepS.setObject(5, m.getId());

            prepS.setObject(6, l.idLit());

            prepS.executeUpdate();

        } catch (SQLException e) {
err =1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ajouterMedecinPH(MedecinPH m) {
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
            err =1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ajouterInfirmiere(Infirmiere i) {
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
            err =1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ajouterPersonnelMedical(PersonnelMedical m) {
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
            err =1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

}
