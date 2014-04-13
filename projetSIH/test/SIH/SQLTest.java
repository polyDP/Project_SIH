/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SIH;

import java.util.Vector;
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
public class SQLTest {
    
    public SQLTest() {
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
     * Test of ajouterPatientBD method, of class SQL.
     */
    @Test
    public void testAjouterPatientBD() {
        System.out.println("ajouterPatientBD");
        Patient p = null;
        SQL instance = new SQL();
        instance.ajouterPatientBD(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterSejourPatientBD method, of class SQL.
     */
    @Test
    public void testAjouterSejourPatientBD() {
        System.out.println("ajouterSejourPatientBD");
        Patient p = null;
        NumeroSejour numSej = null;
        Services s = null;
        MedecinPH m = null;
        String lit = "";
        SQL instance = new SQL();
        instance.ajouterSejourPatientBD(p, numSej, s, m, lit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterMedecinPHBD method, of class SQL.
     */
    @Test
    public void testAjouterMedecinPHBD() {
        System.out.println("ajouterMedecinPHBD");
        MedecinPH m = null;
        SQL instance = new SQL();
        instance.ajouterMedecinPHBD(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterInfirmiereBD method, of class SQL.
     */
    @Test
    public void testAjouterInfirmiereBD() {
        System.out.println("ajouterInfirmiereBD");
        Infirmiere i = null;
        SQL instance = new SQL();
        instance.ajouterInfirmiereBD(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterPersonnelMedicalBD method, of class SQL.
     */
    @Test
    public void testAjouterPersonnelMedicalBD() {
        System.out.println("ajouterPersonnelMedicalBD");
        PersonnelMedical m = null;
        SQL instance = new SQL();
        instance.ajouterPersonnelMedicalBD(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seConnecterSIH method, of class SQL.
     */
    @Test
    public void testSeConnecterSIH() {
        System.out.println("seConnecterSIH");
        String id = "";
        String motDePasse = "";
        SQL instance = new SQL();
        instance.seConnecterSIH(id, motDePasse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dernierIPP method, of class SQL.
     */
    @Test
    public void testDernierIPP() {
        System.out.println("dernierIPP");
        SQL instance = new SQL();
        String expResult = "";
        String result = instance.dernierIPP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechercherPatient method, of class SQL.
     */
    @Test
    public void testRechercherPatient() {
        System.out.println("rechercherPatient");
        String nom = "";
        String prenom = "";
        SQL instance = new SQL();
        Patient expResult = null;
        Patient result = instance.rechercherPatient(nom, prenom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechercherMedecin method, of class SQL.
     */
    @Test
    public void testRechercherMedecin() {
        System.out.println("rechercherMedecin");
        String nom = "";
        String prenom = "";
        SQL instance = new SQL();
        MedecinPH expResult = null;
        MedecinPH result = instance.rechercherMedecin(nom, prenom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listePatient method, of class SQL.
     */
    @Test
    public void testListePatient() {
        System.out.println("listePatient");
        SQL instance = new SQL();
        Vector<String> expResult = null;
        Vector<String> result = instance.listePatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listeMedecinPH method, of class SQL.
     */
    @Test
    public void testListeMedecinPH() {
        System.out.println("listeMedecinPH");
        SQL instance = new SQL();
        Vector<String> expResult = null;
        Vector<String> result = instance.listeMedecinPH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listeInfirmiere method, of class SQL.
     */
    @Test
    public void testListeInfirmiere() {
        System.out.println("listeInfirmiere");
        SQL instance = new SQL();
        Vector<String> expResult = null;
        Vector<String> result = instance.listeInfirmiere();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listeSecretaire method, of class SQL.
     */
    @Test
    public void testListeSecretaire() {
        System.out.println("listeSecretaire");
        SQL instance = new SQL();
        Vector<String> expResult = null;
        Vector<String> result = instance.listeSecretaire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listeHistoriqueSejourPatient method, of class SQL.
     */
    @Test
    public void testListeHistoriqueSejourPatient() {
        System.out.println("listeHistoriqueSejourPatient");
        Patient p = null;
        SQL instance = new SQL();
        Vector<String> expResult = null;
        Vector<String> result = instance.listeHistoriqueSejourPatient(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHistoriqueSejourPatient method, of class SQL.
     */
    @Test
    public void testInfoHistoriqueSejourPatient() {
        System.out.println("infoHistoriqueSejourPatient");
        Patient p = null;
        String numSej = "";
        SQL instance = new SQL();
        String expResult = "";
        String result = instance.infoHistoriqueSejourPatient(p, numSej);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listeLitDispo method, of class SQL.
     */
    @Test
    public void testListeLitDispo() {
        System.out.println("listeLitDispo");
        Services s = null;
        SQL instance = new SQL();
        Vector<String> expResult = null;
        Vector<String> result = instance.listeLitDispo(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listePHparService method, of class SQL.
     */
    @Test
    public void testListePHparService() {
        System.out.println("listePHparService");
        Services s = null;
        SQL instance = new SQL();
        Vector<String> expResult = null;
        Vector<String> result = instance.listePHparService(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErr method, of class SQL.
     */
    @Test
    public void testGetErr() {
        System.out.println("getErr");
        SQL instance = new SQL();
        int expResult = 0;
        int result = instance.getErr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setErr method, of class SQL.
     */
    @Test
    public void testSetErr() {
        System.out.println("setErr");
        int err = 0;
        SQL instance = new SQL();
        instance.setErr(err);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnexion method, of class SQL.
     */
    @Test
    public void testGetConnexion() {
        System.out.println("getConnexion");
        SQL instance = new SQL();
        String expResult = "";
        String result = instance.getConnexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConnexion method, of class SQL.
     */
    @Test
    public void testSetConnexion() {
        System.out.println("setConnexion");
        String connexion = "";
        SQL instance = new SQL();
        instance.setConnexion(connexion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPm method, of class SQL.
     */
    @Test
    public void testGetPm() {
        System.out.println("getPm");
        SQL instance = new SQL();
        PersonnelMedical expResult = null;
        PersonnelMedical result = instance.getPm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPm method, of class SQL.
     */
    @Test
    public void testSetPm() {
        System.out.println("setPm");
        PersonnelMedical pm = null;
        SQL instance = new SQL();
        instance.setPm(pm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
