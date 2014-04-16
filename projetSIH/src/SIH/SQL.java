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
import java.util.ArrayList;
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
    private Infirmiere infirmiere;
    private Administratif administratif;
    private MedecinPH medecinPH;
    private SqlToLog sqlToLog;

    public SQL() throws SQLException, InstantiationException, IllegalAccessException {

        con = new ConnectionBD();

        con.connecter();
        err = 0;
        sqlToLog = new SqlToLog();

    }

    public void ajouterPatientBD(Patient p, Administratif adm) {
        try {

            String requete = "INSERT INTO donnee_personnelle(IPP,Sexe,Nom_P,Prenom_P,Date_Naissance,Num_Tel,Numero_Adresse,Nom_Rue,Code_Postal,Ville,Med_T)"
                    + "Values (?,?,?,?,?,?,?,?,?,?,?)";
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

            prepS.executeUpdate();

            sqlToLog.ajouterPatientBDlog(p, adm);

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void ajouterSejourPatientBD(Patient p, NumeroSejour numSej, Services s, MedecinPH m, String lit, Administratif adm) {
        try {
            String requete = "INSERT INTO nouveau_sejour(Num_Sejour,IPP,Date_Entree,Service_P,PH_Resp,Loca_P,Etat_Dossier)"
                    + "Values (?,?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, numSej.toString());

            prepS.setObject(2, p.getIpp().toString());

            prepS.setObject(3, p.getDateAdmission().toString());

            prepS.setObject(4, s.toString());

            prepS.setObject(5, m.getId());

            prepS.setObject(6, lit);

            prepS.setObject(7, "Ouvert");

            prepS.executeUpdate();
            sqlToLog.ajouterSejourPatientBDlog(p, adm);

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ajouterMedecinPHBD(MedecinPH m) {
        try {
            String requete = "INSERT INTO personnel(ID_PH,Nom_PH,Prenom_PH,Mdp_PH,Service_PH,Fonction_PH)"
                    + "Values (?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, m.getId());

            prepS.setObject(2, m.getNom());

            prepS.setObject(3, m.getPrenom());

            prepS.setObject(4, m.getMotDePasse());

            prepS.setObject(5, m.getServices().toString());

            prepS.setObject(6, m.getFonction());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ajouterInfirmiereBD(Infirmiere i) {
        try {
            String requete = "INSERT INTO personnel(ID_PH,Nom_PH,Prenom_PH,Mdp_PH,Service_PH,Fonction_PH)"
                    + "Values (?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, i.getId());

            prepS.setObject(2, i.getNom());

            prepS.setObject(3, i.getPrenom());

            prepS.setObject(4, i.getMotDePasse());

            prepS.setObject(5, i.getServices().toString());

            prepS.setObject(6, i.getFonction());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ajouterPersonnelMedicalBD(PersonnelMedical m) {
        try {
            String requete = "INSERT INTO personnel(ID_PH,Nom_PH,Prenom_PH,Mdp_PH,Service_PH,Fonction_PH)"
                    + "Values (?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, m.getId());

            prepS.setObject(2, m.getNom());

            prepS.setObject(3, m.getPrenom());

            prepS.setObject(4, m.getMotDePasse());

            prepS.setObject(5, m.getServices().toString());

            prepS.setObject(6, m.getFonction());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void seConnecterSIH(String id, String motDePasse) {
        String requete = "SELECT * FROM personnel";
        Services service = null;
        try {
            boolean boucle = true;
            ResultSet result = con.resultatRequete(requete);

            while (result.next()) {

                if (result.getString("ID_PH").equals(id)) {
                    boucle = false;
                    if (result.getString("Mdp_PH").equals(motDePasse)) {
                        if (result.getString("Fonction_PH").equals("PH") || result.getString("Fonction_PH").equals("Interne")) {
                            connexion = "PH";
                            medecinPH = new MedecinPH(result.getString("ID_PH"), result.getString("Nom_PH"), result.getString("Prenom_PH"), result.getString("Fonction_PH"), service.valueOf(result.getString("Service_PH")));
                            sqlToLog.connexionPersonnel(medecinPH);
                        }
                        if (result.getString("Fonction_PH").equals("PH") && result.getString("Service_PH").equals(service.Anesthesie.toString())) {
                            connexion = "Anesthesie";
                            medecinPH = new MedecinPH(result.getString("ID_PH"), result.getString("Nom_PH"), result.getString("Prenom_PH"), result.getString("Fonction_PH"), service.valueOf(result.getString("Service_PH")));
                            sqlToLog.connexionPersonnel(medecinPH);
                        }
                        if (result.getString("Fonction_PH").equals("PH") && result.getString("Service_PH").equals(service.Imagerie.toString()) || result.getString("Fonction_PH").equals("PH") && result.getString("Service_PH").equals(service.Biologie.toString())) {

                            connexion = "MedicoTech";
                            medecinPH = new MedecinPH(result.getString("ID_PH"), result.getString("Nom_PH"), result.getString("Prenom_PH"), result.getString("Fonction_PH"), service.valueOf(result.getString("Service_PH")));
                            sqlToLog.connexionPersonnel(medecinPH);
                        }
                        if (result.getString("Fonction_PH").equals("Secretaire")) {
                            connexion = "Secretaire";
                            administratif = new Administratif(result.getString("ID_PH"), result.getString("Mdp_PH"), result.getString("Nom_PH"), result.getString("Prenom_PH"), result.getString("Fonction_PH"), service.valueOf(result.getString("Service_PH")));
                            sqlToLog.connexionPersonnel(administratif);
                        }
                        if (result.getString("Fonction_PH").equals("Infirmier")) {
                            connexion = "Infirmier";
                            infirmiere = new Infirmiere(result.getString("ID_PH"), result.getString("Mdp_PH"), result.getString("Nom_PH"), result.getString("Prenom_PH"), result.getString("Fonction_PH"), service.valueOf(result.getString("Service_PH")));
                            sqlToLog.connexionPersonnel(infirmiere);
                        }
                        if (result.getString("Fonction_PH").equals("DIM")) {
                            connexion = "DIM";
                            administratif = new Administratif(result.getString("ID_PH"), result.getString("Mdp_PH"), result.getString("Nom_PH"), result.getString("Prenom_PH"), result.getString("Fonction_PH"), service.valueOf(result.getString("Service_PH")));
                            sqlToLog.connexionPersonnel(administratif);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Mot de passe incorrect",
                                "Erreur", JOptionPane.ERROR_MESSAGE);
                        err = 1;
                    }
                }
            }

            if (boucle) {
                con.fermerConnexionDataBase();
                JOptionPane.showMessageDialog(null, "Identifiant incorrect",
                        "Erreur", JOptionPane.ERROR_MESSAGE);
                err = 1;

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
                ippValue = result.getString("MAX(IPP)");
            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return ippValue;
    }

    public String dernierNumeroSejour() {
        String numSejourValue = null;
        String requete = "SELECT MAX(Num_Sejour) FROM nouveau_sejour";

        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {
                numSejourValue = result.getString("MAX(Num_Sejour)");

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }

        return numSejourValue;
    }

    public Patient rechercherPatient(String nom, String prenom, Personnel personnel) {

        String ippValue = null;
        String sexe = null;
        String dateNaissance = null;
        String numTel = null;
        String numAdresse = null;
        String nomRue = null;
        String codePostal = null;
        String ville = null;
        String medecinTraitant = null;
        int jour = 0;
        int mois = 0;
        int annee = 0;

        String requete = "SELECT * FROM donnee_personnelle WHERE Nom_P = '" + nom + "' AND Prenom_P = '" + prenom + "'";

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
        Adresse adresse = new Adresse(numAdresse, nomRue, codePostal, ville);

        jour = Integer.parseInt(dateNaissance.substring(0, 2));
        mois = Integer.parseInt(dateNaissance.substring(3, 5));
        annee = Integer.parseInt(dateNaissance.substring(6, 10));

        Date date = new Date(jour, mois, annee);

        IPP ipp = new IPP(ippValue);

        Patient patient = new Patient(nom, prenom, numTel, medecinTraitant, sexe, date, adresse);
        patient.setIpp(ipp);
        sqlToLog.RecherchePatientBDlog(patient, personnel);
        return patient;
    }

    public MedecinPH rechercherMedecin(String nom, String prenom) {

        String idPH = null;
        Services service = null;
        String fonction = null;

        String requete = "SELECT * FROM personnel WHERE Nom_PH = '" + nom + "' AND Prenom_PH = '" + prenom + "'";

        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                idPH = result.getString("ID_PH");

                service = service.valueOf(result.getString("Service_PH"));
                fonction = result.getString("Fonction_PH");

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }

        MedecinPH medecin = new MedecinPH(idPH, nom, prenom, fonction, service);

        return medecin;
    }

    public Vector<String> listePatient(boolean etatDossier) {
        Vector<String> listePatient = new Vector<>();
        String nomPrenomDateNaissance;
        if (etatDossier) {
            String requete = "SELECT DISTINCT Nom_P,Prenom_P,Date_Naissance FROM donnee_personnelle,nouveau_sejour,personnel WHERE Etat_Dossier = 'Ouvert' ORDER BY Nom_P";
            try {
                PreparedStatement prepS = con.creerPreparedStatement(requete);
                ResultSet result = con.resultatRequete(requete);
                while (result.next()) {

                    nomPrenomDateNaissance = result.getString("Nom_P");
                    nomPrenomDateNaissance = nomPrenomDateNaissance + " " + result.getString("Prenom_P");
                    nomPrenomDateNaissance = nomPrenomDateNaissance + " " + result.getString("Date_Naissance");

                    listePatient.add(nomPrenomDateNaissance);
                }

            } catch (SQLException e) {
                err = 1;
                JOptionPane.showMessageDialog(null, e,
                        "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        } else {

            String requete = "SELECT * FROM donnee_personnelle ORDER BY Nom_P";
            try {
                PreparedStatement prepS = con.creerPreparedStatement(requete);
                ResultSet result = con.resultatRequete(requete);
                while (result.next()) {

                    nomPrenomDateNaissance = result.getString("Nom_P");
                    nomPrenomDateNaissance = nomPrenomDateNaissance + " " + result.getString("Prenom_P");
                    nomPrenomDateNaissance = nomPrenomDateNaissance + " " + result.getString("Date_Naissance");

                    listePatient.add(nomPrenomDateNaissance);
                }

            } catch (SQLException e) {
                err = 1;
                JOptionPane.showMessageDialog(null, e,
                        "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        return listePatient;
    }

    public Vector<String> listePatientParService(Services s) {
        Vector<String> listePatientDuMedecin = new Vector<>();
        String NomPrenomPatient;

        String requete = "SELECT * FROM donnee_personnelle,nouveau_sejour,personnel WHERE donnee_personnelle.IPP = nouveau_sejour.IPP AND personnel.ID_PH = nouveau_sejour.PH_Resp AND personnel.Service_PH = nouveau_sejour.Service_P AND Service_P = '" + s.toString() + "' AND Etat_Dossier = 'Ouvert' ORDER BY Nom_P";
        try {
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                NomPrenomPatient = result.getString("Nom_P");
                NomPrenomPatient = NomPrenomPatient + " " + result.getString("Prenom_P");

                listePatientDuMedecin.add(NomPrenomPatient);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listePatientDuMedecin;
    }

    public Vector<String> listePatientAnesthesie() {
        Vector<String> listePatientDAnesth = new Vector<>();
        String NomPrenomPatient;

        String requete = "SELECT Nom_P,Prenom_P,Num_Sejour,Service_P,Service_PH,Etat_Dossier\n"
                + "FROM donnee_personnelle,nouveau_sejour,personnel \n"
                + "WHERE donnee_personnelle.IPP=nouveau_sejour.IPP AND personnel.ID_PH=nouveau_sejour.PH_Resp \n"
                + "AND personnel.Service_PH = nouveau_sejour.Service_P \n"
                + "AND Service_P IN (SELECT Nom_Service FROM service WHERE Nom_Service ='Anesthesie_Reanimation' OR 'Chirurgie')\n"
                + "AND Etat_Dossier='ouvert'\n"
                + "ORDER BY Nom_P;";
        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                NomPrenomPatient = result.getString("Nom_P");
                NomPrenomPatient = NomPrenomPatient + " " + result.getString("Prenom_P");

                listePatientDAnesth.add(NomPrenomPatient);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listePatientDAnesth;

    }

    public Vector<String> listeMedecinPH() {
        Vector<String> listeMedecinPH = new Vector<>();
        String nomPrenomFonction;

        String requete = "SELECT * FROM personnel WHERE Fonction_PH = 'PH' OR Fonction_PH = 'Interne' ORDER BY Nom_PH";
        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                nomPrenomFonction = result.getString("Nom_PH");
                nomPrenomFonction = nomPrenomFonction + " " + result.getString("Prenom_PH");
                nomPrenomFonction = nomPrenomFonction + " - " + result.getString("Service_PH");
                listeMedecinPH.add(nomPrenomFonction);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listeMedecinPH;
    }

    public Vector<String> listeInfirmiere() {
        Vector<String> listeMedecinPH = new Vector<>();
        String nomPrenomFonction;

        String requete = "SELECT * FROM personnel WHERE Fonction_PH = 'Infirmier' ORDER BY Nom_PH";
        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                nomPrenomFonction = result.getString("Nom_PH");
                nomPrenomFonction = nomPrenomFonction + " " + result.getString("Prenom_PH");
                nomPrenomFonction = nomPrenomFonction + " - " + result.getString("Service_PH");
                listeMedecinPH.add(nomPrenomFonction);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listeMedecinPH;
    }

    public Vector<String> listeSecretaire() {
        Vector<String> listeMedecinPH = new Vector<>();
        String nomPrenomFonction;

        String requete = "SELECT * FROM personnel WHERE Fonction_PH = 'Secretaire' ORDER BY Nom_PH";
        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                nomPrenomFonction = result.getString("Nom_PH");
                nomPrenomFonction = nomPrenomFonction + " " + result.getString("Prenom_PH");
                nomPrenomFonction = nomPrenomFonction + " - " + result.getString("Service_PH");
                listeMedecinPH.add(nomPrenomFonction);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listeMedecinPH;
    }

    public Vector<String> listeHistoriqueSejourPatient(Patient p) {
        Vector<String> listeHistoriqueSejourPatient = new Vector<>();
        String numSejEtatDossier;

        String requete = "SELECT nouveau_sejour.IPP,nouveau_sejour.Num_Sejour,Etat_Dossier FROM nouveau_sejour,donnee_personnelle WHERE donnee_personnelle.IPP = nouveau_sejour.IPP AND donnee_personnelle.IPP='" + p.getIpp().toString() + "'";

        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                numSejEtatDossier = result.getString("Num_Sejour");

                numSejEtatDossier = numSejEtatDossier + " " + result.getString("Etat_Dossier");
                listeHistoriqueSejourPatient.add(numSejEtatDossier);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listeHistoriqueSejourPatient;
    }

    public NumeroSejour numeroSejourPatient(IPP ipp) {
        NumeroSejour numSej = null;
        String requete = "SELECT Num_Sejour FROM nouveau_sejour WHERE Etat_Dossier = 'Ouvert' AND nouveau_sejour.IPP = '" + ipp.toString() + "'";

        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {
                numSej = new NumeroSejour(result.getString("Num_Sejour"));
            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return numSej;
    }

    public String getLettreSortiePatient(NumeroSejour numSej) {

        String lettreSortie = null;

        String requete = "SELECT Lettre_Sortie FROM nouveau_sejour,lettre_sortie,personnel\n"
                + "WHERE lettre_sortie.Num_Sejour = nouveau_sejour.Num_Sejour \n"
                + "AND nouveau_sejour.Num_Sejour ='" + numSej.toString() + "'";
        try {
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                lettreSortie = result.getString("Lettre_Sortie");

            }
        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);

        }

        try {
            lettreSortie.equalsIgnoreCase(null);

        } catch (NullPointerException npe) {

            lettreSortie = "Pas de lettre de sortie";
        }

        return lettreSortie;
    }

    public void fermerDossierMedicalAdministratifPatientBD(NumeroSejour numSej, Administratif adm) {
        try {
            String requete = "UPDATE nouveau_sejour SET Etat_Dossier = ? WHERE Num_Sejour = ?";

            PreparedStatement prepS = con.creerPreparedStatement(requete);
            prepS.setString(1, "ferme");
            prepS.setObject(2, numSej.toString());
            prepS.executeUpdate();
            sqlToLog.fermerSejourPatientBDlog(null, adm);

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique contenant ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);
        }
    }

    public SejourPatient infoHistoriqueSejourPatient(Patient p, NumeroSejour numSej) {

        Date dateEntree = null;
        Services servicePat = null;
        Lit lit = null;
        boolean etatDossier = false;
        String lettreSortie = null;
        MedecinPH medecin = null;
        Services service = null;

        String requete = "SELECT * FROM nouveau_sejour,donnee_personnelle,personnel WHERE donnee_personnelle.IPP = nouveau_sejour.IPP AND donnee_personnelle.IPP='" + p.getIpp().toString() + "' AND nouveau_sejour.Num_Sejour = '" + numSej.toString() + "' AND personnel.ID_PH = nouveau_sejour.PH_Resp";

        try {

            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                dateEntree = new Date(result.getString("Date_Entree"));

                servicePat = servicePat.valueOf(result.getString("Service_P"));
                medecin = new MedecinPH(result.getString("ID_PH"), result.getString("Mdp_PH"), result.getString("Nom_PH"), result.getString("prenom_PH"), result.getString("Fonction_PH"), service.valueOf(result.getString("Service_PH")));

                lettreSortie = this.getLettreSortiePatient(numSej);

                lit = new Lit(result.getString("Loca_P"));
                System.out.println(lit.idLit());
                if (result.getString("Etat_Dossier").equals("Ouvert")) {
                    etatDossier = true;
                };

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        SejourPatient sejPat = new SejourPatient(p, numSej, dateEntree, servicePat, medecin, lit, etatDossier, lettreSortie);

        return sejPat;
    }

    public Vector<String> listeLitDispo(Services s) {
        Vector<String> listeLitDispo = new Vector<>();
        String lits;

        String requete = "SELECT Nom_du_Lit, Service_L \n"
                + "	FROM lit \n"
                + "	WHERE Service_L='" + s.toString() + "' \n"
                + "	AND Nom_du_Lit NOT IN (SELECT nouveau_sejour.Loca_P \n"
                + "							FROM nouveau_sejour \n"
                + "							WHERE Service_P='" + s.toString() + "'\n"
                + "							AND Etat_dossier ='ouvert')";
        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                lits = result.getString("Nom_du_lit");

                listeLitDispo.add(lits);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listeLitDispo;
    }

    public Vector<String> listePHparService(Services s) {
        Vector<String> listePHService = new Vector<>();
        String NomPrenomPH;

        String requete = "SELECT * FROM personnel WHERE Service_PH='" + s + "'AND Fonction_PH = 'PH' ORDER BY 'Nom_PH';";
        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                NomPrenomPH = result.getString("Nom_PH");
                NomPrenomPH = NomPrenomPH + " " + result.getString("Prenom_PH");

                listePHService.add(NomPrenomPH);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listePHService;
    }

    public void ajouterSoinsArrivee(Patient p, NumeroSejour ns, PersonnelMedical pm, Date dateJourCsteEnt, Constantes cste) {
        try {

            String requete = "INSERT INTO cste_ent(IPP,Num_Sejour,Acteur_Csent,Date_Csent,Taille_Ent,Poids_Ent,Temp_Ent,Tension_Ent,Glycemie_Ent,Autre_Soins_Ent)"
                    + "Values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, p.getIpp().toString());

            prepS.setObject(2, ns.toString());

            prepS.setObject(3, pm.getId());

            prepS.setObject(4, dateJourCsteEnt.toString());

            prepS.setObject(5, cste.getTaille());

            prepS.setObject(6, cste.getPoids());

            prepS.setObject(7, cste.getTemperature());

            prepS.setObject(8, cste.getTension());

            prepS.setObject(9, cste.getGlycemie());

            prepS.setObject(10, cste.getAutreSoins());

            prepS.executeUpdate();
            sqlToLog.premiereConstantesMedecinPatientBDlog(p, pm);

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void ajouterSoinsArriveeMiseAJour(Patient p, NumeroSejour ns, PersonnelMedical pm, Date dateJourCsteEnt, Constantes cste) {
        try {

            String requete = "UPDATE cste_ent SET Acteur_Csent = ? , Date_Csent = ? , Taille_Ent = ? , Poids_Ent = ? , Temp_Ent = ? , Tension_Ent = ? , Glycemie_Ent = ? , Autre_Soins_Ent = ? WHERE Num_Sejour = ? AND IPP = ?";

            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, pm.getId());

            prepS.setObject(2, dateJourCsteEnt.toString());

            prepS.setObject(3, cste.getTaille());

            prepS.setObject(4, cste.getPoids());

            prepS.setObject(5, cste.getTemperature());

            prepS.setObject(6, cste.getTension());

            prepS.setObject(7, cste.getGlycemie());

            prepS.setObject(8, cste.getAutreSoins());

            prepS.setObject(9, ns.toString());

            prepS.setObject(10, p.getIpp().toString());

            prepS.executeUpdate();
            sqlToLog.premiereConstantesMedecinPatientBDlog(p, pm);

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public Constantes getConstantesInitialesPatientSejour(Patient p, NumeroSejour numSej) {
        Constantes constantes;
        constantes = null;
        String requete = "SELECT * FROM cste_ent WHERE IPP = '" + p.getIpp().toString() + "' AND Num_Sejour = '" + numSej.toString() + "'";

        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {
                int taille = Integer.parseInt(result.getString("Taille_Ent"));
                double poids = Double.parseDouble(result.getString("Poids_Ent"));
                double temperature = Double.parseDouble(result.getString("Temp_Ent"));
                String tension = result.getString("Tension_Ent");
                double glycemie = Double.parseDouble(result.getString("Glycemie_Ent"));
                String autres = result.getString("Autre_Soins_Ent");
                constantes = new Constantes(taille, poids, tension, glycemie, temperature, autres);
            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return constantes;
    }

    public void ajouterLettreSortie(Patient p, NumeroSejour ns, PersonnelMedical pm, Date dateJourCsteEnt, String lettre) {
        try {

            String requete = "INSERT INTO lettre_sortie(IPP,Num_Sejour,Med_Ls,Date_Sortie,Lettre_Sortie)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, p.getIpp().toString());

            prepS.setObject(2, ns.toString());

            prepS.setObject(3, pm.getId());

            prepS.setObject(4, dateJourCsteEnt.toString());

            prepS.setObject(5, lettre);

            prepS.executeUpdate();
            sqlToLog.ajouterLettreSortiePatientBDlog(p, pm);

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void ajouterObservationAnesthesie(Patient p, NumeroSejour ns, PersonnelMedical pm, String dateJourHeureObs, String observation) {
        try {

            String requete = "INSERT INTO lettre_sortie(IPP,Num_Sejour,Anesthesiste,Date_Heure_Anest,Obs_anest)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, p.getIpp().toString());

            prepS.setObject(2, ns.toString());

            prepS.setObject(3, pm.getId());

            prepS.setObject(4, dateJourHeureObs);

            prepS.setObject(5, observation);

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void ajouterPrescriptionPH(Patient p, NumeroSejour ns, PersonnelMedical pm, String dateJourHeurePresc, String prescription) {
        try {

            String requete = "INSERT INTO prescription(IPP,Num_Sejour,Med_Prescri,Date_Heure_Prescri,Champs_prescription)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, p.getIpp().toString());

            prepS.setObject(2, ns.toString());

            prepS.setObject(3, pm.getId());

            prepS.setObject(4, dateJourHeurePresc);

            prepS.setObject(5, prescription);

            prepS.executeUpdate();

            sqlToLog.ajouterPrescriptionPatientBDlog(p, pm);

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public Vector<String> listePrescriptionsMedecinPH(Patient p, NumeroSejour numSej) {
        Vector<String> listePrescriptionMedecinPH = new Vector<>();
        String dateNomPrenomService;

        String requete = "SELECT * FROM prescription, personnel WHERE IPP = '" + p.getIpp().toString() + "'  AND Num_Sejour = '" + numSej.toString() + "' AND Med_Prescri = ID_PH";
        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                dateNomPrenomService = result.getString("Date_Heure_Prescri");
                dateNomPrenomService = dateNomPrenomService + " " + result.getString("Nom_PH");
                dateNomPrenomService = dateNomPrenomService + " " + result.getString("Prenom_PH");
                dateNomPrenomService = dateNomPrenomService + " - " + result.getString("Service_PH");
                listePrescriptionMedecinPH.add(dateNomPrenomService);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listePrescriptionMedecinPH;
    }

    public Vector<String> listeObservationsMedecinPH(Patient p, NumeroSejour numSej) {
        Vector<String> listePrescriptionMedecinPH = new Vector<>();
        String dateNomPrenomService;

        String requete = "SELECT * FROM obs_ph, personnel WHERE IPP = '" + p.getIpp().toString() + "'  AND Num_Sejour = '" + numSej.toString() + "' AND PH_Resp = ID_PH";
        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                dateNomPrenomService = result.getString("Date_Heure_Obs");
                dateNomPrenomService = dateNomPrenomService + " " + result.getString("Nom_PH");
                dateNomPrenomService = dateNomPrenomService + " " + result.getString("Prenom_PH");
                dateNomPrenomService = dateNomPrenomService + " - " + result.getString("Service_PH");
                listePrescriptionMedecinPH.add(dateNomPrenomService);

            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listePrescriptionMedecinPH;
    }

    public void ajouterObservationPH(Patient p, NumeroSejour ns, PersonnelMedical pm, String dateJourHeureObs, String observation) {
        try {

            String requete = "INSERT INTO obs_ph(IPP,Num_Sejour,PH_Resp,Date_Heure_Obs,Observations)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, p.getIpp().toString());

            prepS.setObject(2, ns.toString());

            prepS.setObject(3, pm.getId());

            prepS.setObject(4, dateJourHeureObs);

            prepS.setObject(5, observation);

            prepS.executeUpdate();

            sqlToLog.ajouterOperationPatientBDlog(p, pm);

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public String getPrescriptionsPatient(Patient p, NumeroSejour numSej, String dateHeurPrescri) {

        String prescription = null;

        String requete = "SELECT * FROM prescription, personnel WHERE IPP = '" + p.getIpp().toString() + "'  AND Num_Sejour = '" + numSej.toString() + "' AND Med_Prescri = ID_PH AND Date_Heure_Prescri = '" + dateHeurPrescri + "'";

        try {
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                prescription = result.getString("Champs_prescription");

            }
        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);

        }

        return prescription;
    }

    public ArrayList<String> getLogBD() {

        ArrayList<String> listeLog;
        listeLog = new ArrayList<>();
        String log;

        String requete = "SELECT * FROM tracer";

        try {
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                log = "ID du log : " + result.getString("ID_log") + "\n";
                log = log + "Date et Heure : " + result.getString("Date_heure") + "\n";
                log = log + "Action : " + result.getString("Methode") + "\n";
                log = log + "ID du PH : " + result.getString("ID_PH") + "\n";
                log = log + "patient : " + result.getString("IPP") + "\n          -----          \n";
                
                listeLog.add(log);
            }
        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);

        }

        return listeLog;
    }

    public void ajouterTherapeutique(Patient p, NumeroSejour ns) {
        try {

            String requete = "INSERT INTO therapeutique(IPP,Num_Sejour,Ttmt_Perso,Allergie,Regime_Alimentaire)"
                    + "Values (?,?,?,?,?)";
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, p.getIpp().toString());

            prepS.setObject(2, ns.toString());

            prepS.setObject(3, p.getTraitmentPersonnel());

            prepS.setObject(4, p.getAllergies());

            prepS.setObject(5, p.getRegimeAlimentaire());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void ajouterTherapeutiqueMiseAJour(Patient p, NumeroSejour ns) {
        try {

            String requete = "UPDATE therapeutique SET Ttmt_Perso = ? , Allergie = ? , Regime_Alimentaire = ? WHERE Num_Sejour = ? AND IPP = ?";

            PreparedStatement prepS = con.creerPreparedStatement(requete);

            prepS.setObject(1, p.getTraitmentPersonnel());

            prepS.setObject(2, p.getAllergies());

            prepS.setObject(3, p.getRegimeAlimentaire());

            prepS.setObject(4, ns.toString());

            prepS.setObject(5, p.getIpp().toString());

            prepS.executeUpdate();

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e + "\n Une erreur est survenue lors de l'ajout à la base de donnees, contactez un responsable technique avec ce message d'erreur", "Erreur Bases de données", JOptionPane.ERROR_MESSAGE);

        }
    }

    public Patient afficherTherapeutique(Patient p, NumeroSejour ns) {

        String ttmtPerso = null;
        String allergie = null;
        String regimeAl = null;

        String requete = "SELECT * FROM donnee_personnelle, nouveau_sejour, therapeutique WHERE donnee_personnelle.IPP = nouveau_sejour.IPP AND donnee_personnelle.IPP = therapeutique.IPP AND nouveau_sejour.Num_Sejour='" + ns.toString() + "'";

        try {
            PreparedStatement prepS = con.creerPreparedStatement(requete);

            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                ttmtPerso = result.getString("Ttmt_Perso");
                allergie = result.getString("Allergie");
                regimeAl = result.getString("Regime_Alimentaire");
                p.setAllergies(allergie);
                p.setRegimeAlimentaire(regimeAl);
                p.setTraitmentPersonnel(ttmtPerso);
            }

        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }

        return p;
    }

    public String getObservationsPatient(Patient p, NumeroSejour numSej, String dateHeurPrescri) {

        String prescription = null;

        String requete = "SELECT * FROM obs_ph, personnel WHERE IPP = '" + p.getIpp().toString() + "'  AND Num_Sejour = '" + numSej.toString() + "' AND PH_Resp = ID_PH AND Date_Heure_Obs = '" + dateHeurPrescri + "'";

        try {
            ResultSet result = con.resultatRequete(requete);
            while (result.next()) {

                prescription = result.getString("Observations");

            }
        } catch (SQLException e) {
            err = 1;
            JOptionPane.showMessageDialog(null, e,
                    "Erreur", JOptionPane.ERROR_MESSAGE);

        }

        return prescription;
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

    /**
     * @return the medecinPH
     */
    public MedecinPH getMedecinPH() {
        return medecinPH;
    }

    /**
     * @param medecinPH the medecinPH to set
     */
    public void setMedecinPH(MedecinPH medecinPH) {
        this.medecinPH = medecinPH;
    }

    /**
     * @return the infirmiere
     */
    public Infirmiere getInfirmiere() {
        return infirmiere;
    }

    /**
     * @param infirmiere the infirmiere to set
     */
    public void setInfirmiere(Infirmiere infirmiere) {
        this.infirmiere = infirmiere;
    }

    /**
     * @return the administratif
     */
    public Administratif getAdministratif() {
        return administratif;
    }

    /**
     * @param administratif the administratif to set
     */
    public void setAdministratif(Administratif administratif) {
        this.administratif = administratif;
    }

}
