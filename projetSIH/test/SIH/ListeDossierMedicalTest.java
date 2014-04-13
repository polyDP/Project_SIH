/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SIH;

import java.util.ArrayList;
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
public class ListeDossierMedicalTest {
    
    public ListeDossierMedicalTest() {
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
     * Test of ajouterDossier method, of class ListeDossierMedical.
     */
    @Test
    public void testAjouterDossier() {
        System.out.println("ajouterDossier");
        DossierMedical dossiers = null;
        ListeDossierMedical instance = new ListeDossierMedical();
        instance.ajouterDossier(dossiers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listeDossierMedical method, of class ListeDossierMedical.
     */
    @Test
    public void testListeDossierMedical() {
        System.out.println("listeDossierMedical");
        Services s = null;
        ListeDossierMedical instance = new ListeDossierMedical();
        ArrayList<DossierMedical> expResult = null;
        ArrayList<DossierMedical> result = instance.listeDossierMedical(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDossierMedical method, of class ListeDossierMedical.
     */
    @Test
    public void testGetDossierMedical() {
        System.out.println("getDossierMedical");
        Services service = null;
        ListeDossierMedical instance = new ListeDossierMedical();
        DossierMedical expResult = null;
        DossierMedical result = instance.getDossierMedical(service);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDossierMedical method, of class ListeDossierMedical.
     */
    @Test
    public void testSetDossierMedical() {
        System.out.println("setDossierMedical");
        DossierMedical val = null;
        ListeDossierMedical instance = new ListeDossierMedical();
        instance.setDossierMedical(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
