/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BasesDonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Léa
 */
public class ConnectionBD {
     private Connection connexion;

    public void connecter() throws InstantiationException, IllegalAccessException {
        try {

            Class.forName(InfosDataBase.driver);

        } catch (ClassNotFoundException e) {
            System.out.println("Problème driver ODBC");
        }


        try {
            setConnexion(DriverManager.getConnection(InfosDataBase.database, InfosDataBase.login, InfosDataBase.password));
            System.out.println("Connexion établie");
        } catch (SQLException e) {
            System.out.println("Impossible de se connecter à la base");
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Impossible de se connecter à la base de données",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public ResultSet resultatRequete(String requete) throws SQLException {
        ResultSet resultats;
        Statement stmt = connexion.createStatement();
        resultats = stmt.executeQuery(requete);
        return resultats;
    }

    public PreparedStatement creerPreparedStatement(String requete) throws SQLException {
        PreparedStatement stmt = connexion.prepareStatement(requete);
        return stmt;
    }
}
