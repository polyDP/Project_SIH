/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BasesDonnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ludivine
 */
public class ConnectionBDTest {
    
    public ConnectionBDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of connecter method, of class ConnectionBD.
     */
    @Test
    public void testConnecter() throws Exception {
        System.out.println("connecter");
        ConnectionBD instance = new ConnectionBD();
        instance.connecter();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnexion method, of class ConnectionBD.
     */
    @Test
    public void testGetConnexion() {
        System.out.println("getConnexion");
        ConnectionBD instance = new ConnectionBD();
        Connection expResult = null;
        Connection result = instance.getConnexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConnexion method, of class ConnectionBD.
     */
    @Test
    public void testSetConnexion() {
        System.out.println("setConnexion");
        Connection connexion = null;
        ConnectionBD instance = new ConnectionBD();
        instance.setConnexion(connexion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resultatRequete method, of class ConnectionBD.
     */
    @Test
    public void testResultatRequete() throws Exception {
        System.out.println("resultatRequete");
        String requete = "";
        ConnectionBD instance = new ConnectionBD();
        ResultSet expResult = null;
        ResultSet result = instance.resultatRequete(requete);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerPreparedStatement method, of class ConnectionBD.
     */
    @Test
    public void testCreerPreparedStatement() throws Exception {
        System.out.println("creerPreparedStatement");
        String requete = "";
        ConnectionBD instance = new ConnectionBD();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.creerPreparedStatement(requete);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fermerConnexionDataBase method, of class ConnectionBD.
     */
    @Test
    public void testFermerConnexionDataBase() throws Exception {
        System.out.println("fermerConnexionDataBase");
        ConnectionBD instance = new ConnectionBD();
        instance.fermerConnexionDataBase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
