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
        try {
            SQL sql = new SQL();
            //for(int i=0;i<5;i++){
               // System.out.println(sql.listePatient().get(i));
            //}
            sql.rechercherPatient("bat", "bour");
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