/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BasesDonnees;

import java.sql.SQLException;
/**
 *
 * @author Léa
 */
public class BasesDonnees {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException  {
        
        ConnectionBD bd = new ConnectionBD();
        bd.connecter();
    }
    
}
